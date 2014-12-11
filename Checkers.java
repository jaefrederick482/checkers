import java.awt.*;
import java.applet.*;


public class Checkers extends Applet {

	public void init() {
		setLayout();
		setBackground(new Color(0, 300, 0));
		
		CheckerBoard board = new CheckerBoard();
		add(board);
		board.message.setForeground(Color.WHITE);
		add(board.message);
	}
}
