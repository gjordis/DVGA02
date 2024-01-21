import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;

public class SquareCollection {
	private ArrayList<ColoredBox> squares;
	private Random random;

	/*
	 * Initierar boxar baserat på positionering, storlek, spacing och antal. För
	 * varje ny box som skapas flyttas den på x-axeln. För val av färg på box,
	 * används de klasser som finns skapade. Använder switch-case för att med ett
	 * random-objekt bestämma vilken färg av box som läggs till.
	 */
	public SquareCollection(int x, int y, int size, int spacing, int count) {
		// Array för att lagra alla box-objekt
		squares = new ArrayList<>();
		random = new Random();

		for (int i = 0; i < count; i++) {

			int boxType = random.nextInt(3);

			/*
			 * box-klassena tar emot (x, y, width, height). manipulerar x-axeln för varje
			 * loop, använder "size" för både width och height då kvadrater skapas.
			 */
			switch (boxType) {
			case 0:
				squares.add(new BlueBox(x + i * (size + spacing), y, size, size));
				break;
			case 1:
				squares.add(new RedBox(x + i * (size + spacing), y, size, size));
				break;
			case 2:
				squares.add(new GreenBox(x + i * (size + spacing), y, size, size));
				break;
			}

		}
	}

	/*
	 * Flyttar alla object som ligger i Arrayen "squares", tar emot ett värde som
	 * används för att definera hur mycket positionen skall ändras.
	 */
	public void moveDown(int y) {
		for (ColoredBox box : squares) {
			box.setY(box.getY() + y);
		}
	}

	/*
	 * ritar upp alla object som litgger i Arrayen "squares".
	 */
	public void draw(Graphics2D graphics) {
		for (ColoredBox box : squares) {
			box.draw(graphics);
		}
	}

	/*
	 * Kontrollerar om objektens y-position + höjd är större än det värdet som tas
	 * emot(spelplanens höjd). I klassen Game måste höjden på spelplanen skickas
	 * med.
	 */
	public boolean isAtBottom(int windowHeight) {
		for (ColoredBox box : squares) {
			if (box.getY() + box.getHeight() > windowHeight) {
				return true;
			}
		}
		return false;
	}
	
	public int getYandSize() {
		if (!squares.isEmpty()) {
			return squares.get(0).getY() + squares.get(0).getHeight();
		}
		return -1;
	}
	
	public void update(Keyboard keyboard) {
		// TODO Auto-generated method stub

	}
}
