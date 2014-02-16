import static grubleTest.Resources.TestConfig.baseUrl;
import static grubleTest.Resources.TestData.*;

import grubleTest.pages.Home;
import org.testng.annotations.*;

/**
 * Created by rkovalchuk on 2/15/14.
 */
public class AddProductTest {

    @Test
    public void testProductCanBeAdded(){
        Home.page().get();
        Home.ensureHasNoProduct(PRODUCT_NAME);
        Home.addProduct(PRODUCT_NAME, PRODUCT_PATH);
    }
}
