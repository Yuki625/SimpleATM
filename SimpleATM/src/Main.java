import java.util.Scanner;

public class Main {
	
	static MyAccount m_account;

	public static void main(String[] args) {

		int m_accNum = 18900;
		int m_password = 2018;
		int m_balance = 200000;

		m_account = new MyAccount();
		m_account.setAccNum(m_accNum);
		m_account.setPass(m_password);
		m_account.setBalance(m_balance);

		System.out.print("Select <log-in> (ID: 18900) / <register> : ");

		Scanner sc = new Scanner(System.in);
		String select = sc.next();

		if (select.equals("register")) {
			
			register(sc);
			
			System.out.print("Completed. Enter Password to Log In : ");
			
			login(sc, m_account);

		} else if (select.equals("log-in")) {
			
			System.out.print("Enter Password : ");
			
			login(sc, m_account);
		
		} else System.out.println("Error");
	}
	
	static void register(Scanner sc) {
		
		m_account = new MyAccount();
		
		System.out.print("Set Account Number : ");
		m_account.setAccNum(sc.nextInt());

		System.out.print("Set Password : ");
		m_account.setPass(sc.nextInt());

		System.out.print("Set Balance : ");
		m_account.setBalance(sc.nextInt());
	}
	
	static void login(Scanner sc, MyAccount m_account) {
		
		int password = sc.nextInt();

		if (password == m_account.getPass()) {

			System.out.println("Balance : " + m_account.getBalance());
			System.out.print("Select <deposit> / <withdraw> : ");
			
			String select = sc.next();
			
			if (select.equals("deposit")) startDeposit(sc, m_account);
			
			else if (select.equals("withdraw")) startWithdraw(sc, m_account);

		} else System.out.println("Wrong Password");
	}
	
	static void startDeposit(Scanner sc, MyAccount m_account) {
		
		ATM atm = new ATM(m_account);
		
		System.out.print("Enter deposit amount : ");
		
		int deposit = sc.nextInt();

		System.out.println("Start deposit : "+ deposit + " JPY");

		atm.deposit(deposit);
		atm.showCurrentBalance();
	}
	
	static void startWithdraw(Scanner sc, MyAccount m_account) {
		
		ATM atm = new ATM(m_account);
		
		System.out.print("Enter withdraw amount : ");
		
		int withdraw = sc.nextInt();

		System.out.println("Start withdraw : "+ withdraw + " JPY");

		atm.withdraw(withdraw);
		atm.showCurrentBalance();
	}
}