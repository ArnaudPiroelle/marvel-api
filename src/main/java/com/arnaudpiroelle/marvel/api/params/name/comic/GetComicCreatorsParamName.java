/**
 * Copyright (C) 2014 Arnaud Piroelle (contact@arnaudpiroelle.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.arnaudpiroelle.marvel.api.params.name.comic;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum GetComicCreatorsParamName {
    /**
     * Description: Filter by creator first name (e.g. brian).
     * Parameter type: query
     * Data type: string
     */
    FIRSTNAME("firstName"),

    /**
     * Description: Filter by creator middle name (e.g. Michael).
     * Parameter type: query
     * Data type: string
     */
    MIDDLENAME("middleName"),

    /**
     * Description: Filter by creator last name (e.g. Bendis).
     * Parameter type: query
     * Data type: string
     */
    LASTNAME("lastName"),

    /**
     * Description: Filter by suffix or honorific (e.g. Jr., Sr.).
     * Parameter type: query
     * Data type: string
     */
    SUFFIX("suffix"),

    /**
     * Description: Filter by creator names that match critera (e.g. B, St L).
     * Parameter type: query
     * Data type: string
     */
    NAME_STARTS_WITH("nameStartsWith"),

    /**
     * Description: Filter by creator first names that match critera (e.g. B, St L).
     * Parameter type: query
     * Data type: string
     */
    FIRSTNAME_STARTS_WITH("firstNameStartsWith"),

    /**
     * Description: Filter by creator middle names that match critera (e.g. Mi).
     * Parameter type: query
     * Data type: string
     */
    MIDDLENAME_STARTS_WITH("middleNameStartsWith"),

    /**
     * Description: Filter by creator last names that match critera (e.g. Ben).
     * Parameter type: query
     * Data type: string
     */
    LASTNAME_STARTS_WITH("lastNameStartsWith"),

    /**
     * Description: Return only creators which have been modified since the specified date.
     * Parameter type: query
     * Data type: Date
     */
    MODIFIED_SINCE("modifiedSince"),

    /**
     * Description: Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).
     * Parameter type: query
     * Data type: int
     */
    COMICS("comics"),

    /**
     * Description: Return only creators who worked on the specified series (accepts a comma-separated list of ids).
     * Parameter type: query
     * Data type: int
     */
    SERIES("series"),

    /**
     * Description: Return only creators who worked on the specified stories (accepts a comma-separated list of ids).
     * Parameter type: query
     * Data type: int
     */
    STORIES("stories"),

    /**
     * Description: Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * Parameter type: query
     * Data type: string
     */
    ORDER_BY("orderBy"),

    /**
     * Description: Limit the result set to the specified number of resources.
     * Parameter type: query
     * Data type: int
     */
    LIMIT("limit"),

    /**
     * Description: Skip the specified number of resources in the result set.
     * Parameter type: query
     * Data type: int
     */
    OFFSET("offset");

    private String label;

    private GetComicCreatorsParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
