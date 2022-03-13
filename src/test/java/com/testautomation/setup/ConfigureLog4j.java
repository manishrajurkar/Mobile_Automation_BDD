package com.testautomation.setup;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConfigureLog4j {

    Logger logger;

    public void log4jSetup() {

        logger = LogManager.getLogger(ConfigureLog4j.class.getName());
        logger.info("log4j is running successfully");


    }
}
