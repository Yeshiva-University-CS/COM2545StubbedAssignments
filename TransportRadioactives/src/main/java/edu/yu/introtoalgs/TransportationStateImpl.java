package edu.yu.introtoalgs;

/** Implements the TransportationState interface.  
 *
 *
 * Students may ONLY use the specified constructor, and may (perhaps even
 * encouraged to) add as many other methods as they choose.
 *
 * @author Avraham Leff
 */

import static edu.yu.introtoalgs.TransportationState.Location.*;

public class TransportationStateImpl implements TransportationState { 

  /** Constructor:
   *
   * @param mithiumAtSrc amount of mithium at the src location, must be >= 0
   * @param cathiumAtSrc amount of cathium at the src location, must be >= 0
   * @param truckLocation location of the truck, must not be null
   * @param totalMithium sum of mithium amounts at src + dest, must be > 0
   * @param totalCathium sum of cathium amounts at src + dest, must be > 0
   *
   * @Students: you may NOT USE ANY OTHER CONSTRUCTOR SIG
   */
  public TransportationStateImpl(final int mithiumAtSrc,
                                 final int cathiumAtSrc,
                                 final Location truckLocation,
                                 final int totalMithium,
                                 final int totalCathium)
  {
  } // constructor


  @Override
  public int getMithiumSrc() { return -1; }

  @Override
  public int getCathiumSrc() { return -1; }
    
  @Override
  public int getMithiumDest() { return -1; }
    
  @Override
  public int getCathiumDest() { return -1; }
    
  @Override
  public Location truckLocation() { return null; }

  @Override
  public int getTotalMithium() { return -1; }

  @Override
  public int getTotalCathium() { return -1; }


}   // class
