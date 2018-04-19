package com.db.edu.logger;

public class LoggerController {
    private LoggerSaver saver = new LoggerSaver();

    /**
     * @param message -> DDD: Domain Ubiquitous language first
     */
    public void log(String message) {
        saver.save(message);
    }
}
