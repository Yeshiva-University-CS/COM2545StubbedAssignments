package edu.yu.introtoalgs;

/** Defines the API for the DHashMap assignment using an abstract base class which
 * students will extend to provide a concrete class named DHashMap.  See the
 * requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * The class is generic: as a distributed hash map, clients must specify the
 * Key and Value classes for the map.
 * 
 * IMPORTANT design note: this class and its sub-classes need not be
 * thread-safe.  In the real world(tm), the class should be thread-safe, but
 * out of scope for this course.
 *
 * @author Avraham Leff
 */

import java.util.*;

public abstract class DHashMapBase<Key, Value> {

  /** Constructor: client specifies the per-server capacity of participating
   * servers (hash maps) in the distributed hash map.  (For simplicity, each
   * server has the same capacity.)  The system must throw an
   * IllegalArgumentException if clients attempt to store more than this amount
   * of data.
   *
   * @param perServerMaxCapacity per server maximum capacity, must be greater
   * than 0.
   * @throws IllegalArgumentException as appropriate.
   */
  public DHashMapBase(int perServerMaxCapacity) {
  }

  /** Returns the per server max capacity.
   *
   * @return per server max capacity.
   */
  public abstract int getPerServerMaxCapacity();
  
  /** Adds a server to the distributed hash map.  The implementation may choose
   * to rebalance the contents of the distributed hash map to incorporate the
   * new server.
   *
   * @param id uniquely identifies the server, can't be negative, can't
   * currently be in the distributed hash map
   * @param map the server's hash map: all data maintained by the server must
   * be stored in this map, can't be null.  It's the client's responsibility to
   * ensure that all supplied maps have the specified perServerMaxCapacity.
   * The implementation is responsible for ensuring that the map reference
   * isn't modified.
   * @throws IllegalArgumentException as appropriate.   
   */
  public abstract void addServer(int id, SizedHashMap<Key, Value> map);

  /** Removes the specified server from the distributed hash map.  The
   * implementation must relocate the server's current hash map to other
   * servers in the distributed hash map.
   *
   * @param id uniquely identifies the server, can't be negative, must
   * currently be in the distributed hash map
   * @throws IllegalArgumentException as appropriate.   
   */
  public abstract void removeServer(int id);

  /** Adds the specified key and value association to the distributed hash map.
   *
   * @param key can't be null
   * @param value
   * @throws IllegalArgumentException if size constraints prevent the Map entry
   * from being stored
   * @throws IllegalStateException if no server has been added to the
   * distributed hash map
   * @see #addServer
   * @see java.util.Map#put
   */
  public abstract Value put(Key key, Value value);

  /** Returns the value to which the specified key is mapped, or null if this
   * map contains no mapping for the key.
   *
   * @param key the key whose associated value is to be returned, may not be null.
   * @return the value to which the specified key is mapped, or null if this
   * map contains no mapping for the key
   * @throws IllegalArgumentException if key is null
   * @see java.util.Map#get
   */
  public abstract Value get(Object key);
  
  /** Removes the mapping for a key from this map if it is present.
   *
   * @param key key whose mapping is to be removed from the map, may not be
   * null.
   * @returns the previous value associated with key, or null if there was no
   * mapping for key.
   * @throws IllegalArgumentException as appropriate.
   * @see java.util.Map#remove
   */
  public abstract Value remove(Object key);

} // abstract base class  
