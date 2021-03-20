package io.pragra.springlearning.spring2;

import io.pragra.springlearning.spring2.domain.Game;
import lombok.var;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class Run {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("io.pragra.springlearning.spring2");
        var game = context.getBean(Game.class);
        System.out.println(game.playGame().getTeamName());
    }

}
