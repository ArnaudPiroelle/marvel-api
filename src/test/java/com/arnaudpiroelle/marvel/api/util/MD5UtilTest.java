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