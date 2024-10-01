package edu.grinnell.csc207.util;

/**
 * Counters that you can decrement.
 */
public class DecrementableCounter extends BasicCounter {
  /**
   * Create a new decrementable counter.
   *
   * @param start
   *   The initial value of the counter.
   */
  public DecrementableCounter(int start) {
    super(start);
    //System.err.printf("DecrementableCounter(%d)\n", start); 
  } // DecrementableCounter(int)

  /*decrement. substract one from count
   */
  public void decrement(){
    this.count--;
  }//decrement()

} // class DecrementableCounter
