package employee;

public class EmployeePayRollData {
    /**
     * Instance variable id, name salary
     */
    int id;
    String name;
    Double salary;

    /**
     * Constructor for EmployeePayrollData.
     *
     * @param id;
     * @param name;
     * @param salary
     */

    public EmployeePayRollData(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String toString() {
        return " name=+'" + name + '\'' + "id=" + id + ",salary=" + salary;
    }
}