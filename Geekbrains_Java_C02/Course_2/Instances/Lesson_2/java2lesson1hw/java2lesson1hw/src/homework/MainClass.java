package homework;

import homework.competitors.*;
import homework.obstacles.*;

public class MainClass {
    public static void main(String[] args) {
        Team team = new Team("BeastsAndHumans", new Human("Боб"), new Cat("Барсик"), new Dog("Бобик"));
        Course course = new Course(new Cross(400), new Wall(8), new Water(1));
        course.doIt(team);
        team.showResults();
    }
}
