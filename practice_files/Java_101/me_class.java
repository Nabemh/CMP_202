package practice_files.Java_101;

/*
 * Me.sayName - prints out the name of user
 * Me.sayAge - prints out the age of user
 *
 * Return: Non-applicable
 */


class Me {
	static void sayName()
	{
		System.out.println("My name is: User");
	}

	static void sayAge()
	{
		System.out.println("Age = 15");
	}
}

class Main {
	public static void main(String[] args)
	{
		Me.sayName();
		Me.sayAge();

		System.out.println("Not bad for a first trial");
	}
}
