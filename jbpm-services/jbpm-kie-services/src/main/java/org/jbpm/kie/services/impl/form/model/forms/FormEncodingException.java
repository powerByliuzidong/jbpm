/*
 * Copyright 2011 JBoss Inc
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
package org.jbpm.kie.services.impl.form.model.forms;

public class FormEncodingException extends Exception {

    private static final long serialVersionUID = 1113435107260639779L;

    public FormEncodingException() {
        super();
    }

    public FormEncodingException(String message, Throwable cause) {
        super(message, cause);
    }

    public FormEncodingException(String message) {
        super(message);
    }

    public FormEncodingException(Throwable cause) {
        super(cause);
    }
}
