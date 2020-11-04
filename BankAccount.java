/**
 * File Name: BankAccount.java<br>
 * Purpose: To construct Bank Account Objects by taking in the
 * account number and sort code of an account holder<br>
 * Created: 01/04/20<br>
 * Modified: 01/04/20<br>
 * Copyright: No Copyright<br>
 * @author Morgan Firkins<br>
 * @version 1.0<br>
 */
public class BankAccount {
	private final int ACCOUNTNUMBER; //account number of a Bank Account
	private final int SORTCODE; //sort code of a Bank Account
	/**
	 * Constructs a Bank Account Object<br>
	 * @param accountNumber: the account number associated with a Bank Account<br>
	 * @param sortCode: the sort code number associated with a Bank Account<br>
	 */
	public BankAccount(int accountNumber, int sortCode) {
		this.ACCOUNTNUMBER = accountNumber;
		this.SORTCODE = sortCode;

	}
	/**
	 * Returns the ACCOUNTNUMBER of a Bank Account Object
	 * @return the ACCOUNTNUMBER of the account
	 */
	public int getAccountNumber() {
		return this.ACCOUNTNUMBER;
	}
	/**
	 * Returns the SORTCODE of a Bank Account Object<br>
	 * @return the SORTCODE of the account
	 */
	public int getSortCode() {
		return this.SORTCODE;
	}
	@Override
	/**
	 * Checks if two BankAccount objects are equal<br>
	 * @return whether the objects are equal or not
	 */
	public boolean equals(Object obj) {
		// If the references match then we then this and obj point to the same object.
		// Therefore, they are equal.
		if (this == obj) {
			return true;
		}
		// This object (which exists) can never be equal to a null reference.
		if (obj == null) {
			return false;
		}
		// Now we know both objects exist. We need to check that their classes match.
		if (obj.getClass() != this.getClass()) {
			return false;
		}
		// Both this and obj exist and are of the same class.
		// Now we can compare the account numbers and sort codes. BankAccount other =
		// (BankAccount) obj;
		BankAccount otherObject = (BankAccount) obj;
		// if both account numbers are the same then return true
		if (this.getAccountNumber() == otherObject.getAccountNumber()) {
			return true;
		}
		// if both sort codes are the same then return true
		else if (this.getSortCode() == otherObject.getSortCode()) {
			return true;
		}

		else {
			return false;
		}

	}
	/**
	 * Produces a hash code for a Bank Account Object<br>
	 * @return the hashCode of a BankAccount Object
	 */
	public int hashCode() {
		int hashOutput = (this.ACCOUNTNUMBER * 7) + (this.SORTCODE * 23);
		return hashOutput;

	}

}
