package Problems;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	String name;
	int num;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Employee(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}
	
	
}


public class Serialize {

	public static void main(String[] args) {
		//object
		Employee emp= new Employee("yesasvi",1);//creating an object employee and using serialization to convert the object into byte stream
		try {
			FileOutputStream fout =new FileOutputStream("yesasvi.ser");//creating a file to store the object
			ObjectOutputStream out = new ObjectOutputStream(fout); //to access the file
			out.writeObject(emp);
			out.close();
			fout.close();
			System.out.println("Serialize");
		}catch(Exception e) {
			e.printStackTrace();	
		}

	}

}
