package pl.com.bottega.mathplay;

import org.springframework.context.ApplicationContext;

/**
 * Created by anna on 25.08.2016.
 */
public abstract class SpringCommand implements Command{

    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
}
