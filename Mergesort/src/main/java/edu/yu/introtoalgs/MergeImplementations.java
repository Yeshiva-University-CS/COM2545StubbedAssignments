package edu.yu.introtoalgs;

/** Enum defines set of classes that implement the Mergesorter interface
 *
 * @author Avraham Leff
 */

import java.util.Comparator;

public enum MergeImplementations {
  ParallelMerge, Merge, MergeX, JDKParallelMerge;

  public static Mergesorter MergesorterFactory (final MergeImplementations impl) {
    Mergesorter sorter = null;
    switch(impl) {
    case Merge:
      sorter = new Merge();
      break;
    case MergeX:
      sorter = new MergeX();
      break;
    case ParallelMerge:
      sorter = new ParallelMerge();
      break;
    case JDKParallelMerge:
      sorter = new JDKParallelMerge();
      break;
    default:
      throw new IllegalArgumentException("Unknown Mergesorter implementation: "
                                         +impl);
    }

    return sorter;
  }
  
}
