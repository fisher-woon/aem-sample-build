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

package com.aem.sample.core.models;

import com.day.cq.wcm.api.Page;
import org.osgi.annotation.versioning.ConsumerType;

import java.util.List;

@ConsumerType
public interface HeaderItem extends ListItem {

    /**
     * Returns the {@link Page} contained by this navigation item.
     *
     * @return The {@link Page} contained in this navigation item.
     * @since com.adobe.cq.wcm.core.components.models 11.0.0; marked <code>default</code> in 12.1.0
     * @deprecated since 12.1.0 as {@link HeaderItem} relies on {@link ListItem}
     */
    @Deprecated
    default Page getPage() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns {@code true} if the page contained by this navigation item is active.
     *
     * @return {@code true} if it is the current page, otherwise {@code false}
     * @since com.adobe.cq.wcm.core.components.models 11.0.0; marked <code>default</code> in 12.1.0
     */
    default boolean isActive() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the children of this {@code NavigationItem}, if any.
     *
     * @return the children of this {@code NavigationItem}; if this {@code NavigationItem} doesn't have any children, the returned
     * {@link List} will be empty
     * @since com.adobe.cq.wcm.core.components.models 12.2.0
     */
    default List<HeaderItem> getChildren() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the depth level of this {@code NavigationItem}.
     *
     * @return the depth level
     * @since com.adobe.cq.wcm.core.components.models 12.2.0
     */
    default int getLevel() {
        throw new UnsupportedOperationException();
    }

}
