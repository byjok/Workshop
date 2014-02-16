package grubleTest.widgets;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by rkovalchuk on 2/15/14.
 */
public class ContextMenu {

    public static SelenideElement deleteItem(){
        return $(By.xpath("//li[@class='delete']/a[@href='#delete']"));

    }
    public static SelenideElement editItem(){
        return $(By.xpath("//li[@class='edit']/a[@href='#edit']"));
    }

    public static SelenideElement addTableItem(){
        return $(By.xpath("//li[@class='add']/a[@href='#add']"));
    }
}
