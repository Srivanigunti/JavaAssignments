package com.cg.basicCollections;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class CellPhoneTest {
	private CellPhone nokia;
	private CellPhone asus;
	private CellPhone samsung;
	private CellPhone oneplus;
	private CellPhone iphone;
	private Set<CellPhone> cellphoneSets=new HashSet<CellPhone>();

	@Test
	public void testForCellPhoneDetails() {
		System.out.println("Checking For Duplicate Details");
		cellphoneSets.add(new CellPhone("NOKIA", "1910", "2GB-RAM", "Windows", 5000));
		cellphoneSets.add(new CellPhone("ASUS", "ZENFONE5", "4GB-RAM", "Marshmallow", 10000));
		cellphoneSets.add(new CellPhone("SAMSUNG", "J7", "19MP-Camera", "Lollipop", 19000));
		cellphoneSets.add(new CellPhone("ONEPLUS", "6", "8GB-RAM", "Oxygen", 35000));
		cellphoneSets.add(new CellPhone("IPHONE", "XS", "2500mAh", "Lollipop", 75000));
		cellphoneSets.add(new CellPhone("ONEPLUS", "6", "5000mAh", "Oxygen", 35000));
		
		Iterator iterator=cellphoneSets.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		
	}

}