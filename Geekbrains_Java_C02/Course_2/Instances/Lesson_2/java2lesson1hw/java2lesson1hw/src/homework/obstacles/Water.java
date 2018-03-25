package homework.obstacles;

import homework.competitors.Animal;
import homework.competitors.Competitor;

public class Water extends Obstacle{
    private int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(distance);
    }
}