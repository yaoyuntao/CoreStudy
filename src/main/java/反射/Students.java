package 反射;

public class Students {
	
	public String name;
	public int age;
	
	public Students() {
		super();
	}

	public Students(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void study(){
		System.out.println("学习");
	}
	
	public void speak(String name, int age){
		System.out.println("name:"+name+", age:"+age);
	}

	
}
