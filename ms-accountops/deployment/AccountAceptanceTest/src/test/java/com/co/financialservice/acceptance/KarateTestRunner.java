package com.co.financialservice.acceptance;

import com.intuit.karate.junit5.Karate;

class KarateTestRunner {
    @Karate.Test
    Karate testAll() {
        return Karate.run("classpath:client").relativeTo(getClass());
    }
}