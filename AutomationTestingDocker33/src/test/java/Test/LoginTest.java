package Test;

import Base.BaseTest;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginTest extends BaseTest
{
@Test
public void verifyLogin()
{
new LoginPage(driver).login("Admin","admin123");
Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
}
}