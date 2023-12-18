package corejava1;

class TypeOfVariable
{
	String name="Welcome";
	static String city="Mumbai";
	void displayAge()
	{
		int age=30;
		System.out.println("Age:" +age);
	}
	public static void main(String[] args) {
		TypeOfVariable t=new TypeOfVariable();
		t.displayAge();
		System.out.println("Name;"+t.name);
		System.out.println("city:"+city);
	}
	}
