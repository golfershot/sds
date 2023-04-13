package simple_frame_work;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame_work {
	public static Scanner sc = new Scanner(System.in);
	public static WebDriver driver;

//	public void web_driver() {
//		WebDriverManager.chromedriver().setup();
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = null;
//
//	}

	public void drivername() {

		System.out.print("Enter first number- ");
		String driver_name = null;
		driver_name =sc.next();

		if (driver_name.equals("chromedriver")) {
			WebDriverManager.chromedriver().setup();
			WebDriverManager.edgedriver().setup();
			WebDriver driver = null;
			driver = new ChromeDriver();
		} else if(driver_name.equals("edge")){
			WebDriverManager.chromedriver().setup();
			WebDriverManager.edgedriver().setup();
			WebDriver driver = null;
			driver = new EdgeDriver();
		}

	}

	public void open_url() {
		System.out.print("Enter the url");
		String url = null;
		url =sc.next();

		driver.get(url);

	}

}
