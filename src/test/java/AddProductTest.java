import static grubleTest.Resources.TestConfig.baseUrl;
import static grubleTest.Resources.TestData.*;
import grubleTest.pages.HomePage;
import org.testng.annotations.*;

/**
 * Created by rkovalchuk on 2/15/14.
 */
public class AddProductTest {

    @Test
    public void testProductCanBeAdded(){
        HomePage.open(baseUrl);
        HomePage.ensureHasNoProduct(PRODUCT_NAME);
        HomePage.addProduct(PRODUCT_NAME, PRODUCT_PATH);
    }
}
