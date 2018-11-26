package com.jasokan.samples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

/**
 * @author jasokan
 *
 */
public class J8ForEach {

    public static void main(String[] args) {

	Random randomizer = new Random();

	List<Integer> intList = new ArrayList<Integer>();
	for (int i = 0; i < 10; i++) {
	    intList.add(randomizer.nextInt(200));
	}

	// First way

	intList.forEach(new Consumer<Integer>() {

	    @Override
	    public void accept(Integer content) {
		System.out.println("List val is " + content);
	    }

	});

	// Second way

	intList.forEach(lContent -> System.out.println(lContent));

	// Third way

	for (Integer lContent : intList) {
	    System.out.println(lContent);
	}
	
	// Fourth way
	    
	intList.forEach(System.out::println);

    }

}
