package selenium_introduction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//coverd: Alerts, browser commands, navigation commands, WebElement commands, RadioButton and CheckBox

public class seleniumTutorial2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.get("http://test.rubywatir.com/radios.php");
		driver.manage().window().maximize();
		/*
		//driver.findElement(By.id("alertexamples")).click();
		driver.findElement(By.id("promptexample")).click();
		//Alert alert = driver.switchTo().alert();  
		Alert promptalert = driver.switchTo().alert(); 
        //System.out.println(alert.getText());
		promptalert.sendKeys("Alert Tutorial");
        //driver.wait();
		//Thread.sleep(5000);
        //Using accept() method to accept the alert box  
        promptalert.accept(); 
        //System.out.println(driver.getPageSource());
        */
		//radioButton
		driver.findElement(By.xpath("//input[@id='radioId']"));
		//driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[4]/div/label/input")).click();
		//driver.findElement(By.xpath("//input[@value = 'ta_IN']")).click();
		//driver.findElement(By.xpath("//i[@class= 'a-icon a-icon-radio']")).click();
		
		//radioButton from amazon page
		//driver.findElement(By.xpath("//span[text() = 'TA']")).click();
		
		
		//checkBox
		//driver.findElement(By.xpath("//input[@type= 'checkbox'][@value= 'red']")).click();
		
	}

}
