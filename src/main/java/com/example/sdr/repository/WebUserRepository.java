package com.example.sdr.repository;

import com.example.sdr.models.WebUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebUserRepository extends CrudRepository<WebUser, Long> {
}
