package edu.yu.introtoalgs;

/** A class that provides a cache associating Integer-valued keys and values.
 * The implementation is constrained to a given capacity such that if the
 * number of entries exceeds the capacity, entries are removed to to maintain
 * the "does not exceed capacity" constraint.  When removing elements to
 * maintain the capacity constraint, the implementation follows the
 * "least-recently-used" policy.
 *
 */

public class IntegerLRUCache {

  /** Constructs an empty cache with the specified capacity.  The cache
   * implementation is forbidden from exceeding this capacity, but may choose
   * to use less than this capacity.
   *
   * @param initialCapacity the initial capacity
   */
  public IntegerLRUCache(final int capacity) {
      // fill me in!
  }

  /** Returns the cached value associated with the specified key, null if not
   * cached previously
   *
   * @param key the key whose associated value is to be returned
   * @return the previously cached value, or null if not previously cached
   * @throws IllegalArgumentException if the key is null
   */
  public Integer get(final Integer key) {
      // fill me in!
  }

  /** Associates the specified value with the specified key. If the cache
   * previously contained an association for this key, the old value is
   * replaced, and the key is now associated with the specified value.  If
   * inserting this item will cause the cache to exceed its capacity, the
   * method will evict some other item to maintain the capacity constraint.
   * The item selected is the least-recently-used ("accessed") item.
   *
   * @param key key with which the specified value is to be associated
   * @param value value to be cached
   * @return the value associated with this key if previously cached, otherwise
   * null
   * @throws IllegalArgumentException if either the key or value is null
   */
  public Integer put (final Integer key, final Integer value) {
      // fill me in!
  }

  /** Removes the specified key-value mapping if present (returning the value
   * previously associated with the key), no-op returns null if no previous
   * association.
   *
   * @param key key whose mapping is to be removed
   * @return previous value associated with key, otherwise null
   * @throws IllegalArgumentException if the key is null
   */
  public Integer remove(Object key) {
      // fill me in!
  }
  

}
