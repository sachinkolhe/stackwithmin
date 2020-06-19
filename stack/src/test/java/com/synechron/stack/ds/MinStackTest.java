package com.synechron.stack.ds;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class MinStackTest {

	MinStack stack;
	
	@Before
    public void init() {
		stack = new MinStack();
		stack.push(10);
		stack.push(20);
		stack.push(15);
		stack.push(9);
		stack.push(30);
		stack.push(7);
		stack.push(60);
		
	}

	@Test
	public void testGetMin1() {
		assertEquals(7,stack.getMin());
		
	}
	
	@Test
	public void testGetMin2() {
		stack.pop();
		stack.pop();
		assertEquals(9,stack.getMin());
		
	}
	
	@Test
	public void testGetMin3() {
		stack.push(1);
		stack.push(2);
		assertEquals(1,stack.getMin());
		
	} 
	
	@Test
	public void testGetMin4() {
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		assertEquals(10,stack.getMin());
		
	}


}
