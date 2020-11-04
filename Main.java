import java.util.HashSet;
import java.util.Set;
/**
 * File Name: Main.java 
 * Purpose: To create Bank Account Objects, add them to a hashSet
 * and to cycle through them to print the attributes of each one<br>
 * Created: 01/04/20<br>
 * Modified: 01/04/20<br>
 * Copyright: No Copyright
 * @version 1.0<br>
 * @author Morgan Firkins<br>
 */
public class Main {
	/**
	 * Creates Bank Account Objects, adds them to a hashSet
	 * and loops through each of them printing each attribute 
	 * @param args
	 */
	public static void main(String[] args) {
		//Creates a new HashSet to store Bank Account Objects
		Set<BankAccount> accountSet = new HashSet<BankAccount>();
		//Creates three new Bank Account Objects
		BankAccount b1 = new BankAccount(123000, 321000);
		BankAccount b2 = new BankAccount(555000, 555000);
		BankAccount b3 = new BankAccount(223000, 321000);
		/*Test out that the hashCode method works correctly
		and that objects with identical attributes
		print identical hashCodes
		*/
		System.out.println("Hash Codes for Bank Accounts:");
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());
		/*Tests out that the equals method works correctly on
		a Bank Account object with identical attributes
		*/
		System.out.println("Are any Bank Account equal?:");
		System.out.println(b1.equals(b3));
		System.out.println(b2.equals(b3));
		System.out.println(b2.equals(b1));
		//Adds created objects to accountSet hashSet
		accountSet.add(b1);
		accountSet.add(b2);
		accountSet.add(b3);
		/* For each Bank Account object in accountSet
		 * print the account number and sort code of each
		 */
		System.out.println("Attributes of each bank account in hashSet:");
		for (BankAccount b : accountSet) {
			System.out.println(b.getAccountNumber());
			System.out.println(b.getSortCode());
			
		}

	}

}
