
public class MyAccount {

	private int m_accNum; //口座番号
	private int m_password; //暗証番号
	private int m_balance; //残高
	private int m_dob; //生年月日

	public MyAccount() {}

	public int getAccNum() { return m_accNum; }
	public void setAccNum(int accNum) { m_accNum = accNum; }

	public int getPass() { return m_password; }
	public void setPass(int pass) { m_password = pass; }

	public int getBalance() { return m_balance; }
	public void setBalance(int balance) { m_balance = balance; }

	public int getDob() { return m_dob; }
	public void setDob(int dob) { m_dob = dob; }
}
