import java.awt.Color;
import java.awt.Graphics2D;
import java.util.*;

public class Game {
	private ArrayList<SquareCollection> boxes;
	private int tickCount;
	
	private SquareCollection squareCollection;
	private GameBoard board;
	private Ball ball;
	private boolean fillScreen = false;

	/*
	 * referens till spelplanen som initieras "board" initerar ett
	 * SquareCollection-objekt och skickar med önskade värden. SquareCollection tar
	 * emot(x, y, size, spacing, count). initierar ett Ball-objekt med önskade
	 * värden.
	 */
	public Game(GameBoard board) {
		this.boxes = new ArrayList<>();
		this.board = board;
		squareCollection = new SquareCollection(20, 20, 40, 40, 10);
		ball = new Ball(400, 500, 25, Color.white);

	}

	public void update(Keyboard keyboard) {
		/*
		 * anropar moveDown() från SquareCollection-objektet, skickar med en parameter
		 * som bestämer antalet enheter objektets position skall påverkas.
		 */
		squareCollection.moveDown(1);
		
		// Signalerar fillScreenWithSquares(); i Draw();
		if (ball.getY() < squareCollection.getYandSize()) {
			fillScreen = true;
		}

		/*
		 * Skickar med spelplanens höjd i SquareCollection-objektets metod isAtBottom();
		 * Om detta returnerar true stängs programmet.
		 */
		if (squareCollection.isAtBottom(board.getHeight())) {
			System.exit(0);

		}
		/*
		 * anropar Ball-objektets metod move(); skickar med parametern keyboard som
		 * håller värden för eventuella knapptryckningar.
		 */
		ball.move(keyboard);
		
		
		/*
		 * tickCount test 
		 */
		/*for (SquareCollection box : boxes) {
			box.update(keyboard);
			box.moveDown(20);
		}

		tickCount++;

		if (tickCount % 40 == 0) {
			tickCount = 0;
			// addBox(new GreenBox(140, 20, 20, 20));
			boxes.add(new SquareCollection(20, 20, 40, 40, 10));

		}*/

	}

	public void draw(Graphics2D graphics) {
		squareCollection.draw(graphics);
		ball.draw(graphics);
		
		/*
		if (fillScreen) 
			fillScreenWithSquares(graphics);
		*/
			
		
		
		
		/*
		 * tickCount test 
		 */
		/*for (SquareCollection box : boxes) {
			box.draw(graphics);
		}*/
		
		// redBox.draw(graphics);
		// blueBox.draw(graphics);
		// greenBox.draw(graphics);
	}
	
	/*private void fillScreenWithSquares(Graphics2D graphics) {
		int squareSize = 20; // storleken på varje ruta
        int screenWidth = board.getWidth();
        int screenHeight = board.getHeight();
        Random random = new Random();
        
        
        
        for (int x = 0; x < screenWidth; x += squareSize) {
            for (int y = 0; y < screenHeight; y += squareSize) {
            	int boxtype = random.nextInt(3);
            	switch(boxtype) {
            	case 1:
            		graphics.setColor(Color.BLUE); 
                    graphics.fillRect(x, y, squareSize, squareSize);
            		break;
            	case 2:
            		graphics.setColor(Color.GREEN); 
                    graphics.fillRect(x, y, squareSize, squareSize);
            		break;
            	case 3:
            		graphics.setColor(Color.RED); 
                    graphics.fillRect(x, y, squareSize, squareSize);
            		break;
            	}
            }
        }
	}*/

}

	
