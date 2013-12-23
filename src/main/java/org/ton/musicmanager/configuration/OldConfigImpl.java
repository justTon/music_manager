package org.ton.musicmanager.configuration;

import org.ton.musicmanager.Const;

/**
 * User: AKazakov
 * Date: 23.11.2013 22:49
 */
public class OldConfigImpl implements Config {

    private String mainFolder;
    private String additionalFolder;
    private String mainPlaylist;
    private String ignoredPlaylist;
    private Integer mainBitrate;
    private Integer additionalBitrate;

    public OldConfigImpl(String mainFolder, String mainPlaylist, String ignoredPlaylist) {
        this(mainFolder, null, mainPlaylist, ignoredPlaylist, Const.BITRATE_192, null);
    }

    public OldConfigImpl(String mainFolder, String additionalFolder, String mainPlaylist, String ignoredPlaylist) {
        this(mainFolder, additionalFolder, mainPlaylist, ignoredPlaylist, Const.BITRATE_192, Const.BITRATE_128);
    }

    public OldConfigImpl(String mainFolder, String additionalFolder, String mainPlaylist, String ignoredPlaylist, int threadsNumber) {
        this(mainFolder, additionalFolder, mainPlaylist, ignoredPlaylist, Const.BITRATE_192, Const.BITRATE_128);
    }

    public OldConfigImpl(String mainFolder, String additionalFolder, String mainPlaylist, String ignoredPlaylist,
                         Integer mainBitrate, Integer additionalBitrate) {
        this.mainFolder = mainFolder;
        this.additionalFolder = additionalFolder;
        this.mainPlaylist = mainPlaylist;
        this.ignoredPlaylist = ignoredPlaylist;
        this.mainBitrate = mainBitrate;
        this.additionalBitrate = additionalBitrate;
    }


    @Override
    public String getMainFolder() {
        return mainFolder;
    }

    @Override
    public String getAdditionalFolder() {
        return additionalFolder;
    }

    @Override
    public String getMainPlaylist() {
        return mainPlaylist;
    }

    public String getIgnoredPlaylist() {
        return ignoredPlaylist;
    }

    @Override
    public Integer getMainBitrate() {
        return mainBitrate;
    }

    @Override
    public Integer getAdditionalBitrate() {
        return additionalBitrate;
    }
}
