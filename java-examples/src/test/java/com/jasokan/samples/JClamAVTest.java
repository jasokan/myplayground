package com.jasokan.samples;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import xyz.capybara.clamav.ClamavClient;
import xyz.capybara.clamav.Platform;
import xyz.capybara.clamav.commands.scan.result.ScanResult;

/**
 * @author jasokan
 *
 */
public class JClamAVTest {

	public static void main(String[] args) throws URISyntaxException {

		ClamavClient client = new ClamavClient("10.127.138.48", 3311, Platform.UNIX);
		System.out.println(client.stats());
		System.out.println(client.version());
		Path path = Paths.get(new URI("file:////tmp/test_jagdish.doc"));
		ScanResult result = client.scan(path);
		System.out.println(result.getStatus());
		System.out.println(result.getFoundViruses());
		System.out.println(client.scan(path));
		

	}

}
