package com.github.bhokumar.samplespringbootannotation

import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class SpringBootAnnotationConfig {
    def logger = LoggerFactory.getLogger(SpringBootAnnotationConfig)

    @Bean
    RestTemplate genericRestTemplate() {
        logger.info("Generic Rest template object being prepared");

        new RestTemplate()
    }
}
