package repository;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import entity.Department;
import entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // 🔍 Derived query methods
    List<Employee> findByName(String name);

    Employee findByEmail(String email);

    List<Employee> findByDepartment(Department department);
}
