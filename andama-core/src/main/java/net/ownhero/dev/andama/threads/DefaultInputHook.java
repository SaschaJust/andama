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
package net.ownhero.dev.andama.threads;

import net.ownhero.dev.andama.exceptions.UnrecoverableError;
import net.ownhero.dev.kisa.Logger;

/**
 * The Class DefaultInputHook.
 *
 * @param <K> the key type
 * @param <V> the value type
 * @author Sascha Just <sascha.just@st.cs.uni-saarland.de>
 */
public class DefaultInputHook<K, V> extends InputHook<K, V> {
	
	/**
	 * Instantiates a new default input hook.
	 *
	 * @param thread the thread
	 */
	public DefaultInputHook(final Node<K, V> thread) {
		super(thread);
	}
	
	/*
	 * (non-Javadoc)
	 * @see net.ownhero.dev.andama.threads.InputHook#input()
	 */
	/**
	 * {@inheritDoc}
	 * @see net.ownhero.dev.andama.threads.InputHook#input()
	 */
	@Override
	public void input() {
		try {
			getThread().readNext();
			
			if (Logger.logDebug()) {
				Logger.debug("Reading input data: " + getThread().getInputData());
			}
			
			setCompleted();
		} catch (final InterruptedException e) {
			throw new UnrecoverableError(e);
		}
	}
	
}
