
import java.awt.Color;
import java.awt.Graphics2D;

public class RedBox extends ColoredBox {

	public RedBox(int x, int y, int width, int height) {
		super(x, y, width, height, Color.red);

	}

	@Override
	public void update(Keyboard keyboard) {
		// this.setY(getY() + 1);
	}

}
