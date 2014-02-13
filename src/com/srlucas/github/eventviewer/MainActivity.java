package com.srlucas.github.eventviewer;

import org.json.JSONArray;
import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.loopj.android.http.JsonHttpResponseHandler;
import com.srlucas.github.R;
import com.srlucas.github.eventviewer.network.github.GithubRestClient;

/** Main Activity for our event viewer
 * 
 * @author srlucas
 */
public class MainActivity extends Activity {
	
	ListView events;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		fetchEventsAsync();
	}
	
	/**
	 * Fetch events to show and populate ListView
	 */
	private void fetchEventsAsync() {
		GithubRestClient.get("events", null, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(JSONArray events) {
            	// update listview
            }
        });
	}

}
