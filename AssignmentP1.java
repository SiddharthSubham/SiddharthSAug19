class AssignmentP1
{
	public static void main(String args[])
	{
		int x = 10;
		int y = 20;
		System.out.println("Sum of two integers is :" + (x+y));
	}
}

// Method 2

class AssignmentP1
{
	public static void main(String args[])
	{
		AssignmentP1 p1 = new AssignmentP1();
		p1.SumOfTwoIntegers();
	}
	void SumOfTwoIntegers()
	{
		int x = 10;
		int y = 20;
		System.out.println("Sum of two integers is :" + (x+y));
	}
}

//Method 3

class AssignmentP1
{
	public static void main(String args[])
	{
		AssignmentP1 p1 = new AssignmentP1();
		p1.SumOfTwoIntegers(10, 20);
	}
	void SumOfTwoIntegers(int x, int y)
	{
		System.out.println("Sum of two integers is :" + (x+y));
	}
}

// Method 4

class AssignmentP1
{
	int x = 10;
	int y = 20;
	public static void main(String args[])
	{
		AssignmentP1 p1 = new AssignmentP1();
		p1.SumOfTwoIntegers();
	}
	void SumOfTwoIntegers()
	{
		int z = x + y;
		System.out.println("Sum of two integers is :" + z);
	}
}

