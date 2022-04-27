package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	@Parameters("Browser")
	@org.testng.annotations.Test
	public void main(String browser) throws InterruptedException {
		WebDriver driver = null;

		System.out.println("The latest browser " + browser);

		if (browser.contains("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			

		} else if (browser.contains("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.close();

	}

}
