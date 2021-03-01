package courses;

public class ClassStaticVar {

<<<<<<< HEAD
	
=======
	static int age = 250 ; 
>>>>>>> 759373a3041e1eaccb05891f99e1118870f6d593
	
	public static void testStatic() 
	{
		System.out.println("This is a static Method");
	}
	
	public static void main(String[] args) {
		System.out.println("Most people gradute from school at "+ClassStaticVar.age + " Years old");
		ClassStaticVar.testStatic();
	}

}
