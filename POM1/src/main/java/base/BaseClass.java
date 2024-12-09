package base;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static RemoteWebDriver driver;

	@BeforeMethod(alwaysRun=true)
	public void preCondition() {
		driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@AfterMethod
	public void postcondition() {
		driver.close();
	}
}
