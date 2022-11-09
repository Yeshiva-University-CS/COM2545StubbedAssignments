package edu.yu.introtoalgs;

/** Interface defining an API for calculating the number of primes below a
 * given bound.
 *
 * @author Avraham Leff
 */
public interface PrimeCalculator {

  /** Returns the number of primes in the specified range.
   *
   * @param start inclusive, must be greater than 1
   * @param end inclusive, must be less than Long.MAX_VALUE
   * @return number of primes in the specified range.
   * @throws IllegalArgumentException if parameter semantics are violated
   */
  int nPrimesInRange(long start, long end);
}
