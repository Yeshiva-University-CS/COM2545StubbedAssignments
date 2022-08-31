package edu.yu.introtoalgs;

/** Defines the API for the BTKeysAtSameLevel assignment: see the requirements
 * document for more information.
 *
 * Students MAY NOT change the constructor signature.  My test code will only
 * invoke the API defined below.
 *
 * @author Avraham Leff
 */

import java.util.List;

public class BTKeysAtSameLevel {

  /** Constructor
   */
  public BTKeysAtSameLevel() {
    // fill this in!
  }

  /** Given a String representation of a binary tree whose keys are Integers,
   * computes a List whose elements are List of keys at the same level (or
   * depth) from the root.  The top-level List is ordered by increasing
   * distance from the root so that the first List element consists of the
   * root's key, followed by the keys of all the root's immediate children,
   * etc.  At a given level, the List is ordered from left to right.  See the
   * requirements doc for an example.
   *
   * The String representation of the binary tree is defined as follows.  Keys
   * consist of a single integer value, from 0 to 9.  The string consists only
   * of parentheses and single digit integers: it must begin with an integer
   * (the value of the root node) followed by zero, one or two pairs of
   * parentheses. A pair of parentheses represents a child binary tree with
   * (recursively) the same structure. If a given node only has one child, that
   * child will be the left child node of the parent.
   * 
   * Note: the "empty" tree is represented by the empty string, and
   * this method should therefore return an empty List.  The same
   * semantics apply to a "blank" string.
   *
   * @param treeInStringRepresentation a binary tree represented in the
   * notation defined above.
   * @return a List whose elements are Lists of the tree's (integer) key
   * values, ordered in increasing distance from the root.  Each List element
   * contains the keys at a given level, ordered from left to right.
   * @throws IllegalArgumentException if the String is null, or doesn't
   * correspond to a valid String representation of a binary tree as defined
   * above.
   */
  public List<List<Integer>> compute(final String treeInStringRepresentation) {
    // I suggest substituting a better implementation!
    return null;
  } // compute
}   // class
