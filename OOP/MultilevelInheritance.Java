// Parent class
class Company {
    int empId;
    String empName;
    double salary;

   public void setCompany(int id, String name, double salary) {
        this.empId = id;
        this.empName = name;
        this.salary = salary;
    }

    public void displayCompany() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }
}


class Employee  extends Company{
    String ename;
   double esal;
   


    public void setEmployee(String ename,double esal) {
        this.ename=ename;
        this.esal=esal;

       
    }

    public void displayEmployee() {
        System.out.println("Programmer name:"+ ename);
        System.out.println("Employee salary: " + esal);

    }


}
class Programmer extends Employee{
    String name;
    String gender;
    double sal;

    public void setProgrammer(String name,String gender,double sal){
        this.name=name;
        this.gender=gender;
        this.sal=sal;
    }

        public void displayProgrammer(){
            System.out.println("name :" + name);
            System.out.println("gender :" +gender);
            System.out.println("salary : " + sal);
        }
    }



public class Practice1 {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.setCompany(101, "suresh", 55000);  
        p.setEmployee("Ramesh",1234.89);  
        p.setProgrammer("ganesh","male",65344.7);          

        p.displayCompany();
        p.displayEmployee();
        p.displayProgrammer();
    }

}


