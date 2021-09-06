package workspaces.combination;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liyong
 * @version 1.0
 * @className Employee
 * @description Employee
 * @date 2021/7/26 17:32
 */

@Data
@NoArgsConstructor
public class Employee {
    private String name, dept;
    private int salary;
    private List<Employee> subordinates = new ArrayList<>();

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public void addSub(Employee employee) {
        this.subordinates.add(employee);
    }

    public void remove(Employee employee) {
        this.subordinates.remove(employee);
    }

    public Employee getSub(String employeeName) {
        return this.subordinates.stream().filter(sub -> employeeName.equals(sub.getName())).collect(Collectors.toList()).get(0);
    }

    public int getCurrentSubSize() {
        return this.subordinates.size();
    }

    public int getTotalSubSize() {
        int size = this.subordinates.size();
        size += this.subordinates.stream().map(Employee::getSubordinates).flatMap(Collection::stream).count();
        return size;
    }

}
