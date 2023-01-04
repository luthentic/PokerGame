package PokerinChaindesign;

import java.util.ArrayList;
import java.util.Collections;
/**
 * @author Sewoong Lee
 */
public class Pair implements Handler{
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
            sortArray.get(0) == sortArray.get(1) || sortArray.get(1) == sortArray.get(2)  ||
            sortArray.get(2) == sortArray.get(3) || sortArray.get(3) == sortArray.get(4)
    ){
      System.out.println("A3.Pair");
    }else{
      chain.evaluate(hand);
    }
  }
}
