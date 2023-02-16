package employee.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class employee {
	private static int   EmpId;
	private int Salary;
	private String EmpName,EmpDept;
	
	employee(int EmpId, String EmpName, String EmpDept, int Salary){
		this.EmpId= EmpId;
		this.EmpName= EmpName;
		this.EmpDept= EmpDept;
		this.Salary = Salary;
	}
	public int getEmpId(){
		return EmpId;
	}
	public String getEmpName(){
		return EmpName;
	}
	public String getEmpDept(){
		return EmpDept;
	}
	public int Salary(){
		return Salary;
	}
	
	public String toString(){
		return EmpId+" "+EmpName+" "+EmpDept+" "+Salary;
	}
}

class Operations{
	public static void main(String[] args){
		List<employee> c = new ArrayList<employee>();
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		int sn;
		do{
			System.out.println("1.ADD EMPLOYEE");
			System.out.println("2.UPDATE EMPLOYEE");
			System.out.println("3.DELETE EMPLOYEE");
			System.out.println("4.SHOW AN EMPLOYEE");
			System.out.println("5.SHOW ALL EMPLOYEES");
			System.out.print("enter your choice: ");
			sn = s1.nextInt();
			switch(sn){
				case 1:
				
					System.out.println("enter EmpId: ");
					int eid = s1.nextInt();
					System.out.println("enter EmpName: ");
					String ename = s2.nextLine();
					System.out.println("enter EmpDept: ");
					String edept =s2.nextLine();
					System.out.println("enter Salary: ");
					int sal = s1.nextInt();
					
					c.add(new employee(eid,ename,edept,sal));
					System.out.println(c);
				break;
				case 2 :
					boolean found = false;
					System.out.println("enter Employye Id to update : ");
					int empno = s1.nextInt();
					System.out.println("_____________________________________________");
					ListIterator<employee>li= c.listIterator();
					while(li.hasNext()){
						employee e =li.next();
						if(e.getEmpId()== empno){
							System.out.println("enter new name :");
							ename =s2.nextLine();
							System.out.println("enter new department :");
							edept =s2.nextLine();
							System.out.println("enter new salary :");
							sal =s1.nextInt();
							li.set(new employee(empno,ename,edept,sal));
							found =true;
						}
					
					}
					if(!found){
						System.out.println("employee not found");
					}
					else{
						System.out.println("employee record updated sucessfully");
					}
					System.out.println("_____________________________________________");
				break;
				case 3 :
					found = false;
					System.out.println("enter Employye Id to delete : ");
					empno = s1.nextInt();
					System.out.println("_____________________________________________");
					Iterator<employee> i  = c.iterator();
					while(i.hasNext()){
						employee e =i.next();
						if(e.getEmpId()== empno){
							i.remove();
							found =true;
						}
					
					}
					if(!found){
						System.out.println("employee not found");
					}
					else{
						System.out.println("employee record is deleted sucessfully");
					}
					System.out.println("_____________________________________________");
				break;
				case 4 :
					found = false;
					System.out.println("enter Employye Id to search : ");
					empno = s1.nextInt();
					System.out.println("_____________________________________________");
					i = c.iterator();
					while(i.hasNext()){
						employee e =i.next();
						if(e.getEmpId()== empno){
							System.out.println(e);
							found =true;
						}
					
					}
					if(!found){
						System.out.println("employee not found");
					}
					System.out.println("_____________________________________________");
				break;
				case 5 :
					System.out.println("_____________________________________________");
					i = c.iterator();
					while(i.hasNext()){
					employee e =i.next();
					System.out.println(e);
					}
					System.out.println("_____________________________________________");
				break;
					
			}
		}while(sn!=0);
	}
}
