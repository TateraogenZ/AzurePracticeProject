package Tutorial1;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Demo1 {
	
	@Test(priority = 1)
	public void a1()
	{
		String a="genZ solution";
		Assert.assertEquals(a, "genZ solution");
	}
	@Test(priority = 2)
	public void a2()
	{
		int a=10;
		Assert.assertEquals(a, 10);
	}
	

}
