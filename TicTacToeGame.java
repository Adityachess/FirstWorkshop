package com.bz.firstworkshop;

public class TicTacToeGame {

	
	static void startGame() {
		char [] boardOfChar = new char[10] ;
		for (int i =1; i<boardOfChar.length; i++ ) {
			boardOfChar[i] = ' ';
		}
		System.out.println(boardOfChar);
	}
	
	
	public static void main(String[] args) {
		
		TicTacToeGame.startGame();
	}

}
