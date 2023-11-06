
public class Battleship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int gameBoardLength =4;
 char water = '-';
 char ship = 's';
 char hit = 'X';
 char miss = 'O';
 int shipNumber = 3;
 
 char[][] gameBoard = createGameBoard(gameBoardLength, water, ship, shipNumber);
 
	}
	private static char [][] createGameBoard(int gameBoardLength, char water, char ship, int shipNumber){
	 char [][] gameBoard = new char [gameBoardLength][gameBoardLength]
			 for (char[] row : gameBoard) {
				 Array.fill (row, water);
			 }
	 return placeShips(gameBoard, shipNumber, water, ship);
	}
	private static char[][] placeShips(char[][]gameBoard, int shipNumber, char water, char ship) {
	int placedShips = 0;
	int gameBoardLength = gameBoard.length;
	while (placedShips < shipNumber) {
		int[] location = generateShipCoordinates(gameBoardLength)
			}
	}
	
	private stsaic int[] generateShipCoordinates(int gameBoardLength) {
		int[] coordinates = new int[2];
		for (int i = 0; < coordinates.length)
	}
}
