package phase1.assisted_practice.classes_objects_oops;

class EncapTest {

	 private int age;
	 private String name;
	 private int deptNo;
		
		public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
}
	
public class Encapsulatn {
	
		public static void main(String[] args) {
			EncapTest encap = new EncapTest();
			encap.setName("James");
			encap.setAge(20);

			System.out.print("Name : " + encap.getName() + "\t\t Age : " + encap.getAge());
	}

}
