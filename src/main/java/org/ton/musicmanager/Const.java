package org.ton.musicmanager;

/**
 * User: AKazakov
 * Date: 23.11.2013 22:48
 */
public interface Const {

    public static final String PLAYLIST_EXTENSION = ".m3u8";
    public static final String MP3_FILE_EXTENSION = ".mp3";
    public static final String TEMP_WAV_FILE = "tmp.wav";
    public static final String TEMP_MP3_FILE = "tmp.mp3";

    public static final int BITRATE_192 = 192;
    public static final int BITRATE_128 = 128;

    public static final String MAIN_FILES_DIR = "D:\\The best music in the world\\_Радио Maximum";
    public static final String ADDITIONAL_FILES_DIR = "D:\\The best music in the world\\Converted files";
    public static final String MAIN_PLAYLIST = "D:\\The best music in the world\\Playlists\\Maximum.m3u8";
    public static final String IGNORED_PLAYLIST = "D:\\The best music in the world\\Playlists\\Maximum_ignore.m3u8";


    public static final String TEST_MAIN_FILES_DIR = "D:\\The best music in the world\\test\\main";
    public static final String TEST_ADDITIONAL_FILES_DIR = "D:\\The best music in the world\\test\\mobile";
    public static final String TEST_MAIN_PLAYLIST = "D:\\The best music in the world\\test\\list.m3u8";
    public static final String TEST_IGNORED_PLAYLIST = "D:\\The best music in the world\\test\\ignored.m3u8";
}
