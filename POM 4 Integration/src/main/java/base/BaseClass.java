package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class BaseClass {

	public  RemoteWebDriver driver;
	public String fileName;

	@BeforeMethod(alwaysRun=true)
	public void preCondition() {
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@AfterMethod
	public void postcondition() {
		driver.close();
	}
	
	@DataProvider(name="data1")
	public String[][] sendData() throws IOException {
		
return ReadExcel.readData(fileName);
	}
}
