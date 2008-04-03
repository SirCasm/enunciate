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

package org.codehaus.enunciate.template.strategies.rest;

import net.sf.jelly.apt.TemplateException;
import net.sf.jelly.apt.TemplateModel;
import org.codehaus.enunciate.contract.rest.RESTNoun;
import org.codehaus.enunciate.template.strategies.EnunciateTemplateLoopStrategy;

import java.util.Iterator;

/**
 * Strategy for looping through each REST endpoint.
 *
 * @author Ryan Heaton
 */
public class RESTNounLoopStrategy extends EnunciateTemplateLoopStrategy<RESTNoun> {

  private String var = "noun";

  protected Iterator<RESTNoun> getLoop(TemplateModel model) throws TemplateException {
    return getModel().getNounsToRESTMethods().keySet().iterator();
  }

  @Override
  protected void setupModelForLoop(TemplateModel model, RESTNoun endpoint, int index) throws TemplateException {
    super.setupModelForLoop(model, endpoint, index);

    if (this.var != null) {
      getModel().setVariable(var, endpoint);
    }
  }

  /**
   * The variable into which to store the current REST endpoint.
   *
   * @return The variable into which to store the current REST endpoint.
   */
  public String getVar() {
    return var;
  }

  /**
   * The variable into which to store the current REST endpoint.
   *
   * @param var The variable into which to store the current REST endpoint.
   */
  public void setVar(String var) {
    this.var = var;
  }
}
