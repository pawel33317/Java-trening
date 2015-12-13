
public class MyClass implements Comparable<MyClass>{
	Integer age;
	String name;
	String surname;

	
	public MyClass(int age, String name, String surname) {
		this.age = age;
		this.name = name;
		this.surname = surname;
	}


	@Override
	public String toString() {
		return "MyClass [age=" + age + ", name=" + name + ", surname=" + surname + "]";
	}


	@Override
	public int compareTo(MyClass o) {
		return this.age.compareTo(o.age);
	}



	
	
}
