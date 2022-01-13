package com.idi.idiinfrastarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ConditionalOnProperty(value = "idi.logging",havingValue = "true")
@EnableConfigurationProperties(InfraProperties.class)
public class IdiInfraConfig {
    @Bean
    public IdiLogger idiLogger(){
        return new IdiLogger();
    }

}
