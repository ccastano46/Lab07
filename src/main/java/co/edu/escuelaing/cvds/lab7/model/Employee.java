package co.edu.escuelaing.cvds.lab7.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @Column(name = "EMPLOYEE_ID")
    private String EMPLOYEE_ID;
    @Column(name = "FIRST_NAME")
    private String FIRST_NAME;
    @Column(name = "LAST_NAME")
    private String LAST_NAME;
    @Column(name = "ROLE")
    private String ROLE;
    @Column(name = "SALARY")
    private double SALARY;
    
    public Employee(String EMPLOYEE_ID, String FIRST_NAME, String LAST_NAME, String ROLE,double SALARY) {
        this.EMPLOYEE_ID = EMPLOYEE_ID;
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.ROLE = ROLE;
        this.SALARY = SALARY;
    }

    public String getEmployeeID() {
        return EMPLOYEE_ID;
    }

    public void setEmployeeID(String EMPLOYEE_ID) {
        this.EMPLOYEE_ID = EMPLOYEE_ID;
    }

    public String getFirstName() {
        return FIRST_NAME;
    }

    public void setFirstName(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getLastName() {
        return LAST_NAME;
    }

    public void setLastName(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public String getRole() {
        return ROLE;
    }

    public void setRole(String ROLE) {
        this.ROLE = ROLE;
    }

    public double getSalary() {
        return SALARY;
    }

    public void setSalary(double SALARY) {
        this.SALARY = SALARY;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((EMPLOYEE_ID == null) ? 0 : EMPLOYEE_ID.hashCode());
        result = prime * result + ((FIRST_NAME == null) ? 0 : FIRST_NAME.hashCode());
        result = prime * result + ((LAST_NAME == null) ? 0 : LAST_NAME.hashCode());
        result = prime * result + ((ROLE == null) ? 0 : ROLE.hashCode());
        result = prime * result + (int) SALARY;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
       Employee em;
        try{
            em = (Employee) obj;
            if(EMPLOYEE_ID.equals(em.getEmployeeID()) && FIRST_NAME.equals(em.getFirstName()) && 
                FIRST_NAME.equals(em.getFirstName()) && LAST_NAME.equals(em.getLastName()) &&
                ROLE.equals(em.getRole()) && SALARY == em.getSalary()){
                    return true;
                }
            else{
                return false;
            }
       }catch (Exception e){
            return false;
       }
    }

    @Override
    public String toString() {
        return "Configuration [EMPLOYEE ID = " + EMPLOYEE_ID + ", First Name = " + FIRST_NAME + ", Last Name = " + LAST_NAME +
            ", Role = " + ROLE + ", Salary = " + SALARY + "]";
    }
}