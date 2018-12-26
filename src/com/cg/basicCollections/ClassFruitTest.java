package com.cg.basicCollections;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import javax.lang.model.element.Element;

import org.junit.Test;

public class ClassFruitTest {
	private Map<String, String> classFruitMap=new HashMap<String, String>();

	@Test
	public void testForClassFavoriteFruit() {
		String map ="";
		classFruitMap.put("Srivani", "Jackfruit");
		classFruitMap.put("Jahnavi", "Orange");
		classFruitMap.put("Lavanya", "Apple");
		classFruitMap.put("Rajendra", "Pineapple");
		classFruitMap.put("Hemalatha", "Grapes");
		for (Map.Entry<String, String> fruit : classFruitMap.entrySet()) {
			if(fruit.getKey().equals("Srivani")) {
				System.out.println("Favorite fruit of "+fruit.getKey()+" is "+ fruit.getValue());
				map +="Favorite fruit of "+fruit.getKey()+" is "+ fruit.getValue();
				break;
			}
		}
		assertEquals("Favorite fruit of Srivani is Jackfruit",map);
	}

}