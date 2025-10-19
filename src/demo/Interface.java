package demo;


interface trans {
	void pay();
	void send();
	void account();
}
class data {
	void userdata() {
		System.out.println("i am a account holder");
	}
}
class gpay extends data implements trans {
	public void account(){
		System.out.println("get your account number");
	}
	public void pay() {
		System.out.println("paying with gpay");
	}
	public void send() {
		System.out.println("sending amount with phone pay");
	}
}

class phonepay implements trans{

public void pay() {
		System.out.println("paying with phone pay");
	}
	public void send() {
		System.out.println("sending amount with phone pay");
	}
	@Override
	public void account() {
		System.out.println("number");
		
	}
	
}
public class Interface {

	public static void main(String[] args) {
		gpay s1=new gpay();
		s1.userdata();
		s1.account();
		s1.pay();
		phonepay s2=new phonepay();
		s2.pay();
	    
	    
	}

}
