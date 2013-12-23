package org.ton.musicmanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.ton.musicmanager.configuration.Config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * User: AKazakov
 * Date: 23.11.2013 22:42
 */
public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        try {
////            Config conf = new OldConfigImpl(
////                    Const.TEST_MAIN_FILES_DIR,
////                    Const.TEST_ADDITIONAL_FILES_DIR,
////                    Const.TEST_MAIN_PLAYLIST,
////                    Const.TEST_IGNORED_PLAYLIST,
////                    1);
////        OldConfigImpl conf = new OldConfigImpl(
////                Const.MAIN_FILES_DIR,
////                Const.ADDITIONAL_FILES_DIR,
////                Const.MAIN_PLAYLIST,
////                Const.IGNORED_PLAYLIST,
////                1);
//
////            new CollectonSynchronizer().synchronize(conf);
//
//            ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
//            Config config = (Config) context.getBean("config");
//            CollectonSynchronizer synchronizer = (CollectonSynchronizer) context.getBean("synchronizer");
//
//            synchronizer.synchronize(config);

        } catch (Throwable e) {
            LOGGER.debug("Synchronization failed", e);
        }
    }

    private static void method() throws Error {
        throw new Error();
    }


}
