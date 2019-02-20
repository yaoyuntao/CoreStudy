package JDBC;

/**
 * JavaBean
 * @author hancy
 * 2017年8月16日
 */
public class Students {

	private int id;
	private String name;
	private int age;
	private int classId;
	
	public Students() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", age=" + age + ", classId=" + classId + "]";
	}
	
	
	
}
