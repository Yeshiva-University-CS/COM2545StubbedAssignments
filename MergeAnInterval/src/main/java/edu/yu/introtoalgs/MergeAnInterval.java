package edu.yu.introtoalgs;

import java.util.*;

public class MergeAnInterval {

  /** An immutable class, holds a left and right integer-valued pair that
   * defines a closed interval
   */
  public static class Interval implements Comparable<Interval>{
    public final int left;
    public final int right;

    /** Constructor
     * 
     * @param left the left endpoint of the interval
     * @param right the right endpoint of the interval
     */
    public Interval(int l, int r) {
      this.left = l;
      this.right = r;
    }

      // fill in the rest yourself!
  } // Interval class

  /** Merges the new interval into an existing set of disjoint intervals.
   *
   * @param intervals the existing set of intervals
   * @param newInterval the interval to be added
   * @return a new set of disjoint intervals containing the original intervals
   * and the new interval, merging the new interval if necessary into existing
   * interval(s), to preseve the "disjointedness" property.
   */
  public static Set<Interval> merge
    (final Set<Interval> intervals, Interval newInterval)
  {
      // fill in the rest yourself!
  }
}
