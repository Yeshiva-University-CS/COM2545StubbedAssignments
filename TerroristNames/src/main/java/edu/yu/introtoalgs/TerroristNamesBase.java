package edu.yu.introtoalgs;

/** Defines the API for the TerroristNames assignment using an abstract base
 * class which students will extend to provide a concrete class named
 * TerroristNames.  See the requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * IMPORTANT design note: this class and its sub-classes need not be
 * thread-safe.
 *
 * @author Avraham Leff
 */

public abstract class TerroristNamesBase {

  /** Defines the maximum length of a valid id.
   */
  public final static int MAX_ID_LENGTH = 9;

  /** Constructor: sets internal state to reflect "no current members" in the
   * chat group.
   */
  public TerroristNamesBase () {
    // no-op implementation 
  }

  /** Adds a member to the set of current members.
   *
   * @param id, non-empty String, may not contain whitespace, length may not
   * exceed MAX_ID_LENGTH, and id may not already exist in the current set of
   * members.
   * @throws IllegalArgumentException if pre-conditions are violated.
   */
  public abstract void add(String id);

  /** Returns the number of current members whose ids are a substring of the
   * specified id.
   *
   * @param id need not be a current id, but may not be empty, may not contain
   * whitespace, and length may not exceed MAX_ID_LENGTH.
   * @return the number of current members whose id are a substring of the
   * specified id.
   * @throws IllegalArgumentException if pre-conditions are violated.
   */
  public abstract int search(String id);


} // abstract base class  
