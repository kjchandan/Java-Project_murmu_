package com.tap.Murmu.Impl;

import org.springframework.context.ApplicationContext;

import com.tap.Murmu.Interfaces.Services;
import com.tap.Murmu.classes.President;

public class IndianArmy implements Services {

	ApplicationContext ac;
	public IndianArmy(ApplicationContext ac) {
		this.ac = ac;
	}

	@Override
	public void addresspresident() {
		President p = (President) ac.getBean("president");
		System.out.println(p.name);
		System.out.println(p);
	}

}
