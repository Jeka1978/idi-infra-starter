package com.idi.idiinfrastarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Data
@ConfigurationProperties(prefix = "idi")
public class InfraProperties {

    private boolean logging;
    private boolean info;
    private boolean debug;
}
