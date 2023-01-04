package PokerinChaindesign;

import java.util.Collections;
import java.util.Stack;
/**
 * @author Sewoong Lee
 */
public class Driver {
  public static void main(String[] args) {
    Handler royalFlush = new RoyalFlush();
    Handler straightFlush = new StraightFlush();
    Handler fourOfKind = new FourOfKind();
    Handler fullHouse = new FullHouse();
    Handler flush = new Flush();
    Handler straight = new Straight();
    Handler threeOfKind = new ThreeOfKind();
    Handler twoPair = new TwoPair();
    Handler pair = new Pair();
    Handler highCard = new HighCard();

    royalFlush.setNext(straightFlush);
    straightFlush.setNext(fourOfKind);
    fourOfKind.setNext(fullHouse);
    fullHouse.setNext(flush);
    flush.setNext(straight);
    straight.setNext(threeOfKind);
    threeOfKind.setNext(twoPair);
    twoPair.setNext(pair);
    pair.setNext(highCard);

    Deck deck = new Deck();
    Stack<Card> shuffleDeck = new Stack<>();  //Using Stack in order to make pop() method

    for (int i = 0; i < 52; i++){
      shuffleDeck.add(deck.cards.get(i));   // add every card into the stack
    }

    Collections.shuffle(shuffleDeck);       // shuffle

    Stack<String> abcd = new Stack<>();
    Stack<String> suitt = new Stack<>();
    for (int i = 0; i < 52; i++){
      abcd.add(String.valueOf(shuffleDeck.get(i).ranks));
      suitt.add(shuffleDeck.get(i).suits);
    }
    for (int i = 0; i < 52; i++){
      if (abcd.get(i).equals("11")){
        abcd.set(i,"Jack");
      }else if(abcd.get(i).equals("12")){
        abcd.set(i,"Queen");
      }else if (abcd.get(i).equals("13")){
        abcd.set(i,"King");
      }else if (abcd.get(i).equals("14")){
        abcd.set(i,"Ace");
      }
    }

    for (int i = 0; i < 10; i++){           // deal 10hands

      Hand hand = deck.dealHand(
              shuffleDeck.pop(),
              shuffleDeck.pop(),
              shuffleDeck.pop(),
              shuffleDeck.pop(),
              shuffleDeck.pop()
      );

      for (int ab =0; ab <5; ab++){
        System.out.print(suitt.pop() +" "+ abcd.pop() +"  ");
      }
      System.out.println();

      royalFlush.evaluate(hand);
    }

  }
}
