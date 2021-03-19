package myPackage;

public class Static3
{	
		public static void main(String[] args)
		{	
			Static2 s1 = new Static2(1, "Tejas");
			Static2 s2 = new Static2(2, "Tushar");
			Static2 s3 = new Static2(3, "Aniket");
			
			Static2.college = "NIBM";
			
			s1.getResult();
			s2.getResult();
			s3.getResult();
		}
}
