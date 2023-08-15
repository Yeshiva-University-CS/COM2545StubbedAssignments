package edu.yu.introtoalgs;

/** Simply "not done" to have transactions without accounts.  Hence this
 * absolutely minimal Account class.
 *
 * @author Avraham Leff
 */

import java.util.concurrent.atomic.AtomicInteger;

public class Account {
  public Account() {
    accountId = nextAccountId.getAndIncrement();
  }

  @Override
  public String toString() {
    return "account #"+accountId;
  }

  private static AtomicInteger nextAccountId = new AtomicInteger(1);
  public final int accountId;
}
