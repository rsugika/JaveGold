import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream; 
import java.io.Serializable;



/***
 * Customeize serialize method
 */


public class Check11 {
    public static void main(String[] args) throws Exception {
        
        // serialize
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("emp.ser"));
        try (out) {
            Employee11 emp = new Employee11("sample", "12345678910");
            out.writeObject(emp);
        }

        // deserialize
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("emp.ser"));
        try (in) {
            Employee11 emp = (Employee11) in.readObject();
            System.out.println(emp);
        }
    }
}

class Employee11 implements Serializable {
    private String name;
    private String telephone;

    public Employee11(String name, String telephone) {
        super();
        this.name  = name;
        this.telephone = telephone;
    }
    private void writeObject(ObjectOutputStream out) throws IOException {
        System.out.println("Write");
        out.writeObject(name);
        out.writeObject(telephone);
    }
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
        System.out.println("Read");
        this.name = (String) in.readObject();
        this.telephone = (String) in.readObject();
    }
    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }
    @Override public String toString() {
        return "Employee [name = " + name + ", telephone = " + telephone + "]";
    }
}