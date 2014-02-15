import grubleTest.Resources.TestData;
import grubleTest.pages.HomePage;
import org.testng.annotations.*;

/**
 * Created by rkovalchuk on 2/15/14.
 */
public class AddProductTest {
String productName = TestData.productName;
String productPath = TestData.productPath;

    //@Test
    //public void testProductCanBeAdded() {
        //HomePage.open("http://localhost:8123/");
        //HomePage.addProduct(productName,productPath);

    //}
    @Test
    public void testProductCanBeAddedAndDeleted(){
        HomePage.open("http://localhost:8123/");
        HomePage.addProduct(productName,productPath);
        HomePage.deleteProduct(productName);
    }
}
