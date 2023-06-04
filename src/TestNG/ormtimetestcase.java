package TestNG;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.orangehrm.generic.orangehrmtime;

public class ormtimetestcase {
	static WebDriver driver;
	@Test
	public void TC001() throws IOException, InterruptedException
	{
		driver=new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC001();
		String actualresult = driver.getCurrentUrl();
		Reporter.log(actualresult,true);	
	}
	@Test
	public void TC002() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC002();
	}
	@Test
	public void TC003() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC003();
	}
	@Test
	public void TC004() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC004();
	}
	@Test
	public void TC005() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC005();
	}
	@Test
	public void TC006() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC006();
	}
	@Test
	public void TC007() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC007();
	}
	@Test
	public void TC009() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC009();
	}
	@Test
	public void TC010() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC010();
	}
	@Test
	public void TC011() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC011();
	}
	@Test
	public void TC013() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC013();
	}
	@Test
	public void TC014() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC014();
	}
	@Test
	public void TC015() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC015();
	}
	@Test
	public void TC016() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC016();
	}
	@Test
	public void TC017() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC017();
	}
	@Test
	public void TC018() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC018();
	}
	@Test
	public void TC019() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC019();
	}
	@Test
	public void TC020() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC020();
	}
	@Test
	public void TC021() throws  InterruptedException {
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC021();
	}
	@Test
	public void TC024() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC024();
	}
	@Test
	public void TC025() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC025();
	}
	@Test
	public void TC026() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC026();
	}
	@Test
	public void TC027() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC027();
	}
	@Test
	public void TC028() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC028();
	}
	@Test
	public void TC029() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC029();
	}
	@Test
	public void TC030() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC030();
	}
	@Test
	public void TC031() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC031();
	}
	@Test
	public void TC032() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC032();
	}
	@Test
	public void TC033() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC033();
	}
	@Test
	public void TC034() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC034();
	}
	@Test
	public void TC035() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC035();
	}
	@Test
	public void TC036() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC036();
	}
	@Test
	public void TC037() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC037();
	}
	@Test
	public void TC038() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC038();
	}
	@Test
	public void TC039() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC039();
	}
	@Test
	public void TC040() throws InterruptedException{
		orangehrmtime oh = new orangehrmtime(driver);
		oh.TC040();
		driver.quit();
	}

}