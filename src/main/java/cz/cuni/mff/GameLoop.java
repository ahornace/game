package cz.cuni.mff;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;

public class GameLoop extends AnimationTimer {

    private static final long NANOS_IN_SECONDS = 1_000_000_000L;

    private long previousTime = System.nanoTime();

    private GraphicsContext gc;

    private Hero hero;

    public GameLoop(GraphicsContext gc) {
        this.gc = gc;
        hero = new Hero();
    }

    @Override
    public void handle(long now) {
        gc.clearRect(0, 0, Game.WIDTH, Game.HEIGHT);

        double delta = ((double) (now - previousTime)) / NANOS_IN_SECONDS;
        previousTime = now;

        hero.update(delta);
        hero.draw(gc);
    }
}
