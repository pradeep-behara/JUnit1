package com.wipro.test;
import org.junit.Test;
import com.wipro.task.DailyTasks;
import static org.junit.Assert.assertEquals;

public class TestStringConcat {
	String s1 = "Hello";
	String s2 = "World!";
	DailyTasks dailyTasks = new DailyTasks();
	
	@Test
	public void testConcatValue() {
		System.out.println("Inside test concat");
		String output = "Hello World!";
		assertEquals(output,dailyTasks.doStringConcat(s1,s2));
	}
}
