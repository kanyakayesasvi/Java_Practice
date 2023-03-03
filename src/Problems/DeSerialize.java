/**
 * 
 */
package Problems;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * @author kanyaka.y
 *
 */
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
public class DeSerialize {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fi= new FileInputStream("yesasvi.ser");//to read the data from a file
		    ObjectInputStream Oi=new ObjectInputStream(fi);
		    Employee e2=(Employee)Oi.readObject();//reads the object and storing the obj and using casting to convert the type of object
		    Oi.close();
		    fi.close();
		    System.out.println(e2.name + " " + e2.num);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
