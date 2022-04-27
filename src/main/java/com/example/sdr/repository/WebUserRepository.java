package com.example.sdr.repository;

import com.example.sdr.models.WebUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebUserRepository extends JpaRepository<WebUser, Long> {
    WebUser findByEmail(String email);
}
