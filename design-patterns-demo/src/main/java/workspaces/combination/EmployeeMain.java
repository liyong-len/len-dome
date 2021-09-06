package workspaces.combination;/**
 * @className EmployeeMain
 * @description EmployeeMain
 * @author liyong
 * @date 2021/7/26 17:46
 * @version 1.0
 */

/**
 * @author liyong
 * @date 2021/07/26  17:46
 */
public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee1 = new Employee("emp1", "chanpin", 1000);
        Employee employee2 = new Employee("emp1", "chanpin", 1000);
        Employee employee3 = new Employee("emp1", "chanpin", 1000);
        Employee employee4 = new Employee("emp1", "chanpin", 1000);
        Employee employee5 = new Employee("emp1", "qiche", 1000);
        Employee employee6 = new Employee("emp1", "qiche", 1000);
        employee1.addSub(employee2);
        employee1.addSub(employee3);
        employee1.addSub(employee4);
        System.out.println("employee1的下属有几人："+employee1.getCurrentSubSize());
        employee2.addSub(employee5);
        employee2.addSub(employee6);
        System.out.println("employee1的所有下属有几人："+employee1.getTotalSubSize());


    }
}
