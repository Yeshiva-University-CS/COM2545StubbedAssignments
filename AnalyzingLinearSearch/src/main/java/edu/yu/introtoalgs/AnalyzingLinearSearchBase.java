package edu.yu.introtoalgs;

/** Defines the API for the AnalyzingLinearSearch assignment using an abstract
 * base class which students will extend to provide a concrete class named
 * AnalyzingLinearSearch.  See the requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * Design note: implementors may assume a single-threaded environment.
 *
 * @author Avraham Leff
 */
public abstract class AnalyzingLinearSearchBase {

  /** Constructor supplies a corpus of words to be searched.
   *
   * @param words A sequence of words that client will subsequently search to
   * find a match for a query word: per the requirements doc, that search MUST
   * be implemented with a search through this corpus in the ORDER OF WORDS of
   * the supplied corpus sequence.  The parameter is neither null nor empty,
   * and the words in the corpus are unique.  Client is responsible for
   * supplying a valid parameter and maintains ownership.
   */
  public AnalyzingLinearSearchBase(String[] corpus) {
  }
   
  /** Returns the number of steps required by the linear search algorithm to
   * determine whether or not the query word exists in the corpus.
   * 
   * @param query the word to be searched for in the corpus.  It's the client's
   * responsibility to ensure that the word is neither null nor empty.
   * @return the number of steps performed by the linear search algorithm (as
   * described in the requirement doc).
   */
  public abstract int numberOfSearchSteps(final String query);
}
