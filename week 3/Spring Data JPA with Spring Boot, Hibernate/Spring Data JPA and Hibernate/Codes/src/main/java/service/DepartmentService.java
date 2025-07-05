package service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import entity.Department;
import repository.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Optional<Department> getDepartmentById(Long id) {
        return departmentRepository.findById(id);
    }

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department updateDepartment(Long id, Department updatedDepartment) {
        return departmentRepository.findById(id)
                .map(dept -> {
                    dept.setName(updatedDepartment.getName());
                    return departmentRepository.save(dept);
                })
                .orElseThrow(() -> new RuntimeException("Department not found"));
    }

    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}
