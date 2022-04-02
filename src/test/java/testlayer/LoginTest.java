package testlayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseHRMClass;
import pompackage.PomLogin;

public class LoginTest extends BaseHRMClass {
	PomLogin Log;
	public LoginTest() {
		super();
	}
@BeforeMethod
public void initsetup() {
	initiation();
	
	Log=new PomLogin();
}
@Test
public void Title() {
	
	String actual=Log.verify();
	Assert.assertEquals(actual, "OrangeHRM");
	
}

@Test
public void username() throws InterruptedException {
	Log.typeusername("Admin");
	Thread.sleep(200);
}

@Test
public void password() throws InterruptedException {
Log.typepassword("admin");
Thread.sleep(300);
}

@Test
public void login() {
	Log.button();
}

@AfterMethod
public void close() {
	driver.close();
}
}
