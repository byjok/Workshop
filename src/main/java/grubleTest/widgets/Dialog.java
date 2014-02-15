package grubleTest.widgets;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

/**
 * Created by rkovalchuk on 2/15/14.
 */
public class Dialog {

    public static SelenideElement editField(String elementClass){
        String elementLocator = "//input[@class='" + elementClass + " dialog-edit']";
        return $(By.xpath(elementLocator));

    }
    public static void confirm(){
        $(By.xpath("//button[@class='ui-button']")).click();
    }
    public static void cancel(){
        $(By.xpath("//button[@class='ui-button btn-cancel']")).click();
    }


}
