package org.ton.musicmanager.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Collection;

/**
 * User: AKazakov
 * Date: 23.11.2013 23:10
 */
public class LoggerHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerHelper.class);

    public void logNewFiles(Collection<File> files) {
        int size = files.size();
        LOGGER.debug("There are {} new files", size);

        if (size > 0)
            logFiles(files);
    }

    public void logFilesToDelete(Collection<File> files) {
        int size = files.size();
        LOGGER.debug("{} files will be deleted", files.size());

        if (size > 0)
            logFiles(files);
    }

    public void logFiles(Collection<File> files) {
        LOGGER.debug("===>");
        for (File file : files) {
            LOGGER.debug(file.getAbsolutePath());
        }
        LOGGER.debug("<===");
    }
}
