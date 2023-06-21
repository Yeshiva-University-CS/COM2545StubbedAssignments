package edu.yu.introtoalgs;

/** Defines the API for the OctopusCount assignment: see the requirements
 * document for more information.
 *
 * Students MAY NOT change, or add to, the APIs below.  My test code will
 * only invoke the API defined below.
 *
 * @author Avraham Leff
 */

public interface OctopusCountI {

  public enum ArmTexture {
    SMOOTH,
    SLIMY,
    STICKY
  }

  public enum ArmColor {
    GRAY,
    RED,
    BLACK
  }
  
  /** Number of octopus arms: we assume that all octopuses have exactly this
   * number of arms.
   */
  public final static int N_ARMS = 8;

  /** A single octopus observation, consisting of a set of arrays (each of size
   * exactly N_ARMS), such that the ith element of each array describes the
   * characteristics of the ith arm of the observed octopus.
   *
   * @param observationId non-negative integer, uniquely labels the observation
   * (multiple observations can map to the same octopus),
   * @param colors the color of the ith arm, not null, elements can't be null
   * @param lengthInCM the length of the ith arm, not null, elements must be
   * positive integers
   * @param textures the texture of the ith arm, not null, elements can't be
   * null
   * @throws IllegalArgumentException if any of the parameter conditions are
   * violated: e.g., there aren't exactly N_ARMS values for each arm
   * characteristic or if a lengthInCM value is not a positive integer.
   */
  public void addObservation(int observationId,
                             ArmColor[] colors,
                             int[] lengthInCM,
                             ArmTexture[] textures);
                     
  /** Returns the number of unique octopus instances from the set of current
   * observations.
   *
   * @return the number of unique instances.
   */
  public int countThem();
} // interface
