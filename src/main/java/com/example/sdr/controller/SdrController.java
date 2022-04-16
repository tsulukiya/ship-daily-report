package com.example.sdr.controller;

import com.example.sdr.models.ShipDailyReport;
import com.example.sdr.repository.SdrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class SdrController {
    private SdrRepository sdrRepository;

    @Autowired
    public SdrController(SdrRepository sdrRepository) {
        this.sdrRepository = sdrRepository;
    }

    @GetMapping("/main")
    public String registration(){
        return "main";
    }


    @GetMapping("/sdr")
    public String add(){
        return "sdr";
    }

    /**
     * Общее описание
     *
     * @param dateShipDailyReport значение параметра
     * @param positionGps
     * @param presentSpeed
     * @param averageSpeed
     * @param course
     * @param vesselOperationMode
     * @param engineOperationMode
     * @param gasOilConsumptionPerDay
     * @param lubricantOilConsumptionPerDay
     * @param gasOilRemainOnBoard
     * @param lubricantOilRemainOnBoard
     * @param remarks
     * @return что возвращает?
     */

    @PostMapping("/sdr")
    public String save(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateShipDailyReport,
                       @RequestParam String positionGps,
                       @RequestParam Double presentSpeed,
                       @RequestParam Double averageSpeed,
                       @RequestParam Integer course,
                       @RequestParam String vesselOperationMode,
                       @RequestParam String engineOperationMode,
                       @RequestParam Double gasOilConsumptionPerDay,
                       @RequestParam Double lubricantOilConsumptionPerDay,
                       @RequestParam Double gasOilRemainOnBoard,
                       @RequestParam Double lubricantOilRemainOnBoard,
                       @RequestParam String remarks) {
        ShipDailyReport shipDailyReport = new ShipDailyReport();
        shipDailyReport.setDateShipDailyReport(dateShipDailyReport);
        shipDailyReport.setPositionGps(positionGps);
        shipDailyReport.setPresentSpeed(presentSpeed);
        shipDailyReport.setAverageSpeed(averageSpeed);
        shipDailyReport.setCourse(course);
        shipDailyReport.setVesselOperationMode(vesselOperationMode);
        shipDailyReport.setEngineOperationMode(engineOperationMode);
        shipDailyReport.setGasOilConsumptionPerDay(gasOilConsumptionPerDay);
        shipDailyReport.setLubricantOilConsumptionPerDay(lubricantOilConsumptionPerDay);
        shipDailyReport.setGasOilRemainOnBoard(gasOilRemainOnBoard);
        shipDailyReport.setLubricantOilRemainOnBoard(lubricantOilRemainOnBoard);
        shipDailyReport.setRemarks(remarks);
        sdrRepository.save(shipDailyReport);
        return "sdr";
    }


}