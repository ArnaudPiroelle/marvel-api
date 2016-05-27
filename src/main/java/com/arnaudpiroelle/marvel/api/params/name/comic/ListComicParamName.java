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
public enum ListComicParamName {

    /**
     * Description: Filter by the issue format (e.g. comic, digital comic, hardcover).
     * Parameter type: query
     * Data type: string
     */
    FORMAT("format"),

    /**
     * Description: Filter by the issue format type (comic or collection).
     * Parameter type: query
     * Data type: string
     */
    FORMAT_TYPE("formatType"),

    /**
     * Description: Exclude variants (alternate covers, secondary printings, director's cuts, etc.) from the result set.
     * Parameter type: query
     * Data type: boolean
     */
    NO_VARIANTS("noVariants"),

    /**
     * Description: Return comics within a predefined date range.
     * Parameter type: query
     * Data type: string
     */
    DATE_DESCRIPTOR("dateDescriptor"),

    /**
     * Description: Return comics within a predefined date range. Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02). Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.
     * Parameter type: query
     * Data type: string
     */
    DATE_RANGE("dateRange"),

    /**
     * Description: Filter by diamond code.
     * Parameter type: query
     * Data type: string
     */
    DIAMOND_CODE("diamondCode"),

    /**
     * Description: Filter by digital comic id.
     * Parameter type: query
     * Data type: int
     */
    DIGITAL_ID("digitalId"),

    /**
     * Description: Filter by UPC.
     * Parameter type: query
     * Data type: string
     */
    UPC("upc"),

    /**
     * Description: Filter by ISBN.
     * Parameter type: query
     * Data type: string
     */
    ISBN("isbn"),

    /**
     * Description: Filter by EAN.
     * Parameter type: query
     * Data type: string
     */
    EAN("ean"),

    /**
     * Description: Filter by ISSN.
     * Parameter type: query
     * Data type: string
     */
    ISSN("issn"),

    /**
     * Description: Include only results which are available digitally.
     * Parameter type: query
     * Data type: boolean
     */
    HAS_DIGITAL_ISSUE("hasDigitalIssue"),

    /**
     * Description: Return only comics which have been modified since the specified date.
     * Parameter type: query
     * Data type: Date
     */
    MODIFIED_SINCE("modifiedSince"),

    /**
     * Description: Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).
     * Parameter type: query
     * Data type: int
     */
    CREATORS("creators"),

    /**
     * Description: Return only comics which feature the specified characters (accepts a comma-separated list of ids).
     * Parameter type: query
     * Data type: int
     */
    CHARACTERS("characters"),

    /**
     * Description: Return only comics which are part of the specified series (accepts a comma-separated list of ids).
     * Parameter type: query
     * Data type: int
     */
    SERIES("series"),

    /**
     * Description: Return only comics which take place in the specified events (accepts a comma-separated list of ids).
     * Parameter type: query
     * Data type: int
     */
    EVENTS("events"),

    /**
     * Description: Return only comics which contain the specified stories (accepts a comma-separated list of ids).
     * Parameter type: query
     * Data type: int
     */
    STORIES("stories"),

    /**
     * Description: Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). Accepts a comma-separated list of ids.
     * Parameter type: query
     * Data type: int
     */
    SHARED_APPEARANCES("sharedAppearances"),

    /**
     * Description: Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). Accepts a comma-separated list of ids.
     * Parameter type: query
     * Data type: int
     */
    COLLABORATORS("collaborators"),

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
    OFFSET("offset"),


    /**
     * Description: the title of the comic desired
     */
    TITLE("title"),


    /**
     * Description: issue number desired
     */
    ISSUE_NUMBER("issueNumber");

    private String label;

    private ListComicParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
