import grubleTest.pages.Home;
import grubleTest.pages.Product;
import grubleTest.pages.TestTablesPage;
import org.testng.annotations.Test;

import static grubleTest.Resources.TestConfig.*;
import static grubleTest.Resources.TestData.*;

/**
 * Created by rkovalchuk on 2/16/14.
 */
public class DeleteTableTest {

    @Test
    public void testTableCanBeDeleted(){
       // Home.open(baseUrl);
       // Home.ensureHasProduct(PRODUCT_NAME, PRODUCT_PATH);
      //  Home.goToProductPage(PRODUCT_NAME);
      //  Product.goToPage(TEST_TABLES_PAGE);
        TestTablesPage.page(PRODUCT_NAME).get();
        TestTablesPage.ensureHasCategory(CATEGORY_NAME);
        TestTablesPage.ensureHasTable(TABLE_NAME, CATEGORY_NAME);
        TestTablesPage.deleteTable(TABLE_NAME);
    }
}
