package com.orangehrm.generic;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class orangehrmtime {

	static FileInputStream fis;
	static Properties p;

	@FindBy(xpath = "//input[@name='username']")
	private WebElement input;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement key;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbutton;

	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logoutbutton;

	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	private WebElement invalidmessage;

	@FindBy(xpath = "//span[.='Required']")
	private WebElement blankrequired;

	@FindBy(xpath = "//a[.='OrangeHRM, Inc']")
	private WebElement orangeinc;

	@FindBy(xpath = "//span[.='Time']")

	private WebElement timelink;

	@FindBy(xpath = "//span[.='Attendance ']")

	private WebElement attendancelink; 

	@FindBy(xpath = "//a[.='Punch In/Out']")
	private WebElement punchinoutlink;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private WebElement inbuttoninout;

	@FindBy(xpath = "//textarea[@placeholder='Type here']")
	private WebElement outtextbox;

	@FindBy(xpath = "//textarea[@placeholder='Type here']")
	private WebElement intextbox;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private WebElement outbuttoninout;

	@FindBy(xpath = "//a[.='My Records']")
	private WebElement myrecordlink; 

	@FindBy(xpath = "//button[.=' View ']")
	private WebElement viewbutton; 

	@FindBy(xpath = "//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
	private WebElement calanderbuttoninmyrecord; 

	@FindBy(xpath = "//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
	private WebElement puncincalander; 

	@FindBy(xpath = "//input[@placeholder='yyyy-mm-dd']")
	private WebElement dateboxinmyrecord; 

	@FindBy(xpath = "//span[.='Should be a valid date in yyyy-mm-dd format']")
	private WebElement myrecorddateinmessage; 

	@FindBy(xpath = "(//button[@type='button'])[5]")
	private WebElement editbuttonmyrec; 

	@FindBy(xpath = "//button[.=' Save ']")
	private WebElement savebuttoneditrec; 

	@FindBy(xpath = "//button[.=' Cancel ']")
	private WebElement cancelbuttoneditrec; 

	@FindBy(xpath = "//div[@class='oxd-date-input-link --today']")
	private WebElement todaybuttononout; 

	@FindBy(xpath = "//div[.='Today']")
	private WebElement todaybuttononin; 
	
	@FindBy(xpath = "(//div[.='1'])[2]")
	private WebElement beforedateonin;

	@FindBy(xpath = "//i[@class='oxd-icon bi-clock oxd-time-input--clock']")
	private WebElement timebuttonout;

	@FindBy(xpath = "//i[@class='oxd-icon bi-chevron-down oxd-icon-button__icon oxd-time-hour-input-down']")
	private WebElement timedownouricon;

	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	private WebElement invalidtimemessage;

	@FindBy(xpath = "//span[.='Overlapping Records Found']")
	private WebElement invalidtimeoninmessage;

	@FindBy(xpath = "(//div[.='1'])[2]")
	private WebElement beforedateinout;       

	@FindBy(xpath = "//div[.='Clear']")
	private WebElement calenderclear;  

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement datetextbox;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement punchoutdatebox; 

	@FindBy(xpath = "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[2]")
	private WebElement singlecheckbox;

	@FindBy(xpath = "(//button[@type='button'])[4]")
	private WebElement deletselectedinrec;

	@FindBy(xpath = "//button[.=' Yes, Delete ']")
	private WebElement yesdeletbutton;

	@FindBy(xpath = "//button[.=' No, Cancel ']")
	private WebElement nocancelbutton;

	@FindBy(xpath = "//button[.='×']")
	private WebElement xbutton;

	@FindBy(xpath = "(//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input'])[1]")
	private WebElement deletallceckbox;

	@FindBy(xpath = "//div[.='Today']")
	private WebElement todaybuttononcalender;

	@FindBy(xpath = "//i[@class='oxd-icon bi-clock oxd-time-input--clock']")
	private WebElement clockbuttoninout;

	@FindBy(xpath = "//i[@class='oxd-icon bi-chevron-down oxd-icon-button__icon oxd-time-hour-input-down']")
	private WebElement timedownbutton;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[1]")
	private WebElement calender1;

	@FindBy(xpath = "//div[.='Clear']")
	private WebElement clear1;

	@FindBy(xpath = "//div[@class='oxd-date-input-link --clear']")
	private WebElement clear2;

	@FindBy(xpath ="(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[2]")
	private WebElement calender2;

	@FindBy(xpath = "//input[@placeholder='yyyy-mm-dd']")
	private WebElement dateboxinrec;

	@FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[2]")
	private WebElement conf2 ;	

	@FindBy(xpath = "//a[.='Configuration']")
	private WebElement cofriglink;

	@FindBy(xpath = "//button[.=' Save ']")
	private WebElement cofrigsavebutton;

	@FindBy(xpath = "(//ul[@role='menu']//..)[8]")
	private WebElement myempreclink;

	@FindBy(xpath = "(//button[.=' View '])[1]")
	private WebElement myempviewbut;

	@FindBy(xpath = "(//button[.=' View '])[2]")
	private WebElement myempviewbut1;

	@FindBy(xpath = "(//button[@type='button'])[4]")
	private WebElement myempaddbut;

	@FindBy(xpath = "//button[.=' In ']")
	private WebElement myempinpunch;

	@FindBy(xpath = "//button[.=' Out ']")
	private WebElement myempoutpunch;

	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']/..")
	private WebElement myempname;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement myempnametextbox;

	@FindBy(xpath = "(//div[.='1'])[2]")
	private WebElement myrecbeforedate;

	@FindBy(xpath = "(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[1]")
	private WebElement deletbuttonmyrec;

	@FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[1]")
	private WebElement confrig1;

	@FindBy(xpath = "(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[2]")
	private WebElement editbuttononemprec;

	@FindBy(xpath = "(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[1]")
	private WebElement deletbuttononemprec;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	private WebElement timezonebutton1;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private WebElement timezonebutton2;	

	@FindBy(xpath = "(//div[@role='option'])[2]")
	private WebElement zone1;	

	@FindBy(xpath = "(//div[@role='option'])[2]")
	private WebElement zone2;	

	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
	private WebElement logoutlogo;	

	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logout;	

	@FindBy(xpath = "//span[.='Overlapping Records Found']")
	private WebElement olfeditrecord;	

	@FindBy(xpath = "//span[.='Overlapping Records Found']")
	private List<WebElement> message3;

	@FindBy(xpath = "//span[.='Punch out Time Should Be Later Than Punch in Time']")
	private List<WebElement> message4;

	@FindBy(xpath = "//span[.='Should be a valid date in yyyy-mm-dd format']")
	private WebElement message14;

	@FindBy(xpath = "//span[.='Punch out Time Should Be Later Than Punch in Time']")
	private List<WebElement> message16;	

	@FindBy(xpath = "//span[.='Required']")
	private List<WebElement> message17;

	@FindBy(xpath = "//span[.='No Records Found']")
	private List<WebElement> message18;	

	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span']")
	private WebElement message20a;	

	@FindBy(xpath = "//div[@class='oxd-table-row oxd-table-row--with-border']")
	private List<WebElement> message20b;	

	@FindBy(xpath = "//div[@class='oxd-table-row oxd-table-row--with-border']")
	private List<WebElement> message24;	

	@FindBy(xpath = "//span[.='No Records Found']")
	private WebElement message25;

	@FindBy(xpath = "//div[@class='oxd-table-row oxd-table-row--with-border']")
	private List<WebElement> message27;

	public orangehrmtime(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	WebDriver driver;
	//verify that user login with valid user name and valid password
	public void TC001() throws IOException
	{
		fis=new FileInputStream("./data/orangehrm.txt");
		p= new Properties();
		p.load(fis);
		String lock = p.getProperty("uname");
		String pwd = p.getProperty("pword");
		input.sendKeys(lock);
		key.sendKeys(pwd);
		loginbutton.click();	
	}

	//verify  the actions performed on IN and OUT button on punch out page by clicking on today button on calendar
	public void TC002() throws InterruptedException
	{
		timelink.click();
		Thread.sleep(5000);
		attendancelink.click();
		Thread.sleep(5000);
		punchinoutlink.click();
		Thread.sleep(5000);
		calanderbuttoninmyrecord.click();
		Thread.sleep(5000);
		todaybuttononout.click();
		Thread.sleep(4000);
		outbuttoninout.submit();
		Thread.sleep(10000);
		calanderbuttoninmyrecord.click();
		Thread.sleep(7000);
		todaybuttononin.submit();
		Thread.sleep(5000);
		inbuttoninout.submit();
	}
	//verify  the actions performed on IN button on punch in page by selecting   before  date in calendar
	public void TC003() throws InterruptedException
	{
		Thread.sleep(10000);
		calanderbuttoninmyrecord.click();
		Thread.sleep(8000);
		beforedateonin.click();
		Thread.sleep(8000);
		inbuttoninout.submit();
		int count = message3.size();
		for (int i = 0; i < count; i++) {
			String text = message3.get(i).getText();
			Reporter.log(text,true);
		}

	}
	//verify by  selecting valid current date and time in IN punch and selecting valid current date and before time in OUT punch
	public void TC004() throws InterruptedException
	{
		attendancelink.click();
		Thread.sleep(5000);
		punchinoutlink.click();
		Thread.sleep(10000);
		inbuttoninout.submit();
		Thread.sleep(10000);
		clockbuttoninout.click();
		Thread.sleep(10000);
		timedownbutton.click();
		Thread.sleep(7000);
		outbuttoninout.submit();
		int count = message4.size();
		for (int i = 0; i < count; i++) {
			String text = message4.get(i).getText();
			Reporter.log(text,true);
		}
		attendancelink.click();
		Thread.sleep(5000);
		punchinoutlink.click();
		Thread.sleep(5000);
		outbuttoninout.submit();
		
	}
	//verify by  selecting valid current date and time in IN punch and invalid  before date OUT punch
	public void TC005() throws InterruptedException
	{
		Thread.sleep(7000);
		inbuttoninout.submit();
		Thread.sleep(10000);
		calanderbuttoninmyrecord.click();
		Thread.sleep(5000);
		beforedateinout.click();
		Thread.sleep(7000);
		attendancelink.click();
		Thread.sleep(7000);
		punchinoutlink.click();
		Thread.sleep(7000);
		outbuttoninout.submit();
	}
	//verify by entering  invalid data in date text box in punch in page
	public void TC006() throws InterruptedException
	{   
		attendancelink.click();
		Thread.sleep(5000);
		punchinoutlink.click();
		Thread.sleep(7000);
		punchoutdatebox.sendKeys("Automation");
		Thread.sleep(10000);
		inbuttoninout.click();
	}
	//verify the calendar clear  button in punch in page
	public void TC007() throws InterruptedException
	{
		attendancelink.click();
		Thread.sleep(5000);
		punchinoutlink.click();
		Thread.sleep(5000);
		outtextbox.sendKeys(" punch");
		calanderbuttoninmyrecord.click();
		Thread.sleep(8000);
		calenderclear.click();
		Thread.sleep(5000);
		outbuttoninout.submit();
		Thread.sleep(8000);
		outbuttoninout.submit();
	}
	
	//verify the action perform on disable the Employee can change current time when punching in/out on  configuration page
	public void TC009() throws InterruptedException
	{ 
		attendancelink.click();
		Thread.sleep(7000);
		cofriglink.click();
		Thread.sleep(6000);
		confrig1.click();
		Thread.sleep(10000);
		cofrigsavebutton.click();
	}
	//verify  the actions performed on IN and OUT button on punch out page without selecting date and time
	public void TC010() throws InterruptedException
	{
		Thread.sleep(3000);
		attendancelink.click();
		Thread.sleep(3000);
		punchinoutlink.click();
		Thread.sleep(3000);
		outtextbox.sendKeys("punch");
		Thread.sleep(2000);
		outbuttoninout.submit();
		Thread.sleep(2000);
		intextbox.sendKeys("punch");
		Thread.sleep(5000);
		inbuttoninout.submit();
		Thread.sleep(9000);	
	}
	//verify the action perform on enable the Employee can change current time when punching in/out on  configuration page
	public void TC011() throws InterruptedException
	{ 
		Thread.sleep(9000);
		attendancelink.click();
		Thread.sleep(9000);
		cofriglink.click();
		Thread.sleep(5000);
		confrig1.click();
		Thread.sleep(9000);
		cofrigsavebutton.click();
	}

	//verify  the actions performed on view  button on my attendance  record page by selecting today date
	public void TC013() throws InterruptedException
	{    
		attendancelink.click();
		myrecordlink.click();
		calanderbuttoninmyrecord.click();
		Thread.sleep(5000);
		todaybuttononcalender.click();
		Thread.sleep(9000);
		viewbutton.click();
	}
	//verify  the actions performed on view  button on my attendance  record page by clear and entering invalid data in date text box 
	public void TC014() throws InterruptedException
	{
		Thread.sleep(8000);
		calanderbuttoninmyrecord.click();
		Thread.sleep(8000);
		calenderclear.click();
		Thread.sleep(8000);
		dateboxinrec.sendKeys("selenium 100S");
		Thread.sleep(8000);
		viewbutton.click();
		Thread.sleep(5000);
		String text = myrecorddateinmessage.getText();
		Reporter.log(text,true);

	}
	//verify  the actions performed on cancel   button on edit  attendance  records  page
	public void TC015() throws InterruptedException
	{  
		attendancelink.click();
		Thread.sleep(8000);
		myrecordlink.click();
		Thread.sleep(8000);
		editbuttonmyrec.click();
		Thread.sleep(8000);
		cancelbuttoneditrec.click();
		Thread.sleep(8000);

	}
	//verify  the actions performed on save  button on edit  attendance  records  page by selecting current date in IN punch and selecting before  date in OUT punch 
	public void TC016() throws InterruptedException
	{  
		Thread.sleep(3000);
		editbuttonmyrec.click();
		Thread.sleep(10000);
		calender2.click();
		Thread.sleep(10000);
		myrecbeforedate.click();
		Thread.sleep(5000);
		savebuttoneditrec.click();
		Thread.sleep(7000);
		int count = message16.size();
		for (int i = 0; i < count; i++) {
			String text = message16.get(i).getText();
			Reporter.log(text,true);
		}
	}
	//verify  the actions performed on save  button on edit attendance  record page by clear and entering invalid data in date text box 
	public void TC017() throws InterruptedException
	{  
		attendancelink.click();		
		Thread.sleep(5000);
		myrecordlink.click();
		Thread.sleep(5000);
		editbuttonmyrec.click();
		Thread.sleep(10000);
		calender1.click();
		Thread.sleep(10000);
		clear1.click();
		Thread.sleep(10000);
		calender2.click();
		Thread.sleep(10000);
		clear2.click();
		Thread.sleep(5000);
		int count = message17.size();
		for (int i = 0; i < count; i++) {
			String text = message17.get(i).getText();
			Reporter.log(text,true);
		}

	}
	//verify  the actions performed on view  button on edit attendance  record page by entering invalid date in date text box 
	public void TC018() throws InterruptedException
	{  
		attendancelink.click();
		Thread.sleep(4000);
		myrecordlink.click();
		Thread.sleep(4000);
		calanderbuttoninmyrecord.click();
		Thread.sleep(4000);
		myrecbeforedate.click();
		Thread.sleep(4000);
		viewbutton.click();	
		Thread.sleep(4000);
		int count = message18.size();
		for (int i = 0; i < count ; i++) {
			String text = message18.get(i).getText();
			Reporter.log(text,true);
		}

	}

	//verify the action perform on disable the Employee can edit/delete own attendance records option on configuration page
	public void TC019() throws InterruptedException
	{
		attendancelink.click();
		Thread.sleep(5000);
		cofriglink.click();
		Thread.sleep(5000);
		conf2.click();
		Thread.sleep(9000);
		cofrigsavebutton.click();
	}
	//verify  the actions performed on view  button on my attendance  record page
	public void TC020() throws InterruptedException
	{  
		timelink.click();
		attendancelink.click();
		Thread.sleep(5000);
		myrecordlink.click();
		Thread.sleep(5000);
		viewbutton.click();
		Thread.sleep(5000);
		String rec = message20a.getText();
		Reporter.log(rec,true);
		int count = message20b.size();
		for (int i = 0; i < count; i++) {
			String text = message20b.get(i).getText();
			Reporter.log(text,true);
		}
	}
	//verify the action perform on enable the Employee can edit/delete own attendance records option on configuration page
	public void TC021() throws InterruptedException
	{  
		attendancelink.click();
		Thread.sleep(5000);
		cofriglink.click();
		Thread.sleep(5000);
		conf2.click();
		Thread.sleep(5000);
		cofrigsavebutton.click();
	}
	//Verify the action perform on the view button on employee  attendance record page  by  without entering the employee name
	public void TC024() throws InterruptedException
	{  
		attendancelink.click();
		Thread.sleep(4000);
		myempreclink.click();
		Thread.sleep(4000);
		myempviewbut.click();
		int count = message24.size();
		for (int i = 0; i < count; i++) {
			String text = message24.get(i).getText();
			Reporter.log(text,true);
		}

	}
	//Verify the action perform on the view button on  record found list of employee  attendance record page
	public void TC025() throws InterruptedException
	{  
		Thread.sleep(4000);
		myempviewbut1.click();
		Thread.sleep(4000);
		String tex = message25.getText();
		Reporter.log(tex,true);
	}
	//Verify the action perform on the add  button on  record found list of employee  attendance record page and in punch
	public void TC026() throws InterruptedException
	{   
		Thread.sleep(5000);
		myempaddbut.click();
		Thread.sleep(5000);
		myempinpunch.click();
	}
	//Verify the action perform on the add  button on  record found list of employee  attendance record page and out punch
	public void TC027() throws InterruptedException
	{  
		Thread.sleep(5000);
		myempaddbut.click();
		Thread.sleep(5000);
		myempoutpunch.click();
		int count = message27.size();
		Thread.sleep(5000);
		for (int i = 0; i < count; i++) {
			String text = message27.get(i).getText();
			Reporter.log(text,true);
		}
	}
	//Verify the action perform on the edit button on  record found list of employee  attendance record page and edit time zone
	public void TC028() throws InterruptedException
	{ 
		Thread.sleep(5000);
		editbuttononemprec.click();
		Thread.sleep(5000);
		timezonebutton1.click();
		Thread.sleep(5000);
		zone1.click();
		Thread.sleep(5000);
		timezonebutton2.click();
		Thread.sleep(5000);
		zone2.click();
		Thread.sleep(5000);
		savebuttoneditrec.click();
	}
	//Verify the action perform on the delete  button on  record found list of employee  attendance record page 
	public void TC029() throws InterruptedException
	{ 
		deletbuttononemprec.click();
		Thread.sleep(5000);
		yesdeletbutton.click();
	}
	//Verify that user is able  to cancel the delete  action
	public void TC030() throws InterruptedException
	{  
		Thread.sleep(5000);
		attendancelink.click();
		Thread.sleep(5000);
		myrecordlink.click();
		Thread.sleep(5000);
		singlecheckbox.click();
		Thread.sleep(5000);
		deletselectedinrec.click();
		Thread.sleep(5000);
		nocancelbutton.click();
	}

	//Verify that user is able to close the delete popup
	public void TC031() throws InterruptedException
	{  
		deletselectedinrec.click();
		Thread.sleep(5000);
		xbutton.click();
	}
	//Verify that user  is able  to delete the  single record 
	public void TC032() throws InterruptedException
	{  
		deletselectedinrec.click();
		Thread.sleep(5000);
		yesdeletbutton.click();
	}
	//Verify that user is able to cancel the  delete operation
	public void TC033() throws InterruptedException{
		deletbuttonmyrec.click();
		Thread.sleep(5000);
		nocancelbutton.click();
	}
	//Verify that user is able to close the   delete popup
	public void TC034() throws InterruptedException{

		deletbuttonmyrec.click();
		Thread.sleep(5000);
		xbutton.click();
	}
	//verify that user is able to delete the record by delete button
	public void TC035() throws InterruptedException{
		deletbuttonmyrec.click();
		Thread.sleep(5000);
		yesdeletbutton.click();
	}

	//Verify that user is able to cancel all the selected records
	public void TC036() throws InterruptedException
	{  
		deletallceckbox.click();
		Thread.sleep(5000);
		deletselectedinrec.click();
		Thread.sleep(5000);
		nocancelbutton.click();
	}
	//Verify that user is able to close the  delete popup
	public void TC037() throws InterruptedException
	{  
		deletselectedinrec.click();
		Thread.sleep(5000);
		xbutton.click();
	}
	//verify that user is able to delete all  the  records
	public void TC038() throws InterruptedException
	{  
		deletselectedinrec.click();
		Thread.sleep(5000);
		yesdeletbutton.click();
	}
	//click on orangeHRMinc link
	public void TC040() throws InterruptedException
	{ 
		Thread.sleep(5000);
		orangeinc.click();
	}
	//logout
	public void TC039() throws InterruptedException
	{ 
		Thread.sleep(5000);
		logoutlogo.click();
		Thread.sleep(5000);
		logout.click();;
	}

}




