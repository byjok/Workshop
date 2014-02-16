import static grubleTest.Resources.TestConfig.*;
import static grubleTest.Resources.TestData.*;
import grubleTest.pages.HomePage;
import grubleTest.pages.ProductPage;
import grubleTest.pages.TestTablesPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by rkovalchuk on 2/16/14.
 */
public class AddTableTest {

    @Test
    public void testAddTable(){
        HomePage.open(baseUrl);
        HomePage.ensureHasProduct(PRODUCT_NAME,PRODUCT_PATH);
        HomePage.goToProductPage(PRODUCT_NAME);
        ProductPage.goToPage(TEST_TABLES_PAGE);
        TestTablesPage.addCategory(CATEGORY_NAME);
        TestTablesPage.addTable(TABLE_NAME, CATEGORY_NAME);
    }
}
