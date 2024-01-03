import dao.EmployeeDao;
import dao.EmployeeDaoProxy;
import dao.EmployeeDo;

public class Main {
    public static void main(String[] args) {
        try {
            EmployeeDao empTable = new EmployeeDaoProxy();
            empTable.create("USER", new EmployeeDo());
            System.out.println("Operation successful");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
