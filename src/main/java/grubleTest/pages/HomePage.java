package grubleTest.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import grubleTest.widgets.*;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by rkovalchuk on 2/15/14.
 */
public class HomePage {

   public static void open(String baseUrl){
       Selenide.open(baseUrl);
   }

   public static void addProduct(String productName, String productPath){
       $("#btn-add-product").click();
       Dialog.editField(ProductDialog.PRODUCT_CLASS).setValue(productName);
       Dialog.editField(ProductDialog.PATH_CLASS).setValue(productPath);
       Dialog.confirm();
       Table.cell(productName).shouldBe(Condition.visible);
       }

   public static void deleteProduct(String productName){
       Table.cell(productName).contextClick();
       ContextMenu.deleteItem().click();
       ConfirmationPopUP.confirm();
       Table.cell(productName).shouldNotBe(Condition.visible);

   }
   public static void editProduct(String editedProductName, String productName, String productPath){
       Table.cell(productName).contextClick();
       ContextMenu.editItem().click();
       Dialog.editField(ProductDialog.PRODUCT_CLASS).shouldHave(Condition.value(productName));
       Dialog.editField(ProductDialog.PATH_CLASS).shouldHave(Condition.value(productPath));
       Dialog.editField(ProductDialog.PATH_CLASS).shouldBe(Condition.disabled);
       Dialog.editField(ProductDialog.PRODUCT_CLASS).setValue(editedProductName);
       Dialog.confirm();
       Table.cell(productName).shouldNotBe(Condition.visible);
       Table.cell(editedProductName).shouldBe(Condition.visible);




   }
}
