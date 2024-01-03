package dao;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        System.out.println("created new row in employee table");
        return;
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("deleted row with id: " + employeeId);
        return;
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        System.out.println("fetching data from DB");
        return new EmployeeDo();
    }
}
