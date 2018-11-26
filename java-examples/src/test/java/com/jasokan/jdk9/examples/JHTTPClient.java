package com.jasokan.jdk9.examples;

import java.io.IOException;
import java.net.URI;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;





/**
 * @author jasokan
 *
 */
public class JHTTPClient {

	public static void main(String[] args) {

		HttpClient client = HttpClient.newHttpClient();

		HttpRequest req = HttpRequest.newBuilder(URI.create("http://www.google.com")).header("User-Agent", "Jagan").GET()
				.build();

		try {
			HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandler.asString());
			System.out.println(resp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
