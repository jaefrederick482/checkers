		
public class Moves {

	int firstRow, lastRow;
	int firstCol, lastCol;
	
	Moves(int row1, int row2, int col1, int col2){
		firstRow = row1;
		lastRow = row2;
		firstCol = col1;
		lastCol = col2;
		
	}
	boolean goodMove(){
		return(firstRow - lastRow == 2 || firstRow - lastRow == -2);
	}

}
