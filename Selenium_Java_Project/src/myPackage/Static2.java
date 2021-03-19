package myPackage;

public class Static2 {
	int roll; //global variable;
	String name; //global variable;
	static String college = "JSPM";
	
	//Introducing Constructor
	Static2(int r, String n)
	{
		roll = r;
		name = n;
	}
	
	public void getResult() {
		System.out.println(roll + " " + name + " " + college);
	}
	
}
