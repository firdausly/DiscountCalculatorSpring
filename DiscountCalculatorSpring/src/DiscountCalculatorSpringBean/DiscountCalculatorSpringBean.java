package DiscountCalculatorSpringBean;




//no need to implement any interface, only configure the xml file
public class DiscountCalculatorSpringBean {

	
	 public  double calculateDiscount(double initialPrice, double discount) {
		    
	        return (100-discount)*initialPrice/100;
	    }
	
	
}
