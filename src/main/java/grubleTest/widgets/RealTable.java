package grubleTest.widgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by rkovalchuk on 2/16/14.
 */
public class RealTable {

    public static SelenideElement deleteButton(){
        return $("#btn-delete-data-item");
    }

    public static SelenideElement editButton(){
        return $("#btn-edit-data-item");
    }
}
