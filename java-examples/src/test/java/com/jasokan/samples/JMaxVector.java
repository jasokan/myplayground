package com.jasokan.samples;

import java.util.Collections;
import java.util.Vector;

/**
 * @author jasokan
 *
 */
public class JMaxVector {

    public static void main(String[] args) {
	Vector<Integer> iVector = new Vector<Integer>();
	iVector.add(new Integer(-10));
	iVector.add(new Integer(-1));
	iVector.add(new Integer(-100));
	iVector.add(new Integer(-2));
	iVector.add(new Integer(-1110));
	Integer maxInteger = Collections.max(iVector);
	Integer minInteger = Collections.min(iVector);
	System.out.println("The max Integer Value is " + maxInteger);
	System.out.println("The min Integer Value is " + minInteger);

	Vector<Double> dVector = new Vector<Double>();
	dVector.add(new Double(-7.2222));
	dVector.add(new Double(-1.00009));
	dVector.add(new Double(11.99999));
	dVector.add(new Double(6.00000));
	dVector.add(new Double(0.909999));
	Double maxDouble = Collections.max(dVector);
	Double minDouble = Collections.min(dVector);
	System.out.println("The max Integer Value is " + maxDouble);
	System.out.println("The min Integer Value is " + minDouble);

    }

}
