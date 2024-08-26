package Rahul_Shetty_Practice_Projects.Assignment;

public class practice_interface implements demo_interface {

	@Override
	public void getdemo() 
	{
		System.out.println("Printing data from getdemo method");
	}

	@Override
	public void setdemo() 
	{
		System.out.println("Printing data from setdemo method");
	}

	public static void main(String args[]) {

		/*
		 * Creating an object of implemented of class
		 *
		 * practice_interface obj=new practice_interface(); obj.getdemo();
		 * obj.setdemo();
		 */
		
		demo_interface obj=new practice_interface();
		obj.getdemo();
		obj.setdemo();
	}

}
