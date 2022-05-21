package SecondWeekSelenium.Day4;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class ActionBasic2 extends TestBase {
    @Test
    public void test(){
        //1- "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");
        //2- Hover over Me First" kutusunun ustune gelin
         Actions action=new Actions(driver);
         action.moveToElement(driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"))).perform();
        //3- Link 1" e tiklayin
        action.click(driver.findElement(By.xpath("(//a[@class='list-alert'])[1]"))).perform();
        //4- Popup mesajini yazdirin
        System.out.println(driver.switchTo().alert().getText());
        //5- Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();
        //6- “Click and hold" kutusuna basili tutun
        action.clickAndHold(driver.findElement(By.xpath("//div[@class='col-lg-12 text-center']"))).perform();
        //7-“Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println(driver.findElement(By.xpath("//div[@id='click-box']")).getText());
        //8- “Double click me" butonunu cift tiklayin
        action.doubleClick(driver.findElement(By.xpath("//div[@id='double-click']"))).perform();
    }
}
