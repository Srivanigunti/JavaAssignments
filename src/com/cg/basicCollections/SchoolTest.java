package com.cg.basicCollections;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class SchoolTest {
	private School KinderGarden;
	private School VaniNikethan;
	private School Kkr;
	private School Narayana;
	private School Srigayatri;
	private Set<School> schoolSets=new HashSet<School>();

	@Test
	public void test() {
		System.out.println("Checking For Duplicate Details");
		schoolSets.add(new School("KinderGarden", "Karimnagar", "Karimnagar", 7));
		schoolSets.add(new School("VaniNikethan", "Karimnagar", "Karimnagar", 7 ));
		schoolSets.add(new School("Kkr", "HYD", "HYD", 1));
		schoolSets.add(new School("Narayana", "HYD", "HYD", 2 ));
		schoolSets.add(new School("Srigayatri", "Karimnagar", "Karimnagar", 4 ));
		schoolSets.add(new School("VaniNikethan", "Karimnagar", "Karimnagar", 7  ));
		
		Iterator iterator=schoolSets.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
	}

}
}
