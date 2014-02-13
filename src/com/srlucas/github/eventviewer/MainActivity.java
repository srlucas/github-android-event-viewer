package com.srlucas.github.eventviewer;

import org.json.JSONArray;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;
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
		
		fetchEventsAsync(0);
	}
	
	/**
	 * Fetch events to show and populate ListView
	 * 
	 * @param page which page number to fetch
	 */
	private void fetchEventsAsync(int page) {
		
		GithubRestClient.get("events", 
				new RequestParams("page", page), 
				new JsonHttpResponseHandler() {
		            @Override
		            public void onSuccess(JSONArray events) {
		            	// update listview
		            }
				}
		); // ascii art
		
	}

}
