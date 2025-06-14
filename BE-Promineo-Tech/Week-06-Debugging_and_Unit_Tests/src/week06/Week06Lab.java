package week06;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Week06Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int turn = 1;
		boolean finished = false;
		Scanner sc = new Scanner(System.in);
		
		//while (!finished) {
			display();
		//	if (turn >= 5) {
//				checkWinStatus();
//			}
//		}

	}

	private static void display() {
		// TODO Auto-generated method stub
		String[][] gameBoard = new String[3][3];
		int j = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print(gameBoard[i][j]);
			if (i == 2 && j == 2) {
				break;
			}
			
			if (i == 2) {
				i = -1;
				j++;
				System.out.println();
			}
//			if (j == 2) {
//				j = 0;
//			}
		}
	}

	private static void checkWinStatus() {
		// TODO Auto-generated method stub
		
	}

}
