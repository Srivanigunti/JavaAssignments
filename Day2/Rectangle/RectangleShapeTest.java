package Rectangle;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RectangleShapeTest 
{
	private rectangleShapeBehaviour rectangleOneBehaviourCheck,rectangleTwoBehaviourCheck;

	@Before
	public void setup()
	{
		rectangleOneBehaviourCheck = new rectangleShapeBehaviour();
		rectangleTwoBehaviourCheck = new rectangleShapeBehaviour();
	}
	
	int parimeterOfRectangleOne,parimeterOfRectangleTwo,areaOfRectangleOne,areaOfRectangleTwo;
	
	@Test
	public void rectangleOneParimeter() 
	{
		parimeterOfRectangleOne = rectangleOneBehaviourCheck.rectangleOneParemeterValue(10,20);
		assertEquals(60,parimeterOfRectangleOne);
	}
	
	@Test
	public void rectangleTwoParimeter() 
	{
		 parimeterOfRectangleTwo=rectangleTwoBehaviourCheck.rectangleOneParemeterValue(10,20);
		assertEquals(60,parimeterOfRectangleTwo);
	}
	
	@Test
	public void rectangleParimetersAreEqual() //checking equal or not
	{
		boolean result1=rectangleOneBehaviourCheck.findRectangleAreassAreEqual(rectangleOneBehaviourCheck.rectangleOneParemeterValue(10,20),rectangleTwoBehaviourCheck.rectangleOneParemeterValue(20,10));
		assertEquals(true,result1);
	}
	
	@Test
	public void rectangleOneParimetertest() 
	{
		parimeterOfRectangleOne=rectangleOneBehaviourCheck.rectangleOneParemeterValue(10,20);
		assertEquals(60,parimeterOfRectangleOne);
	}
	
	@Test
	public void rectangleTwoParimetertest() 
	{
		parimeterOfRectangleTwo=rectangleTwoBehaviourCheck.rectangleOneParemeterValue(20,20);
		assertEquals(80,parimeterOfRectangleTwo);
	}
	
	@Test
	public void rectangleParimetersAreNotEqual() //checking equal or not
	{
		boolean result1=rectangleOneBehaviourCheck.findRectangleAreassAreEqual(rectangleOneBehaviourCheck.rectangleOneParemeterValue(10,20),rectangleTwoBehaviourCheck.rectangleOneParemeterValue(20,20));
		assertEquals(false,result1);
	}
	
	@Test
	public void rectangleAreaOne()
	{
		areaOfRectangleOne=rectangleOneBehaviourCheck.rectangleOneAreaValue(10,20);		
		assertEquals(200,areaOfRectangleOne);
	}
	
	@Test
	public void rectangleAreaTwo()
	{
		areaOfRectangleTwo=rectangleOneBehaviourCheck.rectangleTwoAreaValue(10,20);	
		assertEquals(200,areaOfRectangleTwo);
	}
	
	@Test
	public void rectangleAreasAreEqual() //checking equal or not
	{
		boolean result1=rectangleOneBehaviourCheck.findRectangleAreassAreEqual(rectangleOneBehaviourCheck.rectangleOneAreaValue(10,20),rectangleTwoBehaviourCheck.rectangleTwoAreaValue(10,20));
		assertEquals(true,result1);
	}
	
	@Test
	public void rectangleAreaOneTest()
	{
		areaOfRectangleOne=rectangleOneBehaviourCheck.rectangleOneAreaValue(10,20);		
		assertEquals(200,areaOfRectangleOne);
	}
	
	@Test
	public void rectangleAreaTwoTest()
	{
		areaOfRectangleTwo=rectangleOneBehaviourCheck.rectangleTwoAreaValue(20,20);	
		assertEquals(400,areaOfRectangleTwo);
	}
	
	@Test
	public void rectangleAreasAreNotEqual() //checking equal or not
	{
		boolean result1=rectangleOneBehaviourCheck.findRectangleAreassAreEqual(rectangleOneBehaviourCheck.rectangleOneAreaValue(10,20),rectangleTwoBehaviourCheck.rectangleTwoAreaValue(20,20));
		assertEquals(false,result1);	
	}

}