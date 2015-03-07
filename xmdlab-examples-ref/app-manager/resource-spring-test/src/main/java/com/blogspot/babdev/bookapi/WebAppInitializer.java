package com.blogspot.babdev.bookapi;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends
		AbstractAnnotationConfigDispatcherServletInitializer {

	// @Override
	// protected Class<?>[] getRootConfigClasses() {
	// return new Class<?>[0];
	// }
	//
	// @Override
	// protected Class<?>[] getServletConfigClasses() {
	// return new Class<?>[] { WebAppConfig.class };
	// }
	//
	// @Override
	// protected String[] getServletMappings() {
	// return new String[] { "/" };
	// }
	//
	// @Configuration
	// @EnableWebMvc
	// // @ComponentScan("springweb.controller")
	// public static class WebAppConfig {
	// }

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { AppConfiguration.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { WebConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}
