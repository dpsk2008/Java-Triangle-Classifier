/**
*
* Student name: Deepinder
* Completion date: 9/28/2025
*
* 
*/


import static org.junit.Assert.*;
import org.junit.Test;

public class DeepinderkalraTriangleTest {
    
    @Test
	public void test1(){
		Triangle triangle = new Triangle("12","12","12");
		assertEquals("This is an equilateral triangle. ", triangle.triangleType());
	}

	@Test
	public void test2(){
		Triangle triangle = new Triangle("3","3","5");
		assertEquals("This is an isosceles triangle. ", triangle.triangleType());
	}

	@Test
	public void test3(){
		Triangle triangle = new Triangle("4","5","6");
		assertEquals("This is a scalene triangle. ", triangle.triangleType());
	}

	@Test
	public void test4(){
		Triangle triangle = new Triangle("10","10","25");
		assertEquals("Not a valid triangle!\n", triangle.triangleType());
	}

	@Test
	public void test5(){
		Triangle triangle = new Triangle("5","5","-5");
		assertEquals("At least one side is negative!\nNot a valid triangle!\n", triangle.triangleType());
	}

	@Test
	public void test6(){
		Triangle triangle = new Triangle("abc","5","5");
		assertEquals("The side 1 is not an integer number.\n\n", triangle.triangleType());
	}

	@Test
	public void test7(){
		Triangle triangle = new Triangle("5","xyz","5");
		assertEquals("The side 2 is not an integer number.\n\n", triangle.triangleType());
	}

	@Test
	public void test8(){
		Triangle triangle = new Triangle("5","5","pqr");
		assertEquals("The side 3 is not an integer number.\n\n", triangle.triangleType());
	}

	@Test
	public void test9(){
		Triangle triangle = new Triangle("500","400","200");
		assertEquals("This triangle is too big.\n", triangle.triangleType());
	}

	@Test
	public void test10(){
		Triangle triangle = new Triangle("1","1","2");
		assertEquals("Not a valid triangle!\n", triangle.triangleType());
	}

	@Test
	public void test11(){
		Triangle triangle = new Triangle("0","0","0");
		assertEquals("Not a valid triangle!\n", triangle.triangleType());
	}

	@Test
	public void test12(){
		Triangle triangle = new Triangle("100","200","300");
		assertEquals("Not a valid triangle!\n", triangle.triangleType());
	}

	@Test
	public void test13(){
		Triangle triangle = new Triangle("1000","0","1");
		assertEquals("Not a valid triangle!\nThis triangle is too big.\n", triangle.triangleType());
	}

	@Test
	public void test14(){
		Triangle triangle = new Triangle("-10","-10","-10");
		assertEquals("At least one side is negative!\nNot a valid triangle!\n", triangle.triangleType());
	}

	@Test
	public void test15(){
		Triangle triangle = new Triangle("400","400","400");
		assertEquals("This triangle is too big.\n", triangle.triangleType());
	}

	@Test
	public void test16(){
		Triangle triangle = new Triangle("7","7","10");
		assertEquals("This is an isosceles triangle. ", triangle.triangleType());
	}

	@Test
	public void test17(){
		Triangle triangle = new Triangle("5","9","11");
		assertEquals("This is a scalene triangle. ", triangle.triangleType());
	}

	@Test
	public void test18(){
		Triangle triangle = new Triangle("","5","5");
		assertEquals("The side 1 is not an integer number.\n\n", triangle.triangleType());
	}

	@Test
	public void test19(){
		Triangle triangle = new Triangle("5","","5");
		assertEquals("The side 2 is not an integer number.\n\n", triangle.triangleType());
	}

	@Test
	public void test20(){
		Triangle triangle = new Triangle("5","5","");
		assertEquals("The side 3 is not an integer number.\n\n", triangle.triangleType());
	}
}
