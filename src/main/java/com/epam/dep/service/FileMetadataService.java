package com.epam.dep.service;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

import java.io.IOException;


public class FileMetadataService {

    static String boxEndpoint(String folder_id) {
        String boxEndpoint = "https://api.box.com/2.0/folders/" + folder_id;
        return boxEndpoint;
    }

    public HttpResponse boxFileMetadataRequest(String boxEndpoint) {
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
            HttpGet request = new HttpGet(boxEndpoint);
            request.addHeader("content-type", "application/json");
            HttpResponse result = httpClient.execute(request);
            String json = EntityUtils.toString(result.getEntity(), "UTF-8");

            Object object = new Gson().fromJson(json, Object.class);

        } catch (IOException ex) {
        }
        return null;
    }
}