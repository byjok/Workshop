package grubleTest.core;

import com.codeborne.selenide.Configuration;

/**
 * Created by rkovalchuk on 2/16/14.
 */
public abstract class SimpleLoadableComponent {

    public void get() {
        long originalTimeout = Configuration.timeout;
        try {
            Configuration.timeout = 0;
            isLoaded();
            Configuration.timeout = originalTimeout;
        } catch (Error e) {
            Configuration.timeout = originalTimeout;
            load();
            isLoaded();
        }
    }

    protected abstract void load();

    public abstract void isLoaded();
}