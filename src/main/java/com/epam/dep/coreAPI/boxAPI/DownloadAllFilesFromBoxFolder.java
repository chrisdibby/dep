package com.epam.dep.coreAPI.boxAPI;

import com.box.sdk.*;

import java.io.*;

public class DownloadAllFilesFromBoxFolder {

    public static void downloadAllFilesFromFolder(BoxFolder folder) throws Exception {
        final String currentPath = new File("").getAbsolutePath();
        Reader configFile = new FileReader("config.json");
        BoxConfig boxConfig = BoxConfig.readFrom(configFile);
        BoxDeveloperEditionAPIConnection boxClient = BoxDeveloperEditionAPIConnection.getAppEnterpriseConnection(boxConfig);
        String folderId = "";
        BoxFolder boxFolder = new BoxFolder(boxClient, folderId);
        String folderName = boxFolder.getInfo().getName();
        File localFolderPath = new File(currentPath, folderName);

        if (!localFolderPath.exists()) {
            boolean createFolder = true;
            createFolder = localFolderPath.mkdir();
        }
        else {
            boolean rewriteFolder = true;
            if (localFolderPath.isDirectory()) {
                for (File f : localFolderPath.listFiles()){
                    f.delete();
                }
            }
            localFolderPath.delete();
            rewriteFolder = localFolderPath.mkdir();
        }

        for (BoxItem.Info itemInfo : folder) {
            if (itemInfo instanceof BoxFile.Info) {
                BoxFile.Info fileInfo = (BoxFile.Info) itemInfo;
                BoxFile file = new BoxFile(boxClient, fileInfo.getID());
                File localFilePath = new File(localFolderPath, fileInfo.getName());
                FileOutputStream stream = new FileOutputStream(localFilePath);
                file.download(stream);
                stream.close();
            }
        }
    }
}