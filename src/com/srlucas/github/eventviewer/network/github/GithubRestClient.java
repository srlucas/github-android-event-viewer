package com.srlucas.github.eventviewer.network.github;

import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.srlucas.github.eventviewer.network.BaseRestClient;

/**
 * Github rest client. All github related stuff is here.
 * 
 * Only GET requests are supported.
 * 
 * @author srlucas
 *
 */
public class GithubRestClient extends BaseRestClient {

	/** Base URL. */
	private static final String BASE_URL = "https://api.github.com/";
	
	/** Do a GET request to the given URL
	 * 
	 * @param url the url to GET to
	 * @param params params to send as the query string
	 * @param responseHandler callback
	 */
	public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
		client.get(getAbsoluteUrl(url), params, responseHandler);
	}
	
	/** Get proper github URL
	 * 
	 * @param relativeUrl action to call
	 * @return full github url
	 */
	private static String getAbsoluteUrl(String relativeUrl) {
	    return BASE_URL + relativeUrl;
	}
}
