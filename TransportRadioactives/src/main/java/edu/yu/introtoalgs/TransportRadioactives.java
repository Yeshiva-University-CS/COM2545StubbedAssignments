package edu.yu.introtoalgs;

/** Specifies the interface for generating a sequence of transportation states
 * that moves the radioactives from src to dest per the requirements doc.
 *
 * @author Avraham Leff
 */

import java.util.*;

public class TransportRadioactives {

  /** Computes a sequence of "transport radioactives" movements between the src
   * and the dest such that all of the initial methium and initial cathium are
   * transported safely from the src to the dest.  Each movement must respect
   * the constraints specified in the requirements doc.
   *
   * @param initialMithium initial amount of mithium (in kg) at the src
   * @param initialCathium initial amount of cathium (in kg) at the src
   * @return List of "transport radioactives" movements between the src and the
   * dest (if such a sequence can be computed), or an empty List if no such
   * sequence can be computed under the specified constraints.
   */
  public static List<TransportationState>
    transportIt(final int initialMithium, final int initialCathium) {
    return null;
  } // transportIt

} // TransportRadioactives
