package edu.yu.introtoalgs;

/** Defines the API for the ChurchIntroductions assignment using an abstract base
 * class which students extend to provide a concrete class named
 * ChurchIntroductions.  See the requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * @author Avraham Leff
 */

import java.util.List;

public abstract class ChurchIntroductionsBase {

  /** Used to distinguish between possible valid solutions: one in which a path
   * exists from start to goal, one in which no path exists, so the solution
   * only is able to reach the highest possible id.
   */
  public enum PathStatus {
    TARGET_REACHED,
    FALLBACK_HIGHEST_ID
  }

  /** Used to return a solution to the ChurchIntroductions problem.  The status
   * denotes what type of solution was computed; the path contains the sequence
   * of ids (beginning with id #1 and concluding with the id of the last couple
   * in the path) that comprise the solution.
   */
  public record Solution(PathStatus status, List<Integer> path) {}

  /** Constructor.
   *
   * @param numPews the number of church pews, must be greater than 0, client
   * is responsible for supplying a valid parameter.  Keep in mind the precise
   * staggered structure of the pew organization as specified by the
   * requirements document.
   */
  public ChurchIntroductionsBase(int numPews) {
  }

  /** Specifies information about a given couple.
   *
   * @param id positive integer that uniquely identifies the couple, with the
   * assignment mapping rules defined in the requirements document.  The client
   * is responsible for not supplying an already existing couple, and for
   * supplying a valid parameter value.
   * @param leftType the type of the left person of the couple.  The client is
   * responsible for supplying a valid parameter value.
   * @param rightType the type of the right person of the couple.  The client
   * is responsible for supplying a valid parameter value.
   */
  public abstract void addCouple(int id, int leftType, int rightType);

  /** Returns a solution to the "church introductions" problem.
   *
   * @return an optimal solution to the problem.
   */
  public abstract Solution computeSolution();
} // abstract base class
