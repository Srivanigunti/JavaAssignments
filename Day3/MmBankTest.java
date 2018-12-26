
import static org.junit.Assert.*;

import java.sql.Savepoint;

import org.junit.Before;
import org.junit.Test;

public class MmBankTest {
	private Bank bank1;
	private Bank bank2;
	
	@Before
	public void setup()
	{
		 bank1=new Bank("Sri",10000);
		 bank2=new Bank("Vani",20000);
	}

	@Test
	public void testForCurrentBalance() {
		int result=bank1.balance(bank1);
		assertEquals(10000,result);
	}
	
	@Test
	public void testForCheckingAccountNumber() {
		long result=bank1.accountNumber();
		assertEquals(101,result);
	}
	
	@Test
	public void testForDepositingAmount() {
		double result=bank1.deposit(1000);
		assertEquals(11000,result,2);
	}
	
	@Test
	public void testForWithdrawingAmount() {
		double result=bank1.withdraw(1000);
		assertEquals(9000,result,2);
	}
	
	@Test
	public void testForZeroBalanceAccount() {
		double result=bank1.zeroBalance(bank1);
		assertEquals(10000,result,2);
	}
	
	@Test
	public void testForGettingNextAccountNumber() {
		long result=bank1.getNextAccountNumber();
		assertEquals(10234,result,2);
	}
	
	@Test
	public void testForFundsTrasfer() {
		boolean flag=GatewayForPayment.trasfer(bank1,bank2,1000);
		assertTrue(flag);
	}
	
	
	

}