package cz.cuni.mff;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Hero {

    private double posX;
    private double posY;

    private Image img;

    public Hero() {
        img = new Image(Hero.class.getClassLoader().getResourceAsStream("other/Ice_enemy.png"));
    }

    public void update(double delta) {

    }

    public void draw(GraphicsContext gc) {
        gc.drawImage(img, posX, posY);
    }


}
