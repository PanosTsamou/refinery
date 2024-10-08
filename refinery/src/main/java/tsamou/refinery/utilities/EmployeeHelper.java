package tsamou.refinery.utilities;

import tsamou.refinery.models.Employee;

public class EmployeeHelper {
    public static void updateEmployee(Employee employeeToBeUpdated, Employee employee){
        employeeToBeUpdated.setFirst_name(employee.getFirst_name());
        employeeToBeUpdated.setLast_name(employee.getLast_name());
        employeeToBeUpdated.setId_number(employee.getId_number());
        employeeToBeUpdated.setAge(employee.getAge());
        employeeToBeUpdated.setAddress(employee.getAddress());
        employeeToBeUpdated.setFull_name(employee.getFull_name());
        employeeToBeUpdated.setWorking_role(employee.getWorking_role());
        employeeToBeUpdated.setWorking_status(employee.getWorking_status());
        employeeToBeUpdated.setOffice_phone_number(employee.getOffice_phone_number());
        employeeToBeUpdated.setPersonal_phone_number(employee.getPersonal_phone_number());
        employeeToBeUpdated.setApprovals(employee.getApprovals());
        employeeToBeUpdated.setWork_permits(employee.getWork_permits());
        employeeToBeUpdated.setWorking_orders(employee.getWorking_orders());
        employeeToBeUpdated.setUnit(employee.getUnit());
        employeeToBeUpdated.setDepartment(employee.getDepartment());
        employeeToBeUpdated.setToolBox(employee.getToolBox());
    }
}
