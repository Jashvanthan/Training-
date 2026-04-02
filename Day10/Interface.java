// Implementation of the Animal interface
class Dog implements Animal {
	@Override
	public void eat() {
		System.out.println("Dog is eating.");
	}

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping.");
	}

	@Override
	public String getType() {
		return "Dog";
	}
}
// Example of a Java interface
public interface Animal {
	void eat();
	void sleep();
	String getType();
}
