package PokerinChaindesign;

import java.util.ArrayList;
/**
 * @author Sewoong Lee
 */
public class Deck {
  ArrayList<Card> cards = new ArrayList<>();

  public Deck(){
    for (int i = 2; i < 15; i++){         // 11 == Jack, 12 == Queen, 13 == King, 14 == Ace
      cards.add( new Card("Spades",i));
    }
    for (int i = 2; i < 15; i++){
      cards.add( new Card("Heart",i));
    }
    for (int i = 2; i < 15; i++){
      cards.add( new Card("Diamonds",i));
    }
    for (int i = 2; i < 15; i++){
      cards.add( new Card("Clubs",i));
    }
  }

  public Hand dealHand(Card a,Card b, Card c,Card d, Card e){
    Hand h = new Hand(a,b,c,d,e);
    return h;
  }
}
