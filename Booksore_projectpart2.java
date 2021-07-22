package project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Booksore_projectpart2 {
    WebDriver W;
  @BeforeTest
  public void Setproperty() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Desktop\\Seleniumjar\\geckodriver.exe");
   		  W = new FirefoxDriver();
		  
		  W.get("https://demoqa.com/");
		  
		  System.out.println("Web browser launch");
  }
  @Test
  public void mainpage() throws InterruptedException {
	  
	WebElement	apps1=  W.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]"));
			JavascriptExecutor js1 = (JavascriptExecutor) W;
			
			js1.executeScript("arguments[0].scrollIntoView();" , apps1);
			
			apps1.click();
			
			System.out.println("page end");
		
			System.out.println("Current URL is " +W.getCurrentUrl());
			
			System.out.println(("Tittle of page is " +W.getTitle()));
  
  }
		//Defect without clicking on book store section it automatically opening the that section after ececution
		  
		  @Test(dependsOnMethods = {"mainpage"})
		  public void registerpage() throws InterruptedException {	  
			  
			  //***********************register section***********************
		  W.navigate().to("https://demoqa.com/login");
		  
		  W.findElement(By.id("newUser")).click();
		  
		W.findElement(By.id("firstname")).sendKeys("APPS");
		
		W.findElement(By.id("lastname")).sendKeys("T");
		
		W.findElement(By.id("userName")).sendKeys("APPS");
		
		W.findElement(By.id("password")).sendKeys("APPS44");
		
		//Validation is compulsory to register(i'm not robot)
		WebElement store1 =		W.findElement(By.id("register"));
		
		JavascriptExecutor jsstore1 = (JavascriptExecutor) W;
		
		jsstore1.executeScript("arguments[0].scrollIntoView();" , store1);
		
		store1.click();
		
		
		//MAJOR DEFECT REGISTER BUTON SHOULD NOT CLICK
		Thread.sleep(4000);
		
WebElement store=		W.findElement(By.id("gotologin"));
	
		JavascriptExecutor jsstore = (JavascriptExecutor) W;
		
		jsstore.executeScript("arguments[0].scrollIntoView();" , store);
		
		store.click();
  }
		
   @Test(dependsOnMethods = {"registerpage"})
 public void bookpage() throws InterruptedException {
	 //***********************BOOK SECTION***********
		
	   	W.navigate().to("https://demoqa.com/books");
	   	

	   	//*******************Git Pocket book***************************
	   	WebElement book1=		W.findElement(By.linkText("Git Pocket Guide"));
	   	
	   	JavascriptExecutor jsbook1 = (JavascriptExecutor) W;
	   	
	   	jsbook1.executeScript("arguments[0].scrollIntoView();" , book1);
	   	
	   	book1.click();
	   	
	   	
	      WebElement click1=		W.findElement(By.id("addNewRecordButton"));
	   	
	   	JavascriptExecutor jsclick1 = (JavascriptExecutor) W;
	   	
	   	jsclick1.executeScript("arguments[0].scrollIntoView();" , click1);
	   	
	   	click1.click();
	   	
	   	Thread.sleep(4000);
     	
	   	//***********Designing Evaluable ***********************
	   	WebElement book3=		W.findElement(By.linkText("Designing Evolvable Web APIs with ASP.NET"));
	   	
	   	JavascriptExecutor jsbook3 = (JavascriptExecutor) W;
	   	
	   	jsbook3.executeScript("arguments[0].scrollIntoView();" , book3);
	   	
	   	book3.click();
	   	
	   	
	      WebElement click3=		W.findElement(By.id("addNewRecordButton"));
	   	
	   	JavascriptExecutor jsclick3 = (JavascriptExecutor) W;
	   	
	   	jsclick3.executeScript("arguments[0].scrollIntoView();" , click3);
	   	
	   	click3.click();
	   	
	   	Thread.sleep(4000);
	   	
	   	//********************Speaking Javascript******************
	   	WebElement book4=		W.findElement(By.linkText("Speaking JavaScript"));
	   	
	   	JavascriptExecutor jsbook4 = (JavascriptExecutor) W;
	   	
	   	jsbook4.executeScript("arguments[0].scrollIntoView();" , book4);
	   	
	   	book4.click();
	   	
	   	
	      WebElement click4=		W.findElement(By.id("addNewRecordButton"));
	   	
	   	JavascriptExecutor jsclick4 = (JavascriptExecutor) W;
	   	
	   	jsclick4.executeScript("arguments[0].scrollIntoView();" , click4);
	   	
	   	click4.click();
	   	
	   	Thread.sleep(4000);
	   	
	   	//**********************You Don't Know**********************
	   	WebElement book5=		W.findElement(By.linkText("You Don't Know JS"));
	   	
	   	JavascriptExecutor jsbook5 = (JavascriptExecutor) W;
	   	
	   	jsbook5.executeScript("arguments[0].scrollIntoView();" , book5);
	   	
	   	book5.click();
	   	
	   	
	      WebElement click5= W.findElement(By.id("addNewRecordButton"));
	   	
	   	JavascriptExecutor jsclick5 = (JavascriptExecutor) W;
	   	
	   	jsclick5.executeScript("arguments[0].scrollIntoView();" , click5);
	   	
	   	click5.click();
	   	
	   	Thread.sleep(4000);
	   	
	   	//*****************Programming script*****************************
	   	
	   	
	   	WebElement book6 = W.findElement(By.linkText("Programming JavaScript Applications"));
	   	
	   	JavascriptExecutor jsbook6 = (JavascriptExecutor) W;
	   	
	   	jsbook6.executeScript("arguments[0].scrollIntoView();" , book6);
	   	
	   	book6.click();
	   	
	   	
	      WebElement click6=		W.findElement(By.id("addNewRecordButton"));
	   	
	   	JavascriptExecutor jsclick6 = (JavascriptExecutor) W;
	   	
	   	jsclick6.executeScript("arguments[0].scrollIntoView();" , click6);
	   	
	   	click6.click();
	   	
	   	Thread.sleep(4000);
	   	
	   	//************************************Eloquent javascript*******************
	   	WebElement book7= W.findElement(By.linkText("Eloquent JavaScript, Second Edition"));
	   	
	   	JavascriptExecutor jsbook7 = (JavascriptExecutor) W;
	   	
	   	jsbook7.executeScript("arguments[0].scrollIntoView();" , book7);
	   	
	   	book7.click();
	   	
	   	
	      WebElement click7=		W.findElement(By.id("addNewRecordButton"));
	   	
	   	JavascriptExecutor jsclick7 = (JavascriptExecutor) W;
	   	
	   	jsclick7.executeScript("arguments[0].scrollIntoView();" , click7);
	   	
	   	click7.click();
	   	
	   	Thread.sleep(4000);
	   	
	   	//*********************Understanding ECMAScript********************
	   	WebElement book8=		W.findElement(By.linkText("Understanding ECMAScript 6"));
	   	
	   	JavascriptExecutor jsbook8 = (JavascriptExecutor) W;
	   	
	   	jsbook8.executeScript("arguments[0].scrollIntoView();" , book8);
	   	
	   	book8.click();
	   	
	   	
	      WebElement click8=		W.findElement(By.id("addNewRecordButton"));
	   	
	   	JavascriptExecutor jsclick8 = (JavascriptExecutor) W;
	   	
	   	jsclick8.executeScript("arguments[0].scrollIntoView();" , click8);
	   	
	   	click8.click();
	   	
	   	Thread.sleep(4000);
	   	
	   	
	   	
	   	
	   W.findElement(By.xpath("//input[@id='searchBox']")).sendKeys("Git Pocket Guide");
	   	
	   	W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/*[1]")).click();
	   		
	   	Thread.sleep(3000);
	   		W.findElement(By.id("login")).click();
   }
		
	
   @Test(enabled = false)
   public void bookpage2() throws InterruptedException {
  	//**********Learning Javascript***********************
  	WebElement book2=		W.findElement(By.linkText("Learning JavaScript Design Patterns"));
  	
  	JavascriptExecutor jsbook2 = (JavascriptExecutor) W;
  	
  	jsbook2.executeScript("arguments[0].scrollIntoView();" , book2);
  	
  	book2.click();
   }	
  	//till here it is working but there is defect during excution it unable to click buton BACKTO BOOK STORE
   
   @Test(dependsOnMethods = {"bookpage"})
   public void profilepage() throws InterruptedException {
		//***************Profile section*************************
	W.navigate().to("https://demoqa.com/profile");
	
	Thread.sleep(2000);
	W.findElement(By.linkText("login")).click();
	System.out.println("title " +W.getTitle());
	System.out.println("URL " +W.getCurrentUrl());
	Thread.sleep(2000);
	
	W.navigate().to("https://demoqa.com/profile");
	Thread.sleep(2000);
	W.findElement(By.linkText("register")).click();
	System.out.println("title " +W.getTitle());
	System.out.println("URL " +W.getCurrentUrl());
   }
	
   @Test(dependsOnMethods = {"profilepage"})
   public void bookapipage() throws InterruptedException {
	 //*************************************Book API*******************  
	   W.navigate().to("https://demoqa.com/swagger/");
	   Thread.sleep(3000);
	   JavascriptExecutor js = (JavascriptExecutor) W;
		
	 		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	 		
	 		System.out.println("page end");
	 		
	 		Thread.sleep(5000);
   }
  @AfterTest
  public void afterTest() {
	  W.close();
  }

}
