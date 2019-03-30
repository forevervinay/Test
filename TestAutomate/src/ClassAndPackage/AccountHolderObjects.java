package ClassAndPackage;

public class AccountHolderObjects {

public static void main(String[] args) {
	AccountHolder tom = new AccountHolder();
	AccountHolder Henry = new AccountHolder();
	AccountHolder Sarah = new AccountHolder();
	
	tom.Firstname="TOM";
	tom.LastName="eligibleJain";
	tom.Age=22;
	tom.AccountBalance=22000;
	tom.eligible();
	System.out.println("He is Eligible" + tom.eligible );
	
	}
}
