package edu.yu.introtoalgs;

/** Defines the API for the XenoHematology assignment: see the requirements
 * document for more information.
 *
 * Students MAY NOT change the constructor signature.  My test code will only
 * invoke the API defined below.
 *
 * @author Avraham Leff
 */

public class XenoHematology {

  /** Constructor: specifies the size of the xeno population.
   *
   * @param populationSize a non-negative integer specifying the number of
   * aliens in the xeno population.  Members of the population are uniquely
   * identified by an integer 0..populationSize -1.
   */
  public XenoHematology(final int populationSize) {
    // fill me in!
  } // constructor

  /** Specifies that xeno1 and xeno2 are incompatible.  Once specified as
   * incompatible, the pair can never be specified as being "compatible".  In
   * that case, don't throw an exception, simply treat the method invocation as
   * a "no-op".
   *
   * Both parameters must correspond to a member of the population.
   *
   * @param xeno1 non-negative integer that uniquely specifies a member of the
   * xeno population, differs from xeno2
   * @param xeno2 non-negative integer that uniquely specifies a member of the
   * xeno population.
   * @throws IllegalArgumentException if the supplied values are incompatible
   * with the above semantics or those specified by the requirements doc.
   */
  public void setIncompatible(int xeno1, int xeno2) {
    // fill me in!
  }

  /** Specifies that xeno1 and xeno2 are compatible.  Once specified as
   * compatible, the pair can never be specified as being "incompatible".  In
   * that case, don't throw an exception, simply treat the method invocation as
   * a "no-op".
   *
   * Both parameters must correspond to a member of the population.
   *
   * @param xeno1 non-negative integer that uniquely specifies a member of the
   * xeno population.
   * @param xeno2 non-negative integer that uniquely specifies a member of the
   * xeno population
   * @throws IllegalArgumentException if the supplied values are incompatible
   * with the above semantics or those specified by the requirements doc.
   */
  public void setCompatible(int xeno1, int xeno2) {
    // fill me in!
  }

  /** Returns true iff xeno1 and xeno2 are compatible from a hematology
   * perspective, false otherwise (including if we don't know one way or the
   * other).  Both parameters must correspond to a member of the population.
   *
   * @param xeno1 non-negative integer that uniquely specifies a member of the
   * xeno population, differs from xeno2
   * @param xeno2 non-negative integer that uniquely specifies a member of the
   * xeno population
   * @return true iff compatible, false otherwise
   * @throws IllegalArgumentException if the supplied values are incompatible
   * with the above semantics or those specified by the requirements doc.
   */
  public boolean areCompatible(int xeno1, int xeno2) {
    return false;               // replace to taste!
  }

  /** Returns true iff xeno1 and xeno2 are incompatible from a hematology
   * perspective, false otherwise (including if we don't know one way or the
   * other).  Both parameters must correspond to a member of the population.
   *
   * @param xeno1 non-negative integer that uniquely specifies a member of the
   * xeno population, differs from xeno2
   * @param xeno2 non-negative integer that uniquely specifies a member of the
   * xeno population
   * @return true iff compatible, false otherwise
   * @throws IllegalArgumentException if the supplied values are incompatible
   * with the above semantics or those specified by the requirements doc.
   */
  public boolean areIncompatible(int xeno1, int xeno2) {
    return false;               // replace to taste!
  }
} // XenoHematology
