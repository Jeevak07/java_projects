package Bio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BioDetails {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char input;
		List<Biodatas> bioList = new ArrayList<>();
		do {
		System.out.println("Enter Sno : ");
		int sno=in.nextInt();
		in.nextLine();
		System.out.println("Enter Name : ");
		String name = in.nextLine();
		System.out.println("Enter Age : ");
		int age = in.nextInt();
		System.out.println("Enter Salary : ");
		int salary = in.nextInt();
		

		
		Biodatas b = new Biodatas(sno,name,age,salary);
		bioList.add(b);
		
		System.out.println("Want to Add Another (y/n) : ");
		input = in.next().charAt(0);
		
		
		
		} 
		while(input=='y'||input=='Y');
		
		System.out.printf("| %-5s | %-8s | %-3s | %-5s |\n","Sno","Name","Age","Salary");
		for(Biodatas b : bioList) {
			b.details();
		}
		in.close();
	}

}
