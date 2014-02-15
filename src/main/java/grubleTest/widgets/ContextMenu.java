package grubleTest.widgets;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by rkovalchuk on 2/15/14.
 */
public class ContextMenu {
    public static SelenideElement deleteItem(){
    return $(By.xpath("//ul[@id='productMenu']/li[@class='delete']/a[@href='#delete']"));

    }
public static SelenideElement editItem(){
    return $(By.xpath("//ul[@id='productMenu']/li[@class='edit']/a[@href='#edit']"));

}
}
