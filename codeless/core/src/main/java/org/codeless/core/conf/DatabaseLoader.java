package org.codeless.core.conf;

import org.codeless.core.domain.Role;
import org.codeless.core.repo.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final RoleRepository roleRepository;

    @Autowired
    public DatabaseLoader(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.roleRepository.save(new Role("Admin", "Admin Privileges", true));

    }
}
