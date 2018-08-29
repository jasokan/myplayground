package com.jasokan.jdk8.examples;

import java.util.concurrent.CompletableFuture;
import java.util.regex.Pattern;
import java.util.stream.Stream;



public class JFutureExample1 {

	public static void main(String... args) {

		Pattern pat = Pattern.compile("\\n");

		CompletableFuture<Stream<String>> csv = asyncHttpClient().prepareGet(
						"http://api.worldweatheronline.com/premium/v1/past-weather.ashx?q=37.017,-7.933&date=2018-04-01&enddate=2018-04-30&tp=24&format=csv&key=54a4f43fc39c435fa2c143536183004").execute()
				.toCompletableFuture()
				.thenApply(Response::getResponseBody)
				.thenApply(pat::splitAsStream);

	}

}
