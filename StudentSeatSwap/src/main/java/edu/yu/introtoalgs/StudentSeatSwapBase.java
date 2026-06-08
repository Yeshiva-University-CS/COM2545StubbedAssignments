package edu.yu.introtoalgs;

/** Defines the API for the StudentSeatSwap assignment using an abstract base
 * class which students extend to provide a concrete class named
 * StudentSeatSwap.  See the requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * @author Avraham Leff
 */

import java.util.List;

public abstract class StudentSeatSwapBase {
  /** A student can be in exactly one of these groups and can never change from
   * one group to another.  Snicker.
   */
  public enum Major {
    AI, DS
  }

  /** A student can only do one of these actions
   */
  public enum Action {
    ENTER, EXIT, GIVE
  }
  
  /** A solution for a given problem instance consists of a sequence of
   * SolutionStep instances.  A valid solution to a problem can only consist of
   * a sequence with valid transitions from the first state to the next step.
   *
   * The default record constructor is used when the Action is GIVE: in this
   * case, the semantics are that the first entity parameter (associated with
   * the first id) gives a classroom seat assignment to the second entity
   * parameter (associated with the second id).
   */
  public record SolutionStep(Action action, Major ent1, int id1, Major ent2, Integer id2) {
    @Override
      public String toString() {
      return ent2 == null ? String.format("%s %s %d", action, ent1, id1) 
        : String.format("%s %s %d %s %d", action, ent1, id1, ent2, id2);
    }

    /** Constructor used for the ENTER and EXIT Actions: there is no second
     * entity involved in the step so the fourth and fifth parameters are set
     * to null.
     */
    public SolutionStep(Action action, Major ent1, int id1) {
      this(action, ent1, id1, null, null);
    }
  } // SolutionStep

  /** Constructor.
   *
   * @param M the number of DS students, >= 0.  If M >= 1, a DS student is
   * uniquely identified by an integer value in the range 1..M.  Initially, all
   * DS students are outside the classroom.  Client is responsible for
   * providing a valid parameter.
   * @param N the number of AI students >= 0.  If N >=1, an AI student is
   * uniquely identfied by an integer value in the range 1..N.  Initially, all
   * AI students are outside the classroom.  Client is responsible for
   * providing a valid parameter.
   * @param dsSlots Initial assignment of classroom seats for DS students:
   * dsSlots[i] is true iff the ith+1 student is currently assigned a classroom
   * seat, false otherwise.  Note: The array is of size M and is 0:M-1 indexed
   * (Student ID 1 is at index 0).  Client is responsible for providing a valid
   * parameter, and client maintains ownership.
   * @param aiSlots Initial assignment of classroom seats for AI students:
   * aiSlots[i] is true iff the ith+1 student is currently assigned a classroom
   * seat slot, false otherwise.  The array is of size N, but student ids are
   * in the range 1..N, (Student ID 1 is at index 0).  Client is responsible
   * for providing a valid parameter, and client maintains ownership.
   */
  public StudentSeatSwapBase(int M, int N, boolean[] dsSlots, boolean[] aiSlots) {
    // abstract base class doesn't do anything in the constructor
  }

  /** Returns a sequence of steps that move the system from its initial state
   * (supplied to the constructor) to one that such that all AI students are
   * outside the classroom and a maximum number of DS students are inside the
   * classroom.  The sequence of steps must at all times be themselves valid
   * and follow the state transition rules as defined in the requirements docs.
   *
   * @return a sequence of steps.  If no solution possible, return an empty
   * list.
   */
  public abstract List<SolutionStep> solveIt();

  /** Returns the number of DS students with a seat slot implied by the
   * execution of the supplied plan.
   *
   * @param M the number of DS students (those with assigned seat slots AND
   * those without).  A DS student is uniquely identified by ann integer value
   * in the range 1..M
   * @param plan of the type returned by solveIt.  Client's responsibility to
   * supply a valid plan.
   * @return number of DS students with a seat slot after the supplied plan is
   * executed.
   * @see solveIt
   */
  public abstract int nDSStudentsWithSeat(int M, List<SolutionStep> plan);

} // abstract base class
