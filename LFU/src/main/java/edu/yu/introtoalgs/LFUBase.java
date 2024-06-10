package edu.yu.introtoalgs;

/** Defines the API for the LFU assignment using an abstract base class which
 * students will extend to provide a concrete class named LFU.  See the
 * requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * IMPORTANT design note: this class and its sub-classes need not be
 * thread-safe.
 *
 * @author Avraham Leff
 */

import java.util.Optional;

public abstract class LFUBase <Key, Value>{

  /** Constructor: supplies the maximum size of the cache: when the cache is
   * full, the LFU eviction policy MUST be used to select a cache entry to swap
   * out to make room for the new cache entry.
   *
   * @param maxSize maximum size of the cache, must be greater than 0.
   * @throws IllegalArgumentException as appropriate.
   * @see #set
  */
  public LFUBase(int maxSize) { }

  /** Caches the value, associating it with the key.  If the key is currently
   * associated with a different value, the new value overwrites the old value.
   *
   * @param key used to retrieve the value, may not be null
   * @param value the value to be cached, may not be null
   * @return Returns true iff a cache entry with a previously non-existent key
   * is inserted into the cache, false otherwise
   * @throws IllegalArgumentException as appropriate.
   * @see #get
   */
  public abstract boolean set(Key key, Value value);

  /** Retrieve the value (if any) associated with the key, encapsulating the
   * value in an Optional.  If no value is associated with the key, the
   * Optional encapsulates null.
   *
   * @return the value associated with the key
   * @see #set
   */
  public abstract Optional<Value> get(Key key);

  /** Returns the current size of the cache.
   *
   * @returns number of elements in the cache
   */
  public abstract int size();

  /** Return true iff the cache has no entries, false otherwise.
   *
   * @return is the cache empty or not. 
   */
  public abstract boolean isEmpty();

  /** Empties the cache, such that isEmpty will return true after the method
   * completes.
   *
   * @see #isEmpty
   */
  public abstract void clear();

} // abstract base class  
