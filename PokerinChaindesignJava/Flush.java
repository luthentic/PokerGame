package PokerinChaindesign;

/**
 * @author Sewoong Lee
 */
public class Flush implements Handler{
  private Handler chain;
  @Override
  public void setNext(Handler next) {
    chain = next;
  }

  @Override
  public void evaluate(Hand hand) {
     if (
             hand.first.suits.equals(hand.second.suits) &&
             hand.second.suits.equals(hand.third.suits) &&
             hand.third.suits.equals(hand.forth.suits) &&
             hand.forth.suits.equals(hand.fifth.suits)
     ){
       System.out.println("A3.Flush");
     }else{
       chain.evaluate(hand);
     }
  }
}
