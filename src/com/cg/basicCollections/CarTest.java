package com.cg.basicCollections;
import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;


public class CarTest {
	private Car benz;
	private Car maruthi;
	private Car breeza;
	private Car honda;
	private Car ford;
	private Set<Car> carsets=new HashSet<Car>();

	@Test
	public void testForCarDetails() {
		System.out.println("Check For Duplicate Values");
		
		carsets.add(new Car("BENZ", "BENZ X1", 2014, 1100000));
		carsets.add(new Car("MARUTHI", "MARUTHI A3", 2016, 1200000));
		carsets.add(new Car("BREEZA", "BREEZA  Class", 2015, 2500000));
		carsets.add(new Car("HONDA", "HONDA CITY T", 2011, 800000));
		carsets.add(new Car("FORD", "FORD", 2011, 1100000));
		carsets.add(new Car("BREEZA", "BREEZA  Class", 2015, 2500000));
		
		Iterator iterator=carsets.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		
	}

}