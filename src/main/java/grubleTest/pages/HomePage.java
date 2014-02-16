package grubleTest.pages;

import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import grubleTest.widgets.*;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.codeborne.selenide.Selenide.$;
import static grubleTest.core.ConditionHelpers.have;

/**
 * Created by rkovalchuk on 2/15/14.
 */
public class HomePage {
//    public static void should(Condition condition){
//        $("body").should(condition);
//    }

    public static void open(String baseUrl) {
        Selenide.open(baseUrl);
    }

    public static SelenideElement addProductButton(){
        return $("#btn-add-product");
    }

    public static void addProduct(String productName, String productPath) {
        addProductButton().click();
        Dialog.editField(ProductDialog.PRODUCT).setValue(productName);
        Dialog.editField(ProductDialog.PATH).setValue(productPath);
        Dialog.confirm();
        Table.cell(productName).shouldBe(visible);
    }
    public static void goToProductPage(String productName){
        Table.cell(productName).click();
    }

    public static void deleteProduct(String productName) {
        Table.cell(productName).contextClick();
        ContextMenu.deleteItem().click();
        ConfirmationPopUP.confirm();
        Table.cell(productName).shouldNotBe(visible);
        }

    public static void deleteProductandFolder(String productName, String productPath) {
        Table.cell(productName).contextClick();
        ContextMenu.deleteItem().click();
        ConfirmationPopUP.confirm();
        Table.cell(productName).shouldNotBe(visible);

        try {
            HomePage.removeDirectoryIfExist(productPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void editProduct(String currentProductName, String newProductName) {
        Table.cell(currentProductName).contextClick();
        ContextMenu.editItem().click();
        Dialog.editField(ProductDialog.PRODUCT).setValue(newProductName);
        Dialog.confirm();
        Table.cell(currentProductName).shouldNotBe(visible);
        Table.cell(newProductName).shouldBe(visible);
    }

    public static void ensureHasNoProduct(String productName) {
        if (Table.cell(productName).isDisplayed()) {
            HomePage.deleteProduct(productName);
        }
    }

    public static void ensureHasProduct(String productName, String productPath) {
        if (!Table.cell(productName).isDisplayed()) {
            HomePage.addProduct(productName, productPath);
        }
    }
    public static void removeDirectoryIfExist(String path) throws IOException {
        Path filePath = Paths.get("/home/rkovalchuk/Documents/Workshop/" + path);
        File directory = new File("/home/rkovalchuk/Documents/Workshop/" + path);
        if (Files.isDirectory(filePath)){
            FileUtils.deleteDirectory(directory);
        }
    }
}
