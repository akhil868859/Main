class Employee{
    private int id;
    private String name;
    private float salary;
    private String department;

   public int getId(){
       return id;
   }
   public void setId(int id){
       this.id = id;
   }
   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name=name;
   }
   public float getSalary(){
       return salary;
   }
   public void setSalary(float salary){
        this.salary =salary;
   }
   public String getDepartment(){
       return department;
   }
   public void setDepartment(String department){
       this.department = department;
   }
}
public class Main{
   public static void main(String[] args){

       Employee employee = new Employee();
       employee.setId(1);
       employee.setName("JAVA");
       employee.setSalary(30000.98f);
       employee.setDepartment("MCA");

      System.out.println(employee.getId());
       System.out.println(employee.getName());
       System.out.println(employee.getSalary());
       System.out.println(employee.getDepartment());
       
   }
}
