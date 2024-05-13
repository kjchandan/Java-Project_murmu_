package com.tap.Murmu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.Murmu.Impl.IndianArmy;
import com.tap.Murmu.Impl.IndianNavy;

public class App {
  public static void main(String[] args) 
  {
	  ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	  
	  IndianArmy ia = new IndianArmy(ac);
	  IndianNavy in = new IndianNavy(ac); 

	  ia.addresspresident();
	  in.addresspresident();
	  
  }
}
