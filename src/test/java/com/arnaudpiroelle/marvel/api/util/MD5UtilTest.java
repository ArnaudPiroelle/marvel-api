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
package com.arnaudpiroelle.marvel.api.util;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class MD5UtilTest {

    @Test
    public void should_compute_hash_md5() throws Exception {
        String hash = MD5Util.hash("publicApiKey", "privateApiKey", "1234567890");
        assertThat(hash).isEqualTo("d9ba88ffa4eee61acc5b58f71b7d4727");
    }
}