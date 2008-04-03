/*
 * Copyright 2006-2008 Web Cohesion
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codehaus.enunciate.samples.docs.pckg3;

import org.codehaus.enunciate.rest.annotations.RESTEndpoint;
import org.codehaus.enunciate.rest.annotations.Verb;
import org.codehaus.enunciate.rest.annotations.VerbType;
import org.codehaus.enunciate.rest.annotations.ProperNoun;
import org.codehaus.enunciate.samples.docs.pckg1.BeanOne;

import javax.jws.WebService;

/**
 * <child>text</child>
 *
 * @author Ryan Heaton
 */
@WebService
@RESTEndpoint
public class RESTAndEI {

  /**
   * docs for getBeanOne
   *
   * @param id The id
   * @return The bean
   * that has the return
   * value one multiple lines
   * @sometag sometag value
   */
  @Verb (
    VerbType.read
  )
  public BeanOne getBeanOne(@ProperNoun String id) {
    return null;
  }
}
