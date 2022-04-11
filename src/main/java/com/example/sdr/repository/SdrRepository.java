package com.example.sdr.repository;

import com.example.sdr.models.ShipDailyReport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SdrRepository extends CrudRepository<ShipDailyReport, Long> {
}
