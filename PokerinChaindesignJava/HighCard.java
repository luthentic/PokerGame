package PokerinChaindesign;

/**
 * @author Sewoong Lee
 */
public class HighCard implements Handler{
  private Handler chain;
  @Override
  public void setNext(Handler next) {
    chain = next;
  }
  @Override
  public void evaluate(Hand hand) {
    System.out.println("A3.HighCard");
  }
}
