package edu.yu.introtoalgs;

/** A "size constrained hash map" to model environments where data are too
 * large to fit into a single machine's RAM.  In "Introduction to Algorithms",
 * creating such environments "for real" requires too much effort and is a
 * distraction from the algorithmic pedagogy of the DHashMap assignment.
 *
 * IMPORTANT: methods that store data in the map will throw an OutOfMemoryError
 * if map size is at maxCapacity.  (No special casing to allow for overwriting
 * an existing map entry.)
 *
 * Students may not modify this class in any way nor may they subclass it.  My
 * test suite will execute against this version of the class.
 *
 * @author Avraham Leff
 */

import java.util.*;

public final class SizedHashMap<K,V> extends HashMap<K, V> {
  /** Constructs an empty HashMap with the specified initial capacity and the
   * default load factor (0.75).
   *
   * @param maxCapacity specifies a capacity constraint that will be enforced
   * to ensure that no more than maxCapacity entries are created, must be at
   * least 1.
   * @throws IllegalArgumentException as appropriate.
   */
  public SizedHashMap(final int maxCapacity ) {
    super(maxCapacity);

    if (maxCapacity < 1) {
      throw new IllegalArgumentException("maxCapacity must be > 0: "+maxCapacity);
    }

    this.maxCapacity = maxCapacity;
  }

  /** Returns the maximum capacity of the hash map.
   *
   * @return the maximum capacity.
   */
  public int getMaxCapacity() { return maxCapacity; }

  @Override
  public void clear() {
    super.clear();
  }

  @Override
  public V put(K key, V value)  {
    if (size() >= maxCapacity) {
      throw new OutOfMemoryError("Map size is already at maxCapacity: "+maxCapacity);
    }

    final V v = super.put(key, value);
    return v;
  }

  @Override
  public void putAll(Map<? extends K,? extends V> m)  {
    if (size() >= maxCapacity) {
      throw new OutOfMemoryError("Map size is already at maxCapacity: "+maxCapacity);
    }

    super.putAll(m);
  }

  private final int maxCapacity;
} // class
