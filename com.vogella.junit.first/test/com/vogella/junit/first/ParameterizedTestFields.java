package com.vogella.junit.first;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

@RunWith(Parameterized.class)
public class ParameterizedTestFields {
	// fields used together with @Parameter must be public
	@Parameter
	public int m1;
	@Parameter (value = 1)
	public int m2;
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
