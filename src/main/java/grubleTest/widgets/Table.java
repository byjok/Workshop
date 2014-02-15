package grubleTest.widgets;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by rkovalchuk on 2/15/14.
 */
public class Table {
    public static SelenideElement cell(String name){
        String cellLocator = "//span[.='"+ name +"']";
        return $(By.xpath(cellLocator));//TODO: implement
    }
}
