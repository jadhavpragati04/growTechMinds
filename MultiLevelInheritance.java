class parentOne
{
	{
		System.out.println("Method parent one");
	}
}
class parentTwo extends parentOne
{
	{
		System.out.println("Method parent two");
	}
}
class parentThree extends parentTwo
{
	{
		System.out.println("Method parent three");
	}
}
class parentFour extends parentThree
{
	{
		System.out.println("Method parent four");
	}
}
class childFive extends parentFour
{
	public void methodFive()
	{
		System.out.println("Method child five");

	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childFive ch = new childFive();
		ch.methodFive();

	}

}
