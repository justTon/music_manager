package org.ton.musicmanager.configuration;

/**
 * User: AKazakov
 * Date: 23.11.2013 23:39
 */
public interface Config {
    String getMainFolder();

    String getAdditionalFolder();

    String getMainPlaylist();

    Integer getMainBitrate();

    Integer getAdditionalBitrate();
}
