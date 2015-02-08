/*
 * Copyright 2014 The Sculptor Project Team, including the original 
 * author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.xmdlab.cartridge.common.util;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

public final class FileHelper {
	
	private static final Logger LOG = LoggerFactory.getLogger(FileHelper.class);
	
	/**
	 * 
	 * @param path
	 * @return
	 */
	public static String readFile(String path) {
		return readFile(new File(path));
	}
	
	/**
	 * 
	 * @param file
	 * @return
	 */
	public static String readFile(File file) {
		try {
			return Files.toString(file, Charsets.UTF_8);
		} catch (IOException e) {
			LOG.error("Unable to read file content from file " + file, e);
			return null;
		}
	}

	/**
	 * Accommodate Windows bug: If the delete does not work, call
	 * <code>System.gc()</code>, wait a little and try again.
	 */
	public static boolean deleteFile(File file) throws IOException {
		if (file.isDirectory()) {
			throw new IOException("File " + file + " isn't a file.");
		}
		if (!file.delete()) {
			if (System.getProperty("os.name").equalsIgnoreCase("windows")) {
				file = file.getCanonicalFile();
				System.gc();
			}
			try {
				Thread.sleep(10);
				return file.delete();
			} catch (InterruptedException ex) {
				return file.delete();
			}
		}
		return true;
	}

}
