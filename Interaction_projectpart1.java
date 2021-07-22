package project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Interaction_projectpart1 {
  WebDriver W;
  @BeforeTest
  public void Set() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Desktop\\Seleniumjar\\geckodriver.exe");
		  W = new FirefoxDriver();
	  
	  W.get("https://demoqa.com/");
	  
	  System.out.println("Web browser launch");
  }
  @Test
  public void mainpage1() throws InterruptedException {
	  WebElement	apps1=  W.findElement(By.xpath("//h5[contains(text(),'Interactions')]"));
		JavascriptExecutor js1 = (JavascriptExecutor) W;
		
		js1.executeScript("arguments[0].scrollIntoView();" , apps1);
		
		apps1.click();
		
		System.out.println("scrollintoview");
	  Thread.sleep(2000);
	  
	  
	  JavascriptExecutor js = (JavascriptExecutor) W;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		System.out.println("page end");
		
		System.out.println("Current URL is " +W.getCurrentUrl());
		
		System.out.println(("Tittle of page is " +W.getTitle()));
		
		// While excuting without clicking an arrow it automatically open the subsection of interaction
		
	//Interaction subsection  unable to click by scripting method
		
	
  }
		
		//**********************************************************Subsection sortable***********************************************
         @Test(dependsOnMethods = {"mainpage1"})
          public void sortablepage() throws InterruptedException {
          W.navigate().to("https://demoqa.com/sortable");
          
          
		//*****************************List Section***************************************
		         //*******************Drag****************************************
				WebElement draglist1 = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
				WebElement draglist2 = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]"));
				
				
				WebElement draglist3 = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]"));
				WebElement draglist4 = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]"));
				WebElement draglist5 = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]"));

				
				WebElement draglist6 = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]"));
				
				//*********************************Drop***********************************
				WebElement droplist6 = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]"));
				WebElement droplist5 = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]"));
				WebElement droplist4 = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]"));
				WebElement droplist3 = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]"));
				WebElement droplist2 = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]"));
				WebElement droplist1 = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
				Actions act = new Actions(W);
				
				act.dragAndDrop(draglist1, droplist6).build().perform();
			Thread.sleep(3000);
				act.dragAndDrop(draglist6, droplist1).build().perform();
				
				Thread.sleep(3000);
				act.dragAndDrop(draglist2, droplist5).build().perform();
			Thread.sleep(3000);
				act.dragAndDrop(draglist5, droplist2).build().perform();
				
				Thread.sleep(3000);
				act.dragAndDrop(draglist3, droplist4).build().perform();
			Thread.sleep(3000);
				act.dragAndDrop(draglist4, droplist3).build().perform();
				
				Thread.sleep(3000);
				
				//************************************Grid section************************************
				
	W.findElement(By.linkText("Grid")).click();
					
	WebElement draggrid1  = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
					
    WebElement dropgrid9  = W.findElement(By.xpath("//div[contains(text(),'Nine')]"));
					
	WebElement draggrid2  = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
					
    WebElement dropgrid8  = W.findElement(By.xpath("//div[contains(text(),'Eight')]"));
					
					
	WebElement draggrid3  = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
						
    WebElement dropgrid7  = W.findElement(By.xpath("//div[contains(text(),'Seven')]"));	
						
	 WebElement draggrid4  = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
						
     WebElement dropgrid6  = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]"));	
						
	 WebElement draggrid5  = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
						
	WebElement dropgrid4  = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]"));	
						
	WebElement draggrid6  = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
						
	WebElement dropgrid5  = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]"));	
		
	
	 WebElement draggrid7 = W.findElement(By.xpath("//div[contains(text(),'Seven')]"));
							
	WebElement dropgrid3  = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]"));	
							
	WebElement draggrid8 = W.findElement(By.xpath("//div[contains(text(),'Eight')]"));
								
	WebElement dropgrid2  = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]"));	
								
	WebElement draggrid9 = W.findElement(By.xpath("//div[contains(text(),'Nine')]"));
									
	WebElement dropgrid1  = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[9]"));	
	Actions act1 = new Actions(W);
				
	act1.dragAndDrop(draggrid1, dropgrid9).build().perform();
	Thread.sleep(5000);
	act1.dragAndDrop(draggrid2, dropgrid8).build().perform();
	Thread.sleep(5000);
				
	act1.dragAndDrop(draggrid3, dropgrid7).build().perform();
	Thread.sleep(5000);
					
	act1.dragAndDrop(draggrid4, dropgrid6).build().perform();
	Thread.sleep(5000);
	act1.dragAndDrop(draggrid5, dropgrid4).build().perform();
	Thread.sleep(5000);
	act1.dragAndDrop(draggrid6, dropgrid5).build().perform();
	Thread.sleep(5000);
				
    act1.dragAndDrop(draggrid7, dropgrid3).build().perform();
	Thread.sleep(5000);
				
	act1.dragAndDrop(draggrid8, dropgrid2).build().perform();
	Thread.sleep(5000);
	act1.dragAndDrop(draggrid9, dropgrid1).build().perform();
	Thread.sleep(5000);
				
  }
		 
		//***************************Selectable subsection ******************************************
		 
		 @Test(dependsOnMethods = {"sortablepage"})
		  public void selectablepage() throws InterruptedException {
		W.navigate().to("https://demoqa.com/selectable");

		//************************************Listsection *************************************		
		W.findElement(By.xpath("//li[contains(text(),'Cras justo odio')]")).click();

		W.findElement(By.xpath("//li[contains(text(),'Dapibus ac facilisis in')]")).click();

		W.findElement(By.xpath("//li[contains(text(),'Morbi leo risus')]")).click();

		W.findElement(By.xpath("//li[contains(text(),'Porta ac consectetur ac')]")).click();

		Thread.sleep(5000);

		W.findElement(By.xpath("//li[contains(text(),'Dapibus ac facilisis in')]")).click();

		W.findElement(By.xpath("//li[contains(text(),'Morbi leo risus')]")).click();

		W.findElement(By.xpath("//li[contains(text(),'Cras justo odio')]")).click();

		W.findElement(By.xpath("//li[contains(text(),'Porta ac consectetur ac')]")).click();	

		//********************************Gridsection*********************************

		W.findElement(By.linkText("Grid")).click();

		W.findElement(By.xpath("//li[contains(text(),'One')]")).click();

		W.findElement(By.xpath("//li[contains(text(),'Two')]")).click();

		W.findElement(By.xpath("//li[contains(text(),'Three')]")).click();

		W.findElement(By.xpath("//li[contains(text(),'Four')]")).click();

		W.findElement(By.xpath("//li[contains(text(),'Five')]")).click();

		W.findElement(By.xpath("//li[contains(text(),'Six')]")).click();

		//unable to click 7,8,9 by scripting method

		//W.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/li[1]")).click();

		//W.findElement(By.xpath("//li[contains(text(),'Eight')]")).click();

		//W.findElement(By.xpath("//li[contains(text(),'Nine')]")).click();

		Thread.sleep(5000);

		W.findElement(By.xpath("//li[contains(text(),'One')]")).click();

		W.findElement(By.xpath("//li[contains(text(),'Two')]")).click();

		W.findElement(By.xpath("//li[contains(text(),'Three')]")).click();

		W.findElement(By.xpath("//li[contains(text(),'Four')]")).click();

		W.findElement(By.xpath("//li[contains(text(),'Five')]")).click();

		W.findElement(By.xpath("//li[contains(text(),'Six')]")).click();

		//W.findElement(By.xpath("//li[contains(text(),'Seven')]")).click();

		//W.findElement(By.xpath("//li[contains(text(),'Eight')]")).click();

		//W.findElement(By.xpath("//li[contains(text(),'Nine')]")).click(); 
		 }
		 
		//****************************Resizable subsection*************************************

	      @Test(dependsOnMethods = {"selectablepage"})
		  public void resizablepage() throws InterruptedException {
	      W.navigate().to("https://demoqa.com/resizable");


		 WebElement resizeElement = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/span[1]"));

		 WebElement resizeElement1 = W.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/span[1]"));
		 Actions actionsResize = new Actions(W);

		 //provide the x and y offset values
		 actionsResize.dragAndDropBy(resizeElement, 150, 170).perform();
		 Thread.sleep(3000);
		 JavascriptExecutor js23 = (JavascriptExecutor) W;

		 js23.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		 System.out.println("page end");

		 actionsResize.dragAndDropBy(resizeElement1, 100, 50).perform();
		 Thread.sleep(3000);
		 System.out.println("Done Resizing");
		 }
		 //************************************Dropable subsection*************************************************

		 @Test(dependsOnMethods = {"resizablepage"})
		  public void dropablepage() throws InterruptedException {
		 W.navigate().to("https://demoqa.com/droppable");

		          //*****************Simple*************************
		 WebElement dragsimple = W.findElement(By.id("draggable"));

		 WebElement dropsimple = W.findElement(By.id("droppable"));

		 Actions actsimple = new Actions(W);

		 actsimple.dragAndDrop(dragsimple, dropsimple).build().perform();
		 Thread.sleep(3000);

		              //****Accept******
		 W.findElement(By.linkText("Accept")).click();

		 WebElement dragaccept1 = W.findElement(By.id("acceptable"));

		 WebElement dragaccept2 = W.findElement(By.id("notAcceptable"));

		 WebElement dropaccept = W.findElement(By.xpath("//div[@id='acceptDropContainer']//div[@id='droppable']"));

		 Actions actaccept = new Actions(W);

		 actaccept.dragAndDrop(dragaccept1, dropaccept).build().perform();

		 actaccept.dragAndDrop(dragaccept2, dropaccept).build().perform();

		 //***************Prevent Propogation******************************
			
		//Not excuting according to requirement

		 //*************************Revert*************************
		 W.findElement(By.linkText("Revert Draggable")).click();

		 WebElement dragrevert1 = W.findElement(By.id("revertable"));

		 WebElement dragrevert2 = W.findElement(By.id("notRevertable"));

		 WebElement droprevert = W.findElement(By.xpath("//div[@id='revertableDropContainer']//div[@id='droppable']"));

		 Actions actrevert = new Actions(W);

		 actrevert.dragAndDrop(dragrevert1, droprevert).build().perform();

		 actrevert.dragAndDrop(dragrevert2, droprevert).build().perform();
		 }
		 

		 //***************Prevent Propogation******************************
			
		//Not excuting according to requirement
		 
		 @Test(enabled = false)
		  public void preventsection() throws InterruptedException {
	 W.findElement(By.linkText("Prevent Propogation")).click();

	 WebElement dragprevent1 = W.findElement(By.id("dragBox"));

	 WebElement dropprevent1 = W.findElement(By.id("notGreedyInnerDropBox"));

	 //WebElement dragprevent2 = W.findElement(By.xpath("//div[@id='dragBox']"));
	 WebElement dropprevent2 = W.findElement(By.xpath("//div[@id='greedyDropBoxInner']"));

	 Actions actprevent = new Actions(W);

	 actprevent.dragAndDrop(dragprevent1, dropprevent1).build().perform();
	 Thread.sleep(3000);

	 actprevent.dragAndDrop(dragprevent1, dropprevent2).build().perform();
		}

		//*****************************Dragable section****************************************
		
		 @Test(dependsOnMethods = {"dropablepage"})
		  public void dragablepage() throws InterruptedException {
		 W.navigate().to("https://demoqa.com/dragabble");
		 
		//********************Simple***********************
		 
		WebElement dragable=W.findElement(By.xpath("//div[@id='dragBox']"));
		Actions actdrag=new Actions(W);
		actdrag.dragAndDropBy(dragable, 60, 70).build().perform();

		//*********************Axis restricted************************

		W.findElement(By.id("draggableExample-tab-axisRestriction")).click();

		WebElement dragaxisX=W.findElement(By.id("restrictedX"));
		WebElement dragaxisY = W.findElement(By.id("restrictedY"));
		Actions actaxis=new Actions(W);
		actaxis.dragAndDropBy(dragaxisX, 80, 0).build().perform();

		actaxis.dragAndDropBy(dragaxisY, 0, 100).build().perform();
		

		//************************Container restricted***********************
		W.findElement(By.id("draggableExample-tab-containerRestriction")).click();

		WebElement dragcontainer=W.findElement(By.xpath("//div[contains(text(),\"I'm contained within the box\")]"));

		Actions actcont=new Actions(W);
		actcont.dragAndDropBy(dragcontainer, 60, 90).build().perform();


		JavascriptExecutor jscontainer = (JavascriptExecutor) W;

		jscontainer.executeScript("window.scrollBy(0,300)");
		//js.executeScript("window.scrollBy(0,3000)");

		W.manage().window().maximize();
		Thread.sleep(2000);
		 
		
		//2nd box not exceuting as per requirement
		//TakesScreenshot t = (TakesScreenshot) W;

	//	File src = t.getScreenshotAs(OutputType.FILE);

	//	Files.copy(src, new File("F:\\Screenshot\\container12.png"));
		 }
		//***********************Cursor**********************

		@Test(enabled = false)
		  public void cursorsection() throws InterruptedException {
		W.findElement(By.linkText("Cursor Style")).click();

		WebElement dragcursor = W.findElement(By.id("cursorCenter"));
		Actions actcursor=new Actions(W);
		actcursor.dragAndDropBy(dragcursor, 170,100).build().perform();
		Thread.sleep(3000);
		WebElement dragcursor1= W.findElement(By.id("cursorTopLeft"));
		Actions actcursor1 =new Actions(W);
		actcursor1.dragAndDropBy(dragcursor1, 0, 40).build().perform();

		WebElement dragcursor2 = W.findElement(By.xpath("//span[contains(text(),'My cursor is at bottom')]"));

		Actions actcursor2 =new Actions(W);
		actcursor2.dragAndDropBy(dragcursor1, 60, 0).build().perform();
		 }

		//cursor not moving as per the script
  @AfterTest
  public void afterTest() {
	  W.close();
  }

}
