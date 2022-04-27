package com.example.sdr.repository;

import com.example.sdr.models.ShipDailyReport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface SdrRepository extends CrudRepository<ShipDailyReport, Long> {
    List<ShipDailyReport> findByDateShipDailyReport(Date dateShipDailyReport);
}
