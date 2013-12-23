package org.ton.musicmanager.configuration;

import org.ton.musicmanager.Const;

/**
 * User: AKazakov
 * Date: 23.11.2013 23:42
 */
public class TestConfigImpl implements Config {

    @Override
    public String getMainFolder() {
        return Const.TEST_MAIN_FILES_DIR;
    }

    @Override
    public String getAdditionalFolder() {
        return Const.TEST_ADDITIONAL_FILES_DIR;
    }

    @Override
    public String getMainPlaylist() {
        return Const.TEST_MAIN_PLAYLIST;
    }

    @Override
    public Integer getMainBitrate() {
        return Const.BITRATE_192;
    }

    @Override
    public Integer getAdditionalBitrate() {
        return Const.BITRATE_128;
    }
}
