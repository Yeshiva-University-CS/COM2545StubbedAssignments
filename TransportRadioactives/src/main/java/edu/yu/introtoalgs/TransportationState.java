package edu.yu.introtoalgs;

/** Interface that represents a single "state" in a sequence of transportation
 * moves of the radioactives between SRC and DEST.
 *
 * Students MAY NOT modify this interface in ANY WAY.
 *
 * @author Avraham Leff
 */

public interface TransportationState {
  public enum Location { SRC, DEST }

  /** Number of kg of mithium at the src 
   *
   * @return must be >= 0
   */
  public int getMithiumSrc();

  /** Number of kg of cathium at the src 
   *
   * @return must be >= 0
   */
  public int getCathiumSrc();

  /** Number of kg of mithium at the dest 
   *
   * @return must be >= 0
   */
  public int getMithiumDest();

  /** Number of kg of cathium at the dest 
   *
   * @return must be >= 0
   */
  public int getCathiumDest();

  /** Returns the current location of the transportation truck.
   */
  public Location truckLocation();

  /** Returns the sum of mithium at the src and dest, must be > 0.
   *
   * NOTE: this value doesn't change over the sequence of transportation moves.
   */
  public int getTotalMithium();

  /** Returns the sum of cathium at the src and dest, must be > 0.
   *
   * NOTE: this value doesn't change over the sequence of transportation moves.
   */
  public int getTotalCathium();
  
}
