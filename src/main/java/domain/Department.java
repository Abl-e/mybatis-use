package domain;

import java.util.List;

/**
 * Created by 唐国翔 on 2017/8/15.
 */
public class Department {
    private Integer id;
    private String deptName;
    private List<Employee> employees;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Department{");
        sb.append("id=").append(id);
        sb.append(", deptName='").append(deptName).append('\'');
        sb.append(", employees=").append(employees);
        sb.append('}');
        return sb.toString();
    }
}
