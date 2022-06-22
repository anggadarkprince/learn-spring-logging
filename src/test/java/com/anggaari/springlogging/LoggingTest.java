package com.anggaari.springlogging;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@Slf4j
@TestPropertySource("classpath:application-test.properties")
public class LoggingTest {

    @Test
    void testLog() {
        log.info("Learn java");
        log.warn("Learn spring");
        log.error("Learn angga ari wijaya");
    }

    @Test
    void testLongLogging() {
        for (int i = 0; i < 100000; i++) {
            log.warn("Log counter " + i);
        }
    }
}
