package grubleTest.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import grubleTest.Resources.TestData;
import grubleTest.loadablecomponents.ProductPageGetter;
import grubleTest.widgets.Table;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by rkovalchuk on 2/16/14.
 */
public class Product {

    public static void open(String productName) {
        Home.goToProductPage(productName);
    }

    public static ProductPageGetter page(String productName){
        return new ProductPageGetter(Home.page(), productName);
    }

    public static SelenideElement testTablesItem(){
        return Table.cell(TestData.TEST_TABLES_PAGE);
    }
}
