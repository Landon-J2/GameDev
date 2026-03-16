import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Player extends GameObject{
    private double speed;
    public Player(double x, double y){
        super(x, y, 0, 0, "ship.png");
        speed = 200;
    }
    public void move(double deltaTime){
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            setX(getX() + (speed * deltaTime));
        } else if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            setX(getX()-(speed * deltaTime));
        }
        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            setY(getY() + (speed * deltaTime));
        } else if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            setY(getY()-(speed * deltaTime));
        }
    }
}
