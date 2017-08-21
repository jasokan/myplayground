package com.jasokan.samples;

import java.nio.file.Path;
import java.nio.file.Paths;

import xyz.capybara.clamav.ClamavClient;
import xyz.capybara.clamav.Platform;

public class JClamAVTest {
    
    public static void main(String[] args) {
	
	ClamavClient client = new ClamavClient("localhost",3311, Platform.UNIX);
	System.out.println(client.stats());
	System.out.println(client.version()); 
	Path path = Paths.get("/tmp/test.txt");
	System.out.println(client.scan(path));
	
    }

}
