package qa.demo.pageTest;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import qa.demo.base.BaseClass;

public class LoginTest extends BaseClass {
	
	@Test
	public void headersTest()
	{
		List<String> sc =lc.login_SubSections();
		Assert.assertEquals(13,sc.size() );
	}


}
