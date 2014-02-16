package grubleTest.loadablecomponents;

import com.codeborne.selenide.Condition;
import grubleTest.core.SimpleLoadableComponent;
import grubleTest.pages.Product;

/**
 * Created by rkovalchuk on 2/16/14.
 */
public class ProductPageGetter extends SimpleLoadableComponent {
    private HomePageGetter parent;
    private String productName;

    public ProductPageGetter(HomePageGetter parent, String productName) {
        this.parent = parent;
        this.productName = productName;
    }

    @Override
    protected void load() {
        parent.get();
        Product.open(productName);
    }

    @Override
    public void isLoaded() {
        Product.testTablesItem().shouldBe(Condition.visible);
    }
}
