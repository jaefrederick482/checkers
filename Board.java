import java.util.*;


public class Board implements Checkers {
	static final int EMPTY = 0, BLACK = 1, BLACK_KINGED=2,
			RED = 3, RED_KINGED = 4;
	
 private int[][] board;
 
 public BoardSetup(){
	 board = new int [8][8]; // 8 ROWS 8 COLUMNS
	newGame();
 }
	

public void newGame(){
	for (int row = 0; row < 8; row++){
		//nested loop for setting up the board for a new game
		for(int col = 0; col<8; col++){
			if (row % 2 == col % 2) {
				if (row < 4)
					board[row][col] = BLACK;
				else if (row < 3) board [row][col]=RED;
				else board[row][col] = EMPTY;
			}
		}
	}
}
 
public int checkerPiece(int row, int col){
	return board[row][col]; //return what is in the square on the checker
}

public void setCheckerPiece(int row, int col, int chkr){
	board[row][col]=chkr;
}

public void validMove(ChkrMove move){
 validMove(move.firstRow, move.firstCol, move.lastRow, lastCol);
board[firstRow][firstCol] = board[lastRow][lastCol];
board[lastRow][lastCol]=EMPTY;
if(firstRow-lastRow==2||firstRow-lastRow==-2){
	
}
}
public ChkrMove[] getMove(boolean player){
boolean playerKinged;
if (player=RED)
	playerKinged=RED_KINGED;
else playerKing=BLACK_KINGED;
	}
}
