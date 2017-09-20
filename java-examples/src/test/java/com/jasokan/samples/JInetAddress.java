package com.jasokan.samples;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class JInetAddress {

    public static void main(String[] args) {
	InetAddress localAddress;
	try {
	    localAddress = InetAddress.getLocalHost();
	    System.out.println("Local HostAddress " + localAddress.getHostAddress());
	    System.out.println("Local Host Name " + localAddress.getHostName());
	    System.out.println("Canonical Name " + localAddress.getCanonicalHostName());
	    System.out.println("isLocalAddress " + localAddress.isAnyLocalAddress());
	    System.out.println("isLinkLocalAddress " + localAddress.isLinkLocalAddress());
	    System.out.println("isLoopbackAddress " + localAddress.isLoopbackAddress());
	    System.out.println("isMCGlobal " + localAddress.isMCGlobal());
	} catch (UnknownHostException e) {
	    e.printStackTrace();
	}

    }

}
