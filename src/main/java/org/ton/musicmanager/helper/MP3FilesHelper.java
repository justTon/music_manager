package org.ton.musicmanager.helper;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * User: AKazakov
 * Date: 23.11.2013 23:15
 */
public class MP3FilesHelper {

    public static final FilenameFilter MP3_FILENAME_FILTER = new MP3FilenameFilter();

    public List<File> getMP3ToAdd(String mainFolder, String convertedFolder) {
        List<File> existingFilesInConvertedFolder = getMp3InFolder(convertedFolder);

        return getMp3InFolder(mainFolder,
                new MP3FilenameFilter(toFileNames(existingFilesInConvertedFolder)));
    }

    public List<File> getMP3ToDelete(String mainFolder, String convertedFolder) {
        List<File> existingFilesInMainFolder = getMp3InFolder(mainFolder);

        return getMp3InFolder(convertedFolder,
                new MP3FilenameFilter(toFileNames(existingFilesInMainFolder)));
    }

    private List<File> getMp3InFolder(String folderName) {
        return getMp3InFolder(folderName, MP3_FILENAME_FILTER);
    }

    private List<File> getMp3InFolder(String folderName, FilenameFilter filter) {
        File folder = new File(folderName);
        return new ArrayList<File>(Arrays.asList(folder.listFiles(filter)));
    }

    private List<String> toFileNames(List<File> files) {
        List<String> result = new ArrayList<String>();
        for (File file : files) {
            result.add(file.getName());
        }

        return result;
    }
}
