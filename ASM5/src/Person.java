import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Person {

    private String name;
    private String address;
    private double salary;

    public Person() {
    }

    public String GetPerson(String path) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (FileReader fr = new FileReader(path)) {
            int i;
            while ((i = fr.read()) != -1) {
                sb.append((char) i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return sb.toString();
    }

    public boolean NewPerson(String path, String name, String address, double salary) throws IOException {
        StringBuilder content = new StringBuilder();
        content.append(name + "\t" + address + "\t" + salary + "\n");
        try (FileWriter fw = new FileWriter(path)) {
            BufferedWriter bfw = new BufferedWriter(fw);
            bfw.write(content.toString());
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

}