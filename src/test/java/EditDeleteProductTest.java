import grubleTest.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static grubleTest.Resources.TestConfig.baseUrl;
import static grubleTest.Resources.TestData.*;

/**
 * Created by rkovalchuk on 2/15/14.
 */
public class EditDeleteProductTest {

    @BeforeMethod
    public void givenOnHomePageWithTestProductExist(){
        HomePage.open(baseUrl);
        HomePage.ensureHasProduct(PRODUCT_NAME, PRODUCT_PATH);
        HomePage.ensureHasNoProduct(EDITED_PRODUCT_NAME);
    }

    @Test
    public void testProductCanBeEdited(){
        HomePage.editProduct(PRODUCT_NAME, EDITED_PRODUCT_NAME);
    }

    @Test
    public void testProductCanBeDeleted(){
        HomePage.deleteProduct(PRODUCT_NAME);
    }
}
