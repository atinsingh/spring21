package io.pragra.springlearning.spring2;

import io.pragra.springlearning.spring2.config.AnotherConfig;
import io.pragra.springlearning.spring2.config.AppConfig;
import io.pragra.springlearning.spring2.domain.Guest;
import io.pragra.springlearning.spring2.service.GuestBookService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Spring2Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class, AnotherConfig.class);
        Guest guest = context.getBean("guest", Guest.class);
        Guest guest1 = context.getBean("guest", Guest.class);
        GuestBookService guestBookService = (GuestBookService) context.getBean("guestBookService");
        guestBookService.addGuest(guest);
        guestBookService.addGuest(guest1);
        guestBookService.printGuest();


        System.out.println("--------------------------------");
        System.out.println(guest);
        System.out.println(guest1);
        System.out.println(context.getBean(Guest.class));
        System.out.println("--------------------------------");



        ((ConfigurableApplicationContext) context).close();
    }
}
