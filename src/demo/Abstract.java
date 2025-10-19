package demo;

abstract class bank{
	abstract void loan();
	abstract void account();
	
	void atm() {
		System.out.println("get your atm card");
	}
}

class loan1 extends bank{
	void loan() {
		System.out.println("get your loan");
	}
	void account() {
		System.out.println("get your account number");
	}
}
class education extends bank{
	void loan() {
		System.out.println("get your education loan");
	}
	void account() {
		System.out.println("student account");
	}
}
public class Abstract {

	public static void main(String[] args) {

		loan1 s1=new loan1();
		education s2=new education();
		s1.loan();
		s1.account();
		s1.atm();
		s2.loan();
		s2.account();
		s2.atm();
	}

}
