package com.example.wangxi.ffmpegtest;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

import java.io.File;

/**
 * author:  yytian
 * time:    2016/11/16 23:27
 * des:
 */
public class FileConstantPath {

    private static final java.lang.String TAG = FileConstantPath.class.getSimpleName();
    public final static String APP_IMAGES_PATH = "images";
    public final static String APP_GIFTS_PATH = "gifts";
    public final static String APP_VIDEOS_PATH = "videos";
    public final static String APP_LOGIN_VIDEO_PATH = "loginVideo";
    public final static String APP_DATA_PATH = "ffmpeg_test";
    public final static String APP_APK_PATH = "apks";

    /**
     * 获取app数据目录
     *
     * @return
     */
    public static String getAppDataPath(Context context) {
        // 判断是否挂载了SD卡
        String dataPath = null;
        String storageState = Environment.getExternalStorageState();
        if (storageState.equals(Environment.MEDIA_MOUNTED)) {
            dataPath = Environment.getExternalStorageDirectory()
                    .getAbsolutePath()
                    + File.separator
                    + APP_DATA_PATH
                    + File.separator;
        } else {
            File basePath = context.getCacheDir();
            dataPath = basePath.getAbsolutePath()
                    + File.separator
                    + APP_DATA_PATH
                    + File.separator;
        }
        checkFile(dataPath);
        return dataPath;
    }

    /**
     * 获取程序图片目录
     *
     * @return
     */
    public static String getAppImagesPath(Context context) {
        String imgPath = getAppDataPath(context) + APP_IMAGES_PATH + File.separator;
        Log.d(TAG, "image cache path is:" + imgPath);
        checkFile(imgPath);
        return imgPath;
    }

    /**
     * 获取程序图片目录
     *
     * @return
     */
    public static String getGiftPath(Context context) {
        String giftsPath = context.getFilesDir()+ File.separator+ APP_GIFTS_PATH + File.separator;
        Log.d(TAG, "gifts cache path is:" + giftsPath);
        checkFile(giftsPath);
        return giftsPath;
    }

    /**
     * 获取程序登陆视频目录
     *
     * @return
     */
    public static String getLoginVideoPath(Context context) {
        String videoPath = context.getFilesDir()+ File.separator+ APP_LOGIN_VIDEO_PATH + File.separator;
        Log.d(TAG, "loginVideo cache path is:" + videoPath);
        checkFile(videoPath);
        return videoPath;
    }
    /**
     * 获取更新apk目录
     *
     * @return
     */
    public static String getUpdateApkPath(Context context) {
        String videoPath = context.getFilesDir()+ File.separator+ APP_APK_PATH + File.separator;
        Log.d(TAG, "apk cache path is:" + videoPath);
        checkFile(videoPath);
        return videoPath;
    }

    /**
     * 获取程序视频目录
     *
     * @return
     */
    public static String getAppVideosPath(Context context) {
        String videoPath = getAppDataPath(context) + APP_VIDEOS_PATH + File.separator;
        checkFile(videoPath);
        Log.d(TAG, "video cache path is:" + videoPath);
        return videoPath;
    }

    private static void checkFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            file.mkdirs();
        }
    }
}
