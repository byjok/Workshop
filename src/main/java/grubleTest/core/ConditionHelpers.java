package grubleTest.core;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.google.inject.internal.util.$StackTraceElements;
import org.openqa.selenium.WebElement;

/**
 * Created by rkovalchuk on 2/15/14.
 */
public class ConditionHelpers {
    public static Condition with(SelenideElement element){
        return have(element);
    }

    public static Condition have(SelenideElement element){
        return have(element, Condition.visible);
    }

    public static Condition have(final SelenideElement element, final Condition condition){
        return new Condition(element + " is " + condition) {
            @Override
            public boolean apply(WebElement webElement) {
                return element.is(condition);
            }
        };
    }
}
