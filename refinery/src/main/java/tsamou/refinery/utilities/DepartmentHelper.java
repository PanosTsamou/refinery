package tsamou.refinery.utilities;

import tsamou.refinery.models.Department;

public class DepartmentHelper {
    public static void updateDeoartment(Department departmentToUpdate, Department department){
        departmentToUpdate.setName(department.getName());
        departmentToUpdate.setStaff_power(department.getStaff_power());
    }
}
