package com.srlucas.github.eventviewer.network;

import com.loopj.android.http.AsyncHttpClient;

/** Abstract class for all rest clients to extend.
 * 
 * @author srlucas
 */
public abstract class BaseRestClient implements RestClient {
	
	/** Actual Async client. */
	protected static AsyncHttpClient client = new AsyncHttpClient();


}
