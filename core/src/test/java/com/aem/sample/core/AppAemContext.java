/*******************************************************************************
 * Copyright 2016 Adobe Systems Incorporated
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
 ******************************************************************************/
package com.aem.sample.core;

import io.wcm.testing.mock.aem.junit.AemContext;
import io.wcm.testing.mock.aem.junit.AemContextCallback;
import org.apache.sling.testing.mock.sling.ResourceResolverType;

import java.io.IOException;

public class AppAemContext {

    public static final String CONTENT_ROOT = "/content/sample";
    public static final String CONF_ROOT = "/conf/sample/settings";

    private AppAemContext() {
        // only static methods
    }

    public static AemContext newAemContext() {
        return new AemContext(new SetUpCallback(), ResourceResolverType.RESOURCERESOLVER_MOCK);
    }

    private static final class SetUpCallback implements AemContextCallback {

        @Override
        public void execute(AemContext context) throws IOException {
            context.addModelsForPackage("com.aem.sample.core.models");
            context.load().json("/sample-conf.json", CONF_ROOT);
            context.load().json("/sample-contentv1.json", CONTENT_ROOT);
        }
    }
}
