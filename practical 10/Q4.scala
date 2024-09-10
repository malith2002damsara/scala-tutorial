object Q4 {

  def main(args: Array[String]): Unit = {
    val negativeAccounts = negativeBalanceAccounts(bankAccounts)
    val totalBalance = sumOfBalances(bankAccounts)
    val finalBalances = applyInterest(bankAccounts)

    println("Accounts with Negative Balances: " + negativeAccounts)
    println("Sum of All Account Balances: " + totalBalance)
    println("Final Balances After Applying Interest: " + finalBalances)
  }

  case class Account(accountId: Int, balance: Double)
  val bankAccounts: List[Account] = List(
    Account(1, 500.0),
    Account(2, -200.0),
    Account(3, 1500.0),
    Account(4, -50.0),
    Account(5, 0.0)
  )
  // q1. List of Accounts with Negative Balances
  def negativeBalanceAccounts(accounts: List[Account]): List[Account] = {
    accounts.filter(account => account.balance < 0)
  }
  // q2. Calculate the Sum of All Account Balances
  def sumOfBalances(accounts: List[Account]): Double = {
    accounts.map(_.balance).sum
  }
  // q3. Calculate Final Balances After Applying Interest
  def applyInterest(accounts: List[Account]): List[Account] = {
    accounts.map { account =>
      val newBalance = if (account.balance > 0) {
        account.balance * 1.05 // 5% interest for positive balance
      } else if (account.balance < 0) {
        account.balance * 1.10 // 10% interest for negative balance
      } else {
        account.balance
      }
      account.copy(balance = newBalance)
    }}
  }





