package org.codeless.core.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Role {

    private @Id
    @GeneratedValue
    Long id;
    private String roleName;
    private String description;
    private boolean isActive;

    public Role(String roleName, String description, boolean isActive) {
        this.roleName = roleName;
        this.description = description;
        this.isActive = isActive;
    }

}
