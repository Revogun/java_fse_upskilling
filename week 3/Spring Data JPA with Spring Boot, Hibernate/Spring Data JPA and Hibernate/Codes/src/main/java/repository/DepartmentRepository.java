package repository;

// TODO: Update the import below to match the actual package of Department class
// Example: import your.actual.package.Department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import entity.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    // You can add custom query methods here if needed
}
