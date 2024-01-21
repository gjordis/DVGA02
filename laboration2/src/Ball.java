import java.awt.Color;
import java.awt.Graphics2D;

public class Ball extends Sprite {
	private int diameter;
	private Color color;
	// används i "move()", definerar bollens hastighet.
	private int Hx, Hy;

	/*
	 * Konstruktor med referens till superklassen "Sprite". Adderar en extra
	 * egenskap till klassen: "color", användas för att sätta färg till objekt.
	 */
	public Ball(int x, int y, int diameter, Color color) {
		super(x, y, diameter, diameter);
		this.diameter = diameter;
		this.color = color;
	}

	@Override
	public void update(Keyboard keyboard) {
	}

	@Override
	public void draw(Graphics2D graphics) {
		graphics.setColor(color);
		graphics.fillOval(getX(), getY(), diameter, diameter);

	}

	/*
	 * Metod som flyttar bollen vid knapptryck. Variablerna Hy & Hx används för att
	 * addera ett värde till bollens nuvarande position. I klassen "Game" anropas
	 * denna metod(anropas 40ggr per sekund). Om bollens position har ändras
	 * uppdateras det vid varje update.
	 */
	public void move(Keyboard keyboard) {
		Hy = 0;
		Hx = 0;

		if (keyboard.isKeyDown(Key.Up)) {
			Hy = -2;
		}
		if (keyboard.isKeyDown(Key.Down)) {
			Hy = 2;
		}
		if (keyboard.isKeyDown(Key.Left)) {
			Hx = -2;
		}
		if (keyboard.isKeyDown(Key.Right)) {
			Hx = 2;
		}

		setY(getY() + Hy);
		setX(getX() + Hx);

	}
}
