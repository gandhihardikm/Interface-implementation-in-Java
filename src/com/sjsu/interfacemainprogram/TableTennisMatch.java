package com.sjsu.interfacemainprogram;
import java.util.Scanner;
import com.sjsu.interfacejava.Match;

public class TableTennisMatch implements Match {

	int playedTournaments;
	int playedMatches;
	static int player1Points,player2Points;
	int setsWon;
	private static Scanner input;
	public static void main(String[] args) {
		
		TableTennisMatch player1 = new TableTennisMatch();
		TableTennisMatch player2 = new TableTennisMatch();
		
		input = new Scanner(System.in);
		
		System.out.println("-- Enter Player1 details -- \nEnter played tournaments :");
		player1.playedNoOfTournament(input.nextInt());
		System.out.println("Enter played Matches : ");
		player1.playedNoOfMatches(input.nextInt());
		
		System.out.println("-- Enter Player2 details -- \nEnter played tournaments :");
		player2.playedNoOfTournament(input.nextInt());
		System.out.println("Enter played Matches : ");
		player2.playedNoOfMatches(input.nextInt());
		
		System.out.println("Player1 played "+ player1.playedTournaments + " tournaments." +
				"\nPlayer1 played "+ player1.playedMatches +" Matches.");
	
		System.out.println("Player2 played "+ player2.playedTournaments + " tournaments." +
			"\nPlayer2 played "+ player2.playedMatches +" Matches.");
		
		System.out.println("--Current Match --  \n Player1 - how many sets won : ");
		player1.setCompare(input.nextInt());
		System.out.println("Player2 - how many sets won : ");
		player2.setCompare(input.nextInt());
		
		if(player1.setsWon > player2.setsWon)
			System.out.println("Player1 Won this Match");
		else
			System.out.println("Player2 Won this Match");		
	}

	@Override
	public void playedNoOfTournament(int iTournaments) {
		this.playedTournaments = iTournaments;
	}

	@Override
	public void playedNoOfMatches(int iMatches) {
		this.playedMatches = iMatches;
	}
	
	@Override
	public void setCompare(int setsWon) {
		this.setsWon = setsWon;	
	}
}
