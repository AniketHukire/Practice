package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
//import java.util.Random;
import java.util.Scanner;

public class CardDistributor {
	public static void main (String [] args) {
		String[] suits = {"Dimaonds", "Clubs", "Hearts"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Queen", "King"};
		
		int nsuits = suits.length;
		int nranks = ranks.length;
		int totalCards = nsuits * nranks;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Players: ");
		int nplayers = sc.nextInt();
		
		System.out.println("Enter number of cards per player: ");
		int nCards = sc.nextInt();
		
		//To check Validate card distribution
		if(nplayers * nCards > totalCards)
		{
			System.out.println("Not enough cars in the deck!");
			return;
		}
		List<String> deck = createDeck(suits, ranks);//call Create Dick Method
		shuffledDeck(deck);//call shuffle the deck mathod
		Map<String, List<String>> PlayerCards = distributeCards(deck, nplayers, nCards);
		displayCards(PlayerCards);
		
	}
	//Methode to Create Dick
	public static List<String> createDeck(String[] suits, String[] ranks)
	{
		List<String> deck = new ArrayList<>();
		for(String suit : suits)
		{
			for(String rank : ranks)
			{
				deck.add(rank + "of" +suit);
			}
		}
			return deck;
	}
	//Method to shuffle the deck
	public static void shuffledDeck(List<String> deck)
	{
		Collections.shuffle(deck);
	}
	//my logic to shuffle the deck
	/*public static void shuffleDeck(List<String> deck) {
        Random ran = new Random();
        for (int i = deck.size() - 1; i > 0; i--) {
            int j = ran.nextInt(i + 1);
            // Swap deck[i] with deck[j]
            String temp = deck.get(i);
            deck.set(i, deck.get(j));
            deck.set(j, temp);
        }
    }*/
	// Methode to distribute cards
	public static Map<String, List<String>> distributeCards(List<String>deck, int nplayers, int nCards)
	{
		Map<String, List<String>> PlayerCards = new LinkedHashMap<>();
		for(int i = 1; i <= nplayers; i++)
		{
			PlayerCards.put("P" + i, new ArrayList<>());
		}
		int cardIndex = 0;
		for ( int i = 0; i < nCards; i++)
		{
			for(int j = 1; j <= nplayers; j++)
			{
				PlayerCards.get("P" + j).add(deck.get(cardIndex++));
			}
		}
			return PlayerCards;
	}
	//Method to Display Cards
	public static void displayCards(Map<String, List<String>> PlayerCards)
	{
		for(Map.Entry<String, List<String>> entry : PlayerCards.entrySet())
		{
			System.out.println(entry.getKey()+ "=" + entry.getValue());
		}
	}
}
