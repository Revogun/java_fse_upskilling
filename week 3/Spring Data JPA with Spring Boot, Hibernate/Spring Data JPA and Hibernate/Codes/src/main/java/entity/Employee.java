package entity;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Employee {

    private String name;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    @CreatedBy
    private String createdBy;

    @LastModifiedBy
    private String modifiedBy;
    private String email;
    private String department;

    public String getName() {
        return name;
    }
    public String getEmail() {
        return this.email;
    }
    public String getDepartment() {
    return this.department;
}

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setDepartment(String department) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
