object Q3 {

  def main(args: Array[String]): Unit = {
    val account1 = new Account(1, 1000.0)
    val account2 = new Account(2, 500.0)

    account1.deposit(100.0)  // Deposit 100 to account1
    account1.withdraw(50.0)  // Withdraw 50 from account1
    account1.transfer(200.0, account2)  // Transfer 200 from account1 to account2
    account1.printBalance()
    account2.printBalance()
  }
}

class Account(var accountId: Int, var balance: Double) {

  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
      println(s"Deposited $$${amount} to account $accountId. New balance: $$${balance}")
    } else {
      println("Deposit amount must be positive.")
    }
  }

  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
      println(s"Withdrew $$${amount} from account $accountId. New balance: $$${balance}")
    } else {
      println("Insufficient balance or invalid withdrawal amount.")
    }
  }

  def transfer(amount: Double, toAccount: Account): Unit = {
    if (amount > 0 && amount <= balance) {
      this.withdraw(amount)
      toAccount.deposit(amount)
      println(s"Transferred $$${amount} from account $accountId to account ${toAccount.accountId}")
    } else {
      println("Transfer failed due to insufficient funds or invalid amount.")
    }
  }
  def printBalance(): Unit = {
    println(s"Account $accountId current balance: $$${balance}")
  }
}
