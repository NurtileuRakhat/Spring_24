package kbtu.sis4.controller;


import kbtu.sis4.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private List<Employee> employeeList = new ArrayList<>();
    private int currentId = 1;

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        employee.setId(currentId++);
        employeeList.add(employee);
        return employee;
    }

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeList;
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Integer id) {
        return employeeList.stream()
                .filter(emp -> emp.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id)) {
                employee.setId(id);
                employeeList.set(i, employee);
                return employee;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Integer id) {
        employeeList.removeIf(emp -> emp.getId().equals(id));
        return "Employee with ID " + id + " deleted.";
    }
}
