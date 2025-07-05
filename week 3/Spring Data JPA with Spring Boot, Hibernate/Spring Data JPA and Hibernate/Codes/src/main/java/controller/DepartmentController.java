package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import entity.Department;
import service.DepartmentService;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/{id}")
    public Object getDepartment(@PathVariable Long id) {
        return departmentService.getDepartmentById(id).orElseThrow(() -> new RuntimeException("Department not found"));
    }

    @PostMapping
    public Department createDepartment(@RequestBody Department department) {
        return (Department) departmentService.saveDepartment(department);
    }

    @PutMapping("/{id}")
    public Department updateDepartment(@PathVariable Long id, @RequestBody Department department) {
        return (Department) departmentService.updateDepartment(id, department);
    }

    @DeleteMapping("/{id}")
    public void deleteDepartment(@PathVariable Long id) {
        departmentService.deleteDepartment(id);
    }
}
