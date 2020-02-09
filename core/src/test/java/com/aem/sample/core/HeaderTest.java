/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2017 Adobe Systems Incorporated
 ~
 ~ Licensed under the Apache License, Version 2.0 (the "License");
 ~ you may not use this file except in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~     http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing, software
 ~ distributed under the License is distributed on an "AS IS" BASIS,
 ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ~ See the License for the specific language governing permissions and
 ~ limitations under the License.
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
package com.aem.sample.core;

import com.aem.sample.core.models.Header;
import com.aem.sample.core.models.HeaderItem;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.scripting.SlingBindings;
import org.apache.sling.servlethelpers.MockSlingHttpServletRequest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.adobe.cq.sightly.WCMBindings;
import com.adobe.granite.security.user.UserManagementService;
import com.day.cq.wcm.api.LanguageManager;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;

import io.wcm.testing.mock.aem.junit.AemContext;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class HeaderTest {

	@Rule
	public final AemContext context = AppAemContext.newAemContext();

	@Mock
	private UserManagementService ums;

	@Mock
	private LanguageManager languageManager;

	private Header header;

	@Before
	public void setup() {
		Page page = context.currentPage("/content/sample/en");
		PageManager pageManager = context.pageManager();
		// ResourceResolver resourceResolver = context.resourceResolver();
		Resource resource = context.currentResource();

		// This sets the page attribute injected in Header with @ScriptVariable
		SlingBindings slingBindings = (SlingBindings) context.request().getAttribute(SlingBindings.class.getName());
		slingBindings.put(WCMBindings.CURRENT_PAGE, page);
		slingBindings.put(WCMBindings.PAGE_MANAGER, pageManager);
		slingBindings.put(WCMBindings.PROPERTIES, resource.getValueMap());
		
		context.request().setResource(resource);
		//context.registerService(UserManagementService.class, ums);
		//context.registerService(LanguageManager.class, languageManager);

		MockSlingHttpServletRequest request = context.request();
		//header = request.adaptTo(Header.class);
	}

	@Test
	public void testHeaderList() {
		/*if(header != null && header.getItems() != null) {
			List<HeaderItem> getItems = header.getItems();
			Assert.assertFalse(getItems.isEmpty());
		}*/
	}

}
