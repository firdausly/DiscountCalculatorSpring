package Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DiscountCalculatorSpringBean.DiscountCalculatorSpringBean;

import java.util.*;

public class DiscountCalculatorSpringClient {

	  public static void main(String[] args) {
		//point to the configuration file
			ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
			//get the bean from the configuration file
			DiscountCalculatorSpringBean discountCalculatorBean = (DiscountCalculatorSpringBean) context.getBean("discountCalculatorBean");
	        
	        Scanner input=new Scanner(System.in);
	        System.out.println("----------------------------------------------");
	        System.out.println("Discount Calculator Spring");
	        
	        System.out.println("Enter Initial Price: ");
	        double initialPrice=input.nextDouble();
	        
	        System.out.println("Enter Discount: eg:10% put in 10 ");
	        double discount=input.nextDouble();
	        
	       
	        
	        double finalPrice=discountCalculatorBean.calculateDiscount(initialPrice, discount);
	        System.out.println("Final Price after discount: "+finalPrice);
	        
	    }
	

}
