package com.iceteck.silicompressorr;

import com.iceteck.silicompressorr.videocompression.MediaController;

/**
 * @author Toure, Akah L
 * @version 1.1.1
 * Created by Toure on 28/03/2016.
 */
public class VideoCompressor {

    /**
     * Perform background video compression. Make sure the videofileUri and destinationUri are valid
     * resources because this method does not account for missing directories hence your converted file
     * could be in an unknown location
     * This uses default values for the converted videos
     *
     * @param videoFilePath  source path for the video file
     * @param outputPath     output path that converted file should be saved
     * @return The Path of the compressed video file
     */
    public static boolean compressVideo(String videoFilePath, String outputPath) {
        return compressVideo(videoFilePath, outputPath, 0, 0, 0);
    }


    /**
     * Perform background video compression. Make sure the videofileUri and destinationUri are valid
     * resources because this method does not account for missing directories hence your converted file
     * could be in an unknown location
     *
     * @param videoFilePath  source path for the video file
     * @param outputPath     output path that converted file should be saved
     * @param outWidth       the target width of the compressed video or 0 to use default width
     * @param outHeight      the target height of the compressed video or 0 to use default height
     * @param bitrate        the target bitrate of the compressed video or 0 to user default bitrate
     * @return The Path of the compressed video file
     */
    public static boolean compressVideo(String videoFilePath, String outputPath, int outWidth, int outHeight, int bitrate) {
        return new MediaController().compressVideo(videoFilePath, outputPath, outWidth, outHeight, bitrate);
    }
}
