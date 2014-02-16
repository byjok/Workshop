package grubleTest.widgets;

import static com.codeborne.selenide.Selectors.*;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;



/**
 * Created by rkovalchuk on 2/16/14.
 */
public class Tree {

    public static ElementsCollection treeElements(){
       return $$(".tree-item-text");
    }

    public static SelenideElement treeItem(String name){
       return Tree.treeElements().findBy(Condition.exactText(name));

    }
}
