package edu.yu.introtoalgs;

/** Enhances the Queue enqueue() and dequeue() API with a O(1) max()
 * method and O(1) size().  The dequeue() method is O(1), the enqueue
 * is amortized O(1).  The implementation is O(n) in space.
 *
 * @author Avraham Leff
 */

import java.util.NoSuchElementException;

public class MaxQueue {

  /** No-argument constructor: students may not add any other constructor for
   * this class
   */
  public MaxQueue() {
    // students may insert whatever code they please, but the code may not
    // throw an exception
  }

  /** Insert the element with FIFO semantics
   *
   * @param x the element to be inserted.
   */
  public void enqueue(int x) {
      // your code goes here
  }

  /** Dequeue an element with FIFO semantics.
   *
   * @return the element that satisfies the FIFO semantics if the queue is not
   * empty.
   * @throws NoSuchElementException if the queue is empty
   */
  public int dequeue() {
      return -1;
  }

  /** Returns the number of elements in the queue
   *
   * @return number of elements in the queue
   */
  public int size() {
      return -1;
  }


  /** Returns the element with the maximum value
   * 
   * @return the element with the maximum value
   * @throws NoSuchElementException if the queue is empty
   */
  public int max() {
      return -1;
  }
  
} // MaxQueue

