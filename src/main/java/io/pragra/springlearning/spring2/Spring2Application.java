package io.pragra.springlearning.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Spring2Application {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext();
    }
}
