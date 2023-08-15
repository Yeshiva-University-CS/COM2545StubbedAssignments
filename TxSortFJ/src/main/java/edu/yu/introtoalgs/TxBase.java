package edu.yu.introtoalgs;

/** Defines the public Tx API: your Tx API implementation MUST extend TxBase,
 * MAY NOT change the constructor signature, and MAY NOT add any public state.
 *
 * @author Avraham Leff
 */

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicLong;

public abstract class TxBase implements Comparable<TxBase> {

  /** Constructor.
   *
   * @param sender non-null initiator of the transaction
   * @param receiver non-null recipient
   * @param amount positive-integer-valued amount transfered in the
   * transaction.
   */
  TxBase(Account sender, Account receiver, int amount) {
    // fill me in with your implementation!
  }

  public abstract Account receiver();
  public abstract Account sender();
  public abstract int amount();

  /** Returns a unique non-negative identifier.
   */
  public abstract long id();

  /** Returns the time that the Tx was created or null.
   */
  public abstract LocalDateTime time();

  /** Returns the time that the Tx was created or null.
   */
  public abstract void setTimeToNull();
  
  @Override
  public String toString() {
    return "Tx{" +
      "sender=" + sender() +
      ", receiver=" + receiver() +
      ", amount=" + amount() +
      ", id=" + id() +
      ", time=" + time() +
      '}';
  }

  @Override
  public int compareTo(TxBase other) {
    // you may want to change this implementation!
    return -1;
  }
}
