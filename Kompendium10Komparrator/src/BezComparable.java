
public class BezComparable {
	Integer age;
	String name;
	String surname;

	
	public BezComparable(int age, String name, String surname) {
		this.age = age;
		this.name = name;
		this.surname = surname;
	}


	@Override
	public String toString() {
		return "BezComparable [age=" + age + ", name=" + name + ", surname=" + surname + "]";
	}

}
