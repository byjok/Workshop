import grubleTest.Resources.TestData;
import grubleTest.pages.HomePage;
import org.testng.annotations.*;
/**
 * Created by rkovalchuk on 2/15/14.
 */
public class EditProductTest {

    String productName = TestData.productName;
    String productPath = TestData.productPath;
    String editedProductName = TestData.editedProductName;

    @Test
    public void testProductCanBeEdited(){
        HomePage.open("http://localhost:8123/");
        HomePage.addProduct(productName,productPath);
        HomePage.editProduct(editedProductName,productName,productPath);
        HomePage.deleteProduct(editedProductName);
    }
}
