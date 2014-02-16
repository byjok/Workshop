package grubleTest.pages;

import static com.codeborne.selenide.Selectors.byText;
import  static com.codeborne.selenide.Selenide.*;

import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.SelenideElement;
import grubleTest.Resources.TestConfig;
import grubleTest.loadablecomponents.TestTablePageGetter;
import grubleTest.widgets.*;

/**
 * Created by rkovalchuk on 2/16/14.
 */
public class TestTablesPage {

    public static void open() {
        Product.testTablesItem().click();
    }
    public static TestTablePageGetter page(String productName){
        return new TestTablePageGetter(Product.page(productName));
    }
    public static SelenideElement addCategoryButton(){
        return $("#btn-add-category");
    }

    public static void addCategory(String categoryName){
        addCategoryButton().click();
        Dialog.editField(CategoryDialog.CATEGORY).setValue(categoryName);
        Dialog.confirm();
        Tree.treeItem(categoryName).shouldBe(visible);
    }

    public static void deleteCategory(String categoryName){
        Tree.treeItem(categoryName).contextClick();
        ContextMenu.deleteItem().click();
        ConfirmationPopUP.confirm();
        Tree.treeItem(categoryName).shouldNotBe(visible);
    }

    public static void addTable(String tableName, String categoryName){
        Tree.treeItem(categoryName).contextClick();
        ContextMenu.addTableItem().click();
        Dialog.editField(TableDialog.TABLE).setValue(tableName);
        Dialog.confirm();
        Tree.treeItem(tableName).shouldBe(visible);
    }

    public static void deleteTable(String tableName){
        Tree.treeItem(tableName).click();
        RealTable.deleteButton().click();
        ConfirmationPopUP.confirm();
        Tree.treeItem(tableName).shouldNotBe(visible);
    }

    public static void ensureHasCategory(String categoryName){
        if (!Tree.treeItem(categoryName).isDisplayed()){
            TestTablesPage.addCategory(categoryName);
        }
    }

    public static void ensureHasNoCategory(String categoryName){
        if (Tree.treeItem(categoryName).isDisplayed()){
            TestTablesPage.deleteCategory(categoryName);
        }
    }

    public static void ensureHasTable(String tableName, String categoryName){
        Tree.treeItem(categoryName).click();
        if (!Tree.treeItem(tableName).isDisplayed()){
             TestTablesPage.addTable(tableName, categoryName);
        }
    }

}
