package homework.obstacles;

import homework.competitors.Animal;
import homework.competitors.Competitor;

public class Cross extends Obstacle{
    private int distance;

    public Cross(int distance) {
        this.distance = distance;
    }


    @Override
    public void doIt(Competitor competitor) {
        competitor.run(distance);
    }
}
