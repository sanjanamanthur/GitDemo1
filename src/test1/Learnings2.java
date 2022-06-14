package test1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Learnings2 {

	@Test(groups= {"only"})
	public void Ant()
	{
		System.out.println("Ant-Learnings2");
	}
	
	@Test
	public void Ball()
	{
		System.out.println("Added new feature");
	}
	
	@Test
	public void Cap()
	{
		System.out.println("Cap-Learnings2ww");
	}
	
}
