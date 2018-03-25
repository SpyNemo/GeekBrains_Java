package homework.obstacles;

import homework.competitors.Animal;
import homework.competitors.Competitor;

public class Wall extends Obstacle{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}