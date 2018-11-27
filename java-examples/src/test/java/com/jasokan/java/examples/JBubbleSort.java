package com.jasokan.java.examples;

/**
 * @author jasokan
 *
 */
public class JBubbleSort {
	
	public static void main(String[] args) {
		
		int[] jElements = {2,5,7,4,3,1,44,33,22,99,55,45,34,23,21,67};
		
		int jFirstLoop=0, jSecondLoop=0;
		System.out.println(jElements.length);
		for(jFirstLoop=0;jFirstLoop<jElements.length-1;jFirstLoop++){
			for(jSecondLoop=0;jSecondLoop<jElements.length-jFirstLoop-1;jSecondLoop++) {
				if(jElements[jSecondLoop] > jElements[jSecondLoop+1]) {
					int temp = jElements[jSecondLoop];
					jElements[jSecondLoop] = jElements[jSecondLoop+1];
					jElements[jSecondLoop+1] = temp;
				}
			}
			if(jFirstLoop==1) {
				System.out.println(jElements[jSecondLoop]);
			}
		}
		System.out.println();
		for(jFirstLoop=0;jFirstLoop<jElements.length;jFirstLoop++) {
			System.out.print(jElements[jFirstLoop] + ", ");
		}
	}

}
