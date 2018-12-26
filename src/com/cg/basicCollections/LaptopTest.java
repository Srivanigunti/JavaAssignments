package com.cg.basicCollections;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class LaptopTest {
	private Laptop apple;
	private Laptop hp;
	private Laptop dell;
	private Laptop lenovo;
	private Laptop asus;
	
	private Set<Laptop> laptopsets= new HashSet<Laptop>();

	@Test
	public void testForDetails() {
		System.out.println("Check For Duplicate Values");
		
		laptopsets.add(new Laptop("Apple", 734804, "MAC OS", "i6"));
		laptopsets.add(new Laptop("HP", 18091, "Windows 9.0", "i5"));
		laptopsets.add(new Laptop("Lenovo", 101, "Windows 10", "i5"));
		laptopsets.add(new Laptop("Dell", 748246, "Windows 10", "i2"));
		laptopsets.add(new Laptop("Lenovo", 101, "Windows 10", "i5"));
		laptopsets.add(new Laptop("Asus", 89473, "DOS", "i3"));
		lenovo= new Laptop("Lenovo", 100, "Windows 8", "i7");
		
		Iterator iterator=laptopsets.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		
	}

}