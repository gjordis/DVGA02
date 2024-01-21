
import java.awt.Color;
import java.awt.Graphics2D;

public class ColoredBox extends Sprite {
	private Color color;

	/*
	 * Konstruktor med referens till superklassen "Sprite". Adderar en extra
	 * egenskap till klassen: "color", användas för att sätta färg till objekt.
	 */
	public ColoredBox(int x, int y, int width, int height, Color color) {
		super(x, y, width, height);
		this.color = color;
	}

	@Override
	public void draw(Graphics2D graphics) {
		graphics.setColor(color);
		graphics.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	@Override
	public void update(Keyboard keyboard) {
		// TODO Auto-generated method stub

	}
}
