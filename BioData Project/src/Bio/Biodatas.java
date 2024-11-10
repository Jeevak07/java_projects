package Bio;

public class Biodatas {
	
	private int sno;
	private String name;
	private int age ;
	private int salary;
	
	public Biodatas(int sno ,String name ,int age,int salary) {
		this.sno=sno;
		this.name=name;
		this.age=age;
		this.salary=salary;
		
	}
	
	public void details() {
//		System.out.printf("| %-5s | %-8s | %-3s | %-5s |\n","Sno","Name","Age","Salary");
		System.out.printf("| %-5d | %-8s | %-3d | %-5d |\n",sno,name,age,salary);
	}
	
}
