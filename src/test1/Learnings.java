package test1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Learnings {

	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before test");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("After test");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After class");
	}
	
	
	
	@Test(dependsOnMethods="cat", description = "Using description attribute, it is used after @test annotation that describes the information about the test.")
	public void apple()
	{
		System.out.println("Apple-Learnings");
	}
	
	@Test(description = "Using") //can use multiple attributes followed by ,
	public void bat()
	{
		System.out.println("Bat-Learnings");
	}
	
	@Test(priority=2) //priority attribute determine @test execution sequence 
	public void cat()
	{
		System.out.println("Cat-Learnings");
	}
	
	@Test(priority=1)
	public void zee()
	{
		System.out.println("Zee -Learnings");
	}

	@Test(enabled=false) //'enabled' attribute contains the boolean value. By default, its value is true. If you want to skip some test method, then you need to explicitly specify 'false' value.
	public void skipMethod()
	{
		System.out.println("Zee -Learnings");
	}
	
	
	@Test(groups= {"software company"})  
	public void infosys()  
	{  
	System.out.println("Infosys");  
	}  
	
	@Test(groups= {"software company"})  
	public void wipro()  
	{  
	System.out.println("Wipro");  
	}  	
	
	
}
