package homework;

import homework.competitors.*;
import homework.obstacles.Cross;
import homework.obstacles.Obstacle;
import homework.obstacles.Wall;
import homework.obstacles.Water;

public class MainClass {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
        Obstacle[] course = {new Cross(400), new Wall(3), new Water(1)};
        for (Competitor c: competitors){
            for (Obstacle o: course){
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        System.out.println("================");
        for (Competitor c: competitors){
            c.showResult();
        }
    }
}
