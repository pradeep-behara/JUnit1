package com.wipro.test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import com.wipro.task.DailyTasks;

public class TestSort {
	int[] arr = {5,3,2,1,7};
	DailyTasks dailyTasks = new DailyTasks();
	
	@Test
	public void testSortValue() {
		System.out.println("Inside test sort");
		int[] output = {1,2,3,5,7};
		assertArrayEquals(output,dailyTasks.sortValues(arr));
	}
}
