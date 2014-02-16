package grubleTest.pages;

import com.codeborne.selenide.Selenide;
import grubleTest.widgets.Table;

/**
 * Created by rkovalchuk on 2/16/14.
 */
public class ProductPage {

    public static void open(String baseUrl) {
        Selenide.open(baseUrl);
    }

    public static void goToPage(String pageName){
        Table.cell(pageName).click();
    }
}
