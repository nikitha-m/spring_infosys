package di;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//s is reference variable 
		//new Second() is the object
		
		//when an object is created then default constructor is called.
		//but no constructor is created in Second class. then why mo error?
		Second s=new Second();
		s.show();
	}

}
