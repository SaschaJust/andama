/*******************************************************************************
 * Copyright 2012 Kim Herzig, Sascha Just
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 ******************************************************************************/

package net.ownhero.dev.andama.exceptions;

import java.util.Collection;
import java.util.List;

import net.ownhero.dev.ioda.Tuple;

public class TestContructorClass {
	
	public TestContructorClass(final Collection<String> collection, final int number,
	        final Tuple<List<Float>, Boolean> tuple) throws NoSuchConstructorError, Exception {
		// stub
	}
	
	public TestContructorClass(final Integer test) {
		// stub
	}
}