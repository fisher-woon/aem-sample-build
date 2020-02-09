/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2017 Adobe
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
package com.aem.sample.core.models.impl;

import com.aem.sample.core.models.HeaderItem;
import com.day.cq.wcm.api.Page;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.sling.api.SlingHttpServletRequest;

import java.util.Collections;
import java.util.List;

public class HeaderItemImpl extends PageListItemImpl implements HeaderItem {

    protected List<HeaderItem> children = Collections.emptyList();
    protected int level;
    protected boolean active;

    public HeaderItemImpl(Page page, boolean active, SlingHttpServletRequest request, int level, List<HeaderItem> children) {
        super(request, page);
        this.active = active;
        this.level = level;
        this.children = children;
    }

    @Override
    @JsonIgnore
    @Deprecated
    public Page getPage() {
        return page;
    }

    @Override
    public boolean isActive() {
        return active;
    }

    @Override
    public List<HeaderItem> getChildren() {
        return children;
    }

    @Override
    public int getLevel() {
        return level;
    }

}
