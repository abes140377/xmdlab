package com.blogspot.babdev.bookapi.integration;

import com.blogspot.babdev.bookapi.arquillian.AppManagerResourceSpringDeployment;
import com.blogspot.babdev.bookapi.model.Author;
import com.blogspot.babdev.bookapi.model.Book;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URL;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 
 * @author seba
 *
 */
@RunWith(Arquillian.class)
public class BookApiIntegrationTest {

	@ArquillianResource
	URL deploymentURL;

	private final RestTemplate restTemplate = new RestTemplate();

	private final String authorsUrl = "http://localhost:8080/authors";
	private final String booksUrl = "http://localhost:8080/books";

	@Deployment(testable = false)
	public static WebArchive createDeployment() {
		return AppManagerResourceSpringDeployment
				.createResourceSpringDeployment();
	}

	@Test
	public void testCreateBookWithAuthor() throws Exception {
		final URI authorUri = restTemplate.postForLocation(authorsUrl,
				sampleAuthor()); // create Author

		final URI bookUri = new URI(booksUrl + "/" + sampleBookIsbn);

		// create Book linked to Author
		restTemplate.put(bookUri, sampleBook(authorUri.toString()));

		Resource<Book> book = getBook(bookUri);
		assertNotNull(book);

		final URI authorsOfBookUri = new URI(book.getLink("books.Book.authors")
				.getHref());
		Resource<List<Resource<Author>>> authors = getAuthors(authorsOfBookUri);
		assertNotNull(authors.getContent());

		// check if /books/0132350882/authors contains an author
		assertFalse(authors.getContent().isEmpty());
	}

	private String sampleAuthor() {
		return "{\"name\":\"Robert C. Martin\"}";
	}

	private final String sampleBookIsbn = "0132350882";

	private String sampleBook(String authorUrl) {
		return "{\"title\":\"Clean Code\",\"authors\":[{\"rel\":\"authors\",\"href\":\""
				+ authorUrl + "\"}]}";
	}

	private Resource<Book> getBook(URI uri) {
		return restTemplate.exchange(uri, HttpMethod.GET, null,
				new ParameterizedTypeReference<Resource<Book>>() {
				}).getBody();
	}

	private Resource<List<Resource<Author>>> getAuthors(URI uri) {
		return restTemplate
				.exchange(
						uri,
						HttpMethod.GET,
						null,
						new ParameterizedTypeReference<Resource<List<Resource<Author>>>>() {
						}).getBody();
	}
}
