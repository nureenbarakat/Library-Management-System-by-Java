
package library.management.system.pkg1;

public class Admin extends Person{
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public Admin() {
    }

    @Override
    public String toString() {
        return super.toString()+" , Salary ="+salary; 
    }
    
}
