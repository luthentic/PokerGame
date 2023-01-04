package PokerinChaindesign;

/**
 * @author Sewoong Lee 3085886
 */
public class Card {
  String suits;
  int ranks;
  public Card(String s,int r){
    suits = s;
    ranks = r;
  }

  @Override
  public String toString() {
    return  suits + " " + ranks;
  }
}
