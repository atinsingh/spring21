# In class work 
A create a interface
```java
interface  ITeam {
   String getTeamName();
}
```
create 2 classes 
TorotoRaptor implements I Team 


```java
// Add annotations 
class TorontoRaptors implements ITeam {
    
}
// Add annotations 
class GoldenWarriors implements ITeam {
    
}
```
GolderWarrior implements I Team 

create a class call Game
```java
// Add annotations 
class Game {
    ITeam raptors;
    ITeam warriors;
    
    ITeam game() {
        return Math.random()> 0.5 : raptors :  warriors;
    }
}
```
create bean of Game and play the game, 
please do create any bean manually, use auto-wiring concept for this 
excercise

Suggest you to use application.properties for external config

see if you are getting errors 


