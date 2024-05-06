package com.example.lenscorporation;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;

import java.io.File;

public class FileDownloader {

    public void downloadFile(Context context, String fileUrl) {
        String fileName = getFileNameFromUrl(fileUrl);

        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(fileUrl))
                .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName)
                .setTitle("Downloading")
                .setDescription("Downloading " + fileName)
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
                .setAllowedOverRoaming(true);

        DownloadManager downloadManager = (DownloadManager) context.getSystemService(Context.DOWNLOAD_SERVICE);
        downloadManager.enqueue(request);
    }

    private String getFileNameFromUrl(String fileUrl) {
        String[] segments = fileUrl.split("/");
        return segments[segments.length - 1];
    }
}

