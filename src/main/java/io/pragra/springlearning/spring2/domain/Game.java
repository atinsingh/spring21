package io.pragra.springlearning.spring2.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//setter
// constructor based
@Component
public class Game {

    private ITeam team1;
    private ITeam team2;

    public Game(@Qualifier("raptors") ITeam team1, @Qualifier("warriors") ITeam team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public ITeam playGame() {
        return Math.random()< 0.5?  team1 :  team2;
    }
}
