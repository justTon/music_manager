package org.ton.musicmanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.ton.musicmanager.configuration.Config;
import org.ton.musicmanager.helper.MP3FilesHelper;
import org.ton.musicmanager.helper.LoggerHelper;

import java.io.File;
import java.util.List;

/**
 * User: AKazakov
 * Date: 23.11.2013 23:05
 */
public class CollectonSynchronizer {

    private static final Logger LOGGER = LoggerFactory.getLogger(CollectonSynchronizer.class);

    private MP3FilesHelper filesHelper;
    private LoggerHelper loggerHelper;

    public void setFilesHelper(MP3FilesHelper filesHelper) {
        this.filesHelper = filesHelper;
    }

    public void setLoggerHelper(LoggerHelper loggerHelper) {
        this.loggerHelper = loggerHelper;
    }


    public void synchronize(Config config) throws Exception {
        LOGGER.debug("Start collection synchronization");

        List<File> filesToDelete = filesHelper.getMP3ToDelete(config.getMainFolder(), config.getAdditionalFolder());
        List<File> filesToAdd = filesHelper.getMP3ToAdd(config.getMainFolder(), config.getAdditionalFolder());

        loggerHelper.logFilesToDelete(filesToDelete);
        loggerHelper.logNewFiles(filesToAdd);

        LOGGER.debug("Synchronization finished");
    }
}
