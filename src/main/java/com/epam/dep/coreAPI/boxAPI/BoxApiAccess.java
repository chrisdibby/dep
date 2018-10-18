package com.epam.dep.coreAPI.boxAPI;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.box.sdk.BoxConfig;
import com.box.sdk.BoxDeveloperEditionAPIConnection;
import com.box.sdk.IAccessTokenCache;
import com.box.sdk.InMemoryLRUAccessTokenCache;

public final class BoxApiAccess {

    private static final String USER_ID = "6134025156";
    private static final String CONFIG_PATHNAME = "com/epam/dep/coreAPI/boxAPI/configs/config.json";
    private static final int MAX_CACHE_ENTRIES = 100;

    public BoxDeveloperEditionAPIConnection apiConnect() throws IOException {
        IAccessTokenCache accessTokenCache = new InMemoryLRUAccessTokenCache(MAX_CACHE_ENTRIES);
        Reader reader = new FileReader(CONFIG_PATHNAME);
        BoxConfig boxConfig = BoxConfig.readFrom(reader);
        BoxDeveloperEditionAPIConnection api = BoxDeveloperEditionAPIConnection.getAppUserConnection(
                USER_ID, boxConfig, accessTokenCache);
        return api;
    }

    public BoxApiAccess() {
    }
}



