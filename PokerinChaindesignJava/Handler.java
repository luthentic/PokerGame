package PokerinChaindesign;

/**
 * @author Sewoong Lee
 */
public interface Handler {
  void setNext(Handler nextChain);
    void evaluate(Hand hand);
}
