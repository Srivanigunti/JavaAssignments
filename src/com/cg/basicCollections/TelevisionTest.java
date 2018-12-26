package com.cg.basicCollections;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class TelevisionTest {
	private Television hp;
	private Television sony;
	private Television bpl;
	private Television lg;
	private Television samsung;
	private Set<Television> televisionSets=new HashSet<Television>();

	@Test
	public void testForTelevisionDetails() {
		System.out.println("Checking For Duplicate Values");
		televisionSets.add(new Television("Samsung", "LED", "3D", 40000));
		televisionSets.add(new Television("HP", "LCD", "2D", 25000));
		televisionSets.add(new Television("BPL", "Normal", "2D", 15000));
		televisionSets.add(new Television("LG", "Plasma", "3D", 25000));
		televisionSets.add(new Television("SONY", "LED", "PLASMA", 300000));
		televisionSets.add(new Television("Samsung", "LED", "3D", 40000));
		
		Iterator iterator=televisionSets.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}

}