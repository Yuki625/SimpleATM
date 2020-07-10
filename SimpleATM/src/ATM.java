
public class ATM {

	private MyAccount m_account;

	public ATM(MyAccount account) { m_account = account; }

	public void deposit(int cash_deposit) {

		int current = m_account.getBalance();

		m_account.setBalance(current + cash_deposit);
	}

	public void withdraw(int cash_want) {

		int current = m_account.getBalance();

		if (current < cash_want) {

			System.out.println("Can't withdraw: " + cash_want + " JPY");
			System.out.println("Your current balance is: "+ current + " JPY");

		} else {

			m_account.setBalance(current - cash_want);
		}
	}

	public void showCurrentBalance() {

		int current = m_account.getBalance();

		System.out.println("Current balance: " + current + " JPY");
	}
}