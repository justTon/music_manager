package org.ton.musicmanager.helper;

import org.ton.musicmanager.Const;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * User: AKazakov
 * Date: 23.11.2013 23:59
 */
public class MP3FilenameFilter implements FilenameFilter {

    private List<String> namesToExclude;

    public MP3FilenameFilter() {
        this(null);
    }

    public MP3FilenameFilter(List<String> namesToExclude) {
        this.namesToExclude = namesToExclude == null ? new ArrayList<String>() : namesToExclude;
    }

    public boolean accept(File dir, String name) {
        return name.endsWith(Const.MP3_FILE_EXTENSION) && !namesToExclude.contains(name);
    }
}
