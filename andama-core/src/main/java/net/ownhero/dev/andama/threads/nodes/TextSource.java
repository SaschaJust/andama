/***********************************************************************************************************************
 * Copyright 2011 Kim Herzig, Sascha Just
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 **********************************************************************************************************************/
package net.ownhero.dev.andama.threads.nodes;

import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

import net.ownhero.dev.andama.threads.Group;
import net.ownhero.dev.andama.threads.Source;
import net.ownhero.dev.hiari.settings.Settings;

/**
 * The Class TextSource.
 * 
 * @author Sascha Just <sascha.just@st.cs.uni-saarland.de>
 */
public class TextSource extends Source<String> {
	
	/**
	 * Instantiates a new text source.
	 * 
	 * @param threadGroup
	 *            the thread group
	 * @param settings
	 *            the settings
	 * @param parallelizable
	 *            the parallelizable
	 * @param file
	 *            the file
	 */
	public TextSource(final Group threadGroup, final Settings settings, final boolean parallelizable, final File file) {
		super(threadGroup, settings, parallelizable);
		// TODO process File
		// FILE (txt, zip, gz, bz2, 7z, tar)
		addHooks();
	}
	
	/**
	 * Instantiates a new text source.
	 * 
	 * @param threadGroup
	 *            the thread group
	 * @param settings
	 *            the settings
	 * @param parallelizable
	 *            the parallelizable
	 * @param stream
	 *            the stream
	 */
	public TextSource(final Group threadGroup, final Settings settings, final boolean parallelizable,
	        final InputStream stream) {
		super(threadGroup, settings, parallelizable);
		// TODO process stream
		addHooks();
	}
	
	/**
	 * Instantiates a new text source.
	 * 
	 * @param threadGroup
	 *            the thread group
	 * @param settings
	 *            the settings
	 * @param parallelizable
	 *            the parallelizable
	 * @param uri
	 *            the uri
	 */
	public TextSource(final Group threadGroup, final Settings settings, final boolean parallelizable, final URI uri) {
		super(threadGroup, settings, parallelizable);
		// TODO process URI
		// HTTP, HTTPS, FTP, FTPS, FILE
		addHooks();
	}
	
	/**
	 * Instantiates a new text source.
	 * 
	 * @param threadGroup
	 *            the thread group
	 * @param settings
	 *            the settings
	 * @param parallelizable
	 *            the parallelizable
	 * @param url
	 *            the url
	 */
	public TextSource(final Group threadGroup, final Settings settings, final boolean parallelizable, final URL url) {
		super(threadGroup, settings, parallelizable);
		// TODO process URL
		// HTTP, HTTPS, FTP, FTPS, FILE
		addHooks();
	}
	
	/**
	 * Adds the hooks.
	 */
	private void addHooks() {
		// stub
	}
	
	/**
	 * Check availability.
	 * 
	 * @param url
	 *            the url
	 * @return true, if successful
	 */
	@SuppressWarnings ("unused")
	private boolean checkAvailability(final URL url) {
		return true;
	}
	
}
