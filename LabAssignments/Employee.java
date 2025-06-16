/**
 * 
 * @author Mohammad
 * @version 12/7/2021
 */
public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    /**
     * Constructs an Employee object with specified name, ID number, department, and position.
     * 
     * @param employeeName        The name of the employee.
     * @param employeeIdNumber    The ID number of the employee.
     * @param employeeDepartment The department where the employee works.
     * @param employeePosition    The position held by the employee.
     */
    public Employee(String employeeName, int employeeIdNumber, String employeeDepartment, String employeePosition) {
        name = employeeName;
        idNumber = employeeIdNumber;
        department = employeeDepartment;
        position = employeePosition;
    }

    /**
     * Constructs an Employee object with specified name and ID number.
     * Department and position are set to empty strings.
     * 
     * @param employeeName        The name of the employee.
     * @param employeeIdNumber    The ID number of the employee.
     */
    public Employee(String employeeName, int employeeIdNumber) {
        name = employeeName;
        idNumber = employeeIdNumber;
        department = "";
        position = "";
    }

    /**
     * Constructs a default Employee object with empty name, ID number set to 0, department, and position.
     */
    public Employee() {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }

    /**
     * Retrieves the name of the employee.
     * 
     * @return The name of the employee.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the ID number of the employee.
     * 
     * @return The ID number of the employee.
     */
    public int getIdNumber() {
        return idNumber;
    }

    /**
     * Retrieves the department of the employee.
     * 
     * @return The department where the employee works.
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Retrieves the position of the employee.
     * 
     * @return The position held by the employee.
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the name of the employee.
     * 
     * @param nameGiven The name to be set for the employee.
     */
    public void setName(String nameGiven) {
        name = nameGiven;
    }

    /**
     * Sets the ID number of the employee.
     * 
     * @param idNumberGiven The ID number to be set for the employee.
     */
    public void setIdNumber(int idNumberGiven) {
        idNumber = idNumberGiven;
    }

    /**
     * Sets the ID number of the employee as a string and converts it to an integer.
     * 
     * @param idNumberGiven The string representation of ID number to be set for the employee.
     */
    public void setIdNumber(String idNumberGiven) {
        idNumber = Integer.parseInt(idNumberGiven);
    }

    /**
     * Sets the department of the employee.
     * 
     * @param department The department to be set for the employee.
     */
    public void setDepartment(String departmentGiven) {
        department = departmentGiven;
    }

    /**
     * Sets the position of the employee.
     * 
     * @param position The position to be set for the employee.
     */
    public void setPosition(String positionGiven) {
        position = positionGiven;
    }
}
