package com.idi.idiinfrastarter;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Evgeny Borisov
 */

public class IdiLogger {

    @Autowired
    private InfraProperties infraProperties;

    public void info(String str) {
        if (infraProperties.isInfo()) {
            System.out.println("idi info: " + str);
        }
    }

    public void debug(String str) {
        if (infraProperties.isDebug()) {
            System.out.println("idi debug: " + str);
        }
    }


}
