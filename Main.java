class Employee{
    private String name;
    private int id;
    private double salary;
    private String department;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id = id;
    }
    public double getsalary(){
        return salary;
    }
    public void setsalary(double salary){
        this.salary =salary;
    }
    public String getdepatment(){
        return department;
    }
    public void setdeparment(String department){
        this.department = department;
    }
}
public class Main{
    public static voide main(String[] args){

        Employee employee = new Employee();
        employee.setName("JAVA");
        employee.setId(1);
        employee.setSalary(30000.98);
        employee.setDeparmenu("MCA");

        System.out.println(employee.getName());
        System.out.println(employee.getId());
        System.out.println(employee.getSalary());
        System.out.println(employee.getDepatment());
        
    }
 }