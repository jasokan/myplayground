package com.jasokan.samples;

/**
 * @author jasokan
 *
 */
public class JLambdaTest {
    
    public static void main(String[] args) {
	
	JLambdaTest jTest = new JLambdaTest();
	SimpleInterestCalculation simpleInterest = (float principal, float rateOfInterest, int numOfYears) -> principal * rateOfInterest * numOfYears / 100	;
	CompundInterestCalculation compoundInterest = (float principal, float rateOfInterest, int numOfYears, int compoundsPerYear) -> Math.pow((double)(principal * (1+rateOfInterest/compoundsPerYear)), (double)compoundsPerYear*numOfYears  );
	
    }
    
    @FunctionalInterface
    interface SimpleInterestCalculation {
	double simpleInterest(float principal, float rateOfInterest, int numOfYears);
    }
    
    @FunctionalInterface
    interface CompundInterestCalculation {
	double compoundInterest(float principal, float rateOfInterest, int numOfYears, int compoundsPerYear);
    }
    
    private float calculateSimple(float principal, float rateOfInterest, int numOfYears, int compoundsPerYear) {
	return 0;
    }
    
    private float calculateCompund(float principal, float rateOfInterest, int numOfYears, int compoundsPerYear) {
	return 0;
    }

}
