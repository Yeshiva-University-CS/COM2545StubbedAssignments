package edu.yu.introtoalgs;

/** Enum defines set of classes that implement the Sortsorter interface
 *
 * @author Avraham Leff
 */

import java.util.Comparator;

public enum SortImplementations {
  Bubblesort, JDKSort;

  public static Sorter SortFactory (final SortImplementations impl) {
    Sorter sorter = null;
    switch(impl) {
    case Bubblesort:
      sorter = new Bubblesort();
      break;
    case JDKSort:
      sorter = new JDKSort();
      break;
    default:
      throw new IllegalArgumentException("Unknown Sorter implementation: "+impl);
    }

    return sorter;
  }
  
}
