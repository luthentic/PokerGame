package PokerinChaindesign;

import java.util.ArrayList;
import java.util.Collections;
/**
 * @author Sewoong Lee
 */
public class RoyalFlush implements Handler{
  private Handler chain;
  @Override
  public void setNext(Handler next) {
    chain = next;
  }

  @Override
  public void evaluate(Hand hand) {
    ArrayList<Integer> sortArray = new ArrayList<>();

    int a =  hand.first.ranks;
    int b =  hand.second.ranks;
    int c =  hand.third.ranks;
    int d =  hand.forth.ranks;
    int e =  hand.fifth.ranks;

    sortArray.add(a);
    sortArray.add(b);
    sortArray.add(c);
    sortArray.add(d);
    sortArray.add(e);

    Collections.sort(sortArray);
    if (
            hand.fifth.suits.equals(hand.forth.suits) &&
            hand.forth.suits.equals(hand.third.suits) &&
            hand.third.suits.equals(hand.second.suits) &&
            hand.second.suits.equals(hand.first.suits) &&

            sortArray.get(0) == 10 && sortArray.get(1) == 11 && sortArray.get(2) == 12 && sortArray.get(3) == 13 && sortArray.get(4) == 14
    ){
      System.out.println("A3.RoyalFlush");
    }else{
      chain.evaluate(hand);
    }
  }
}
