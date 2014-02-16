import static grubleTest.Resources.TestData.*;

import grubleTest.pages.TestTablesPage;
import org.testng.annotations.Test;

/**
 * Created by rkovalchuk on 2/16/14.
 */
public class AddTableTest {

    @Test
    public void testAddTable(){
        TestTablesPage.ensureHasCategory(CATEGORY_NAME);
        TestTablesPage.addTable(TABLE_NAME, CATEGORY_NAME);
    }
}
