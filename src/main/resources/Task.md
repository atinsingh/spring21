# In class work 
A create a interface
```java
interface  ITeam {
   String getTeamName();
}
```
create 2 classes 
TorotoRaptor implements I Team 
GolderWarrior implements I Team 

create a class call Game
```java
class Game {
    ITeam raptors;
    ITeam warriors;
    
    ITeam game() {
        return Math.random()> 0.5 : raptors :  warriors;
    }
}
```
