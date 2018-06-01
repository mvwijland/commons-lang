/* Copyright 2018 Norconex Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.norconex.commons.lang.config;

import java.util.ArrayList;
import java.util.List;

/**
 * Runtime exception for configuration related issues.
 * @author Pascal Essiembre
 * @since 2.0.0
 */
public class ConfigurationValidationException extends ConfigurationException {

    private static final long serialVersionUID = 1L;
    
    private final List<ConfigurationValidationError> errors = new ArrayList<>();
    
    /**
     * Constructor.
     */
    public ConfigurationValidationException() {
        super();
    }

    /**
     * Constructor.
     * @param errors configuration errors (e.g. schema validation errors)
     */
    public ConfigurationValidationException(
            List<ConfigurationValidationError> errors) {
        super();
        this.errors.addAll(errors);
    }
    
    public List<ConfigurationValidationError> getErrors() {
        return errors;
    }
}