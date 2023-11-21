package selenium_introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//covered: strategies, drag and drop, page scroll, dropdown

public class myClass {
	public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        /*String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = ""; 	

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        //driver.navigate().to(baseUrl);
        driver.manage().window().maximize();

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        /*if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
            driver.close();
        }
        
        String username = "elakkiyalakshmanan";
        String password = "Open@123";
        
        //WebElement uname = driver.findElement(By.name("userName"));
        driver.findElement(By.name("userName")).sendKeys(username);;
        //WebElement pwd = driver.findElement(By.name("password"));
        driver.findElement(By.name("password")).sendKeys(password);;
        WebElement submit = driver.findElement(By.name("submit"));
        
        String expectedError = "Enter your userName and password correct";
        String actualError = ""; 	

        //uname.sendKeys(username);
        //pwd.sendKeys(password);
        if(submit.isEnabled()) {
        	//driver.highlight(submit);
        	submit.click();
        }
        actualError = driver.findElement(By.xpath("//span")).getText();
        System.out.println(actualError);
        if (actualError.contains(expectedError)){
            System.out.println("Test Passed!");
            //System.out.println("Login failed");
        } else {
            System.out.println("Test Failed");
        }
        
        driver.get("https://www.javatpoint.com/selenium-webdriver-commands");
        driver.navigate().back();
        driver.navigate().forward(); 
        
        //driver.quit();  
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        jse.executeScript("window.scrollBy(0,-250)");*/
        
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Select allDropDown = new Select(driver.findElement(By.id("searchDropdownBox")));
        allDropDown.selectByValue("search-alias=stripbooks");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("tintin");
        searchBox.sendKeys(Keys.ENTER);
        //driver.findElement(By.id("nav-search-submit-button")).click();
        
       
        //close Fire fox
        //driver.close();
	}

}
