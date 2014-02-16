package grubleTest.loadablecomponents;

import com.codeborne.selenide.Condition;
import grubleTest.Resources.TestConfig;
import grubleTest.core.SimpleLoadableComponent;
import grubleTest.pages.Home;

/**
 * Created by rkovalchuk on 2/16/14.
 */
public class HomePageGetter extends SimpleLoadableComponent{

    private String baseUrl;

    public HomePageGetter(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Override
    protected void load() {
        Home.open(baseUrl);
    }

    @Override
    public void isLoaded() {
        Home.addProductButton().shouldBe(Condition.visible);
    }
}
