package ClassAndPackage;

public class AccountHolder {
	String Firstname;
	String LastName;
	int Age;
	float AccountBalance;
	boolean eligible;
	
	public void eligible ()
	{
		if (AccountBalance>10000 && Age>21){
			eligible=true;
		
	}
	
	}
}
