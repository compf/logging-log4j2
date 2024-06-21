/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.log4j.builders.appender;
public class AppenderConfiguration {

    private String name;

    private Layout layout;

    private Filter filter;

    private String level;

    public String getName() {
        return name;
    }

    public Layout getLayout() {
        return layout;
    }

    public Filter getFilter() {
        return filter;
    }

    public String getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setLayout(Layout layout) {
        this.layout=layout;
    }

    public void setFilter(Filter filter) {
        this.filter=filter;
    }

    public void setLevel(String level) {
        this.level=level;
    }

    public AppenderConfiguration    (String name,Layout layout,Filter filter,String level){
        this.name    =    name;
        this.layout    =    layout;
        this.filter    =    filter;
        this.level    =    level;
}
}
