package myPackage;

import org.testng.annotations.Test;

public class Program1 
{

	@Test(groups = {"oddTestcaseNumber"})
    public void testcase1()
    {
    	    System.out.println("Test Case 1 called....!");
    	
    }
	@Test
    public void testcase2()
    {
    	    System.out.println("Test Case 2 called....!");
    	
    }
}
