package PokerinChaindesign;

/**
 * @author Sewoong Lee
 */
public class Hand {
  Card first;
  Card second;
  Card third;
  Card forth;
  Card fifth;

  public Hand(Card a,Card b,Card c,Card d,Card e){
    first = a ;
    second = b;
    third = c;
    forth = d;
    fifth = e;
  }

  @Override
  public String toString() {
    return  first.suits + " " + first.ranks +","+
            second.suits + " " + second.ranks +","+
            third.suits + " " + third.ranks +","+
            forth.suits + " " + forth.ranks +","+
            fifth.suits + " " + fifth.ranks ;
  }
}
