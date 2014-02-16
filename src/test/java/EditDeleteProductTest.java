import grubleTest.pages.Home;
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
        Home.open(baseUrl);
        Home.ensureHasProduct(PRODUCT_NAME, PRODUCT_PATH);
        Home.ensureHasNoProduct(EDITED_PRODUCT_NAME);
    }

    @Test
    public void testProductCanBeEdited(){
        Home.editProduct(PRODUCT_NAME, EDITED_PRODUCT_NAME);
    }

    @Test
    public void testProductCanBeDeleted(){
        Home.deleteProduct(PRODUCT_NAME);
    }
}
