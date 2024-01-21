
import java.awt.Color;
import java.awt.Graphics2D;

public class GreenBox extends ColoredBox {

	public GreenBox(int x, int y, int width, int height) {
		super(x, y, width, height, Color.green);

	}

	@Override
	public void update(Keyboard keyboard) {
		// this.setY(getY() + 1);
	}

}
