package ua.smartsub.smartsub.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ua.smartsub.smartsub.entity.Role;

public interface RoleDao  extends JpaRepository<Role,Integer> {

    @Query("select r from Role r where r.name=:name")
    Role findByName(String name);
}
