package com.wipro.test;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.wipro.task.DailyTasks;

public class TestCheckPresence {
	String s1 = "Computer";
	String s2 = "pute";
	DailyTasks dailyTasks = new DailyTasks();
	
	@Test
	public void testCheckPresenceValue() {
		System.out.println("Inside test presence");
		assertTrue("There is an error",dailyTasks.checkPresence(s1, s2)==true);
	}
}
