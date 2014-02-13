package com.srlucas.github.eventviewer;

import android.app.Application;
import android.content.Context;

/*
 * This is the Android application itself and is used to configure various settings
 * 
 *     RestClient client = RestClientApp.getRestClient();
 *     // use client to send requests to API
 *     
 */
public class GitHubEventViewerApp extends Application {
	private static Context context;
	
    @Override
    public void onCreate() {
        super.onCreate();
        GitHubEventViewerApp.context = this;
    }
    
}