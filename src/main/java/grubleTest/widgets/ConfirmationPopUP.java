package grubleTest.widgets;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

/**
 * Created by rkovalchuk on 2/15/14.
 */
public class ConfirmationPopUP {

    public static void confirm(){
        Selenide.$(By.xpath("//button[@class='btn btn-primary ui-button']")).click();

    }
    public static void cancel(){
        Selenide.$(By.xpath("//button[@class='btn btn-danger ui-button']")).click();
    }
}
