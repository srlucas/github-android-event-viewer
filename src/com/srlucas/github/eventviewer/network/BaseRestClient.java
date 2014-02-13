package com.srlucas.github.eventviewer.network;

import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

/** Abstract class for all rest clients to extend.
 * 
 * @author srlucas
 */
public abstract class BaseRestClient implements RestClient {
	

	
	/** Logs the request to stdout
	 * 
	 * @param url the url to GET to
	 * @param params params to send as the query string
	 * @param responseHandler callback
	 */
	public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
		System.out.println("Requesting [GET] URL " + url + " with request params " + params);
	}
	
	/** Logs the request to STDOUT 
	 * 
	 * @param url the url to POST to
	 * @param params params to send as part of the POST
	 * @param responseHandler callback
	 */
	public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
		System.out.println("Requesting [POST] URL " + url + " with request params " + params);
	}
	
}