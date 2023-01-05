package io.flutter.plugins.camera.types;

import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;

public class CamcorderProfileX
{
    public int duration;
    public int quality;
    public int fileFormat;
    public int videoCodec;
    public int videoBitRate;
    public int videoFrameRate;
    public int videoFrameWidth;
    public int videoFrameHeight;
    public int audioCodec;
    public int audioBitRate;
    public int audioSampleRate;
    public int audioChannels;

    public CamcorderProfileX(int duration,
                             int quality,
                             int fileFormat,
                             int videoCodec,
                             int videoBitRate,
                             int videoFrameRate,
                             int videoWidth,
                             int videoHeight,
                             int audioCodec,
                             int audioBitRate,
                             int audioSampleRate,
                             int audioChannels) {
        this.duration         = duration;
        this.quality          = quality;
        this.fileFormat       = fileFormat;
        this.videoCodec       = videoCodec;
        this.videoBitRate     = videoBitRate;
        this.videoFrameRate   = videoFrameRate;
        this.videoFrameWidth  = videoWidth;
        this.videoFrameHeight = videoHeight;
        this.audioCodec       = audioCodec;
        this.audioBitRate     = audioBitRate;
        this.audioSampleRate  = audioSampleRate;
        this.audioChannels    = audioChannels;
    }
}
