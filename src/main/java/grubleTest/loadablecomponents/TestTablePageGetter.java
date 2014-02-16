package grubleTest.loadablecomponents;

import com.codeborne.selenide.Condition;
import grubleTest.core.SimpleLoadableComponent;
import grubleTest.pages.TestTablesPage;

/**
 * Created by rkovalchuk on 2/16/14.
 */
public class TestTablePageGetter extends SimpleLoadableComponent {
    private ProductPageGetter parent;

    public TestTablePageGetter(ProductPageGetter parent) {
        this.parent = parent;
    }

    @Override
    protected void load() {
        parent.get();
        TestTablesPage.open();
    }

    @Override
    public void isLoaded() {
        TestTablesPage.addCategoryButton().shouldBe(Condition.visible);
    }
}
