package notDefaultPackage;

public class Account {
private String firstName;
private String lastName;
private int accountNumber;


	


public Account(String fName, String lName, int acc) {
		setFirstName(fName);
		setLastName(lName);
		setAccountNumber(acc);
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
}
