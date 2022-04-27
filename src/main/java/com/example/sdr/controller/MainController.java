package com.example.sdr.controller;

import com.example.sdr.models.ShipDailyReport;
import com.example.sdr.repository.SdrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {
    private SdrRepository sdrRepository;

    @Autowired
    public MainController(SdrRepository sdrRepository) {
        this.sdrRepository = sdrRepository;
    }


    @GetMapping("/")
    public String greeting() {
        return "login";
    }

    @GetMapping("main")
    public String main(Map<String, Object> model) {
        Iterable<ShipDailyReport> shipDailyReports = sdrRepository.findAll();
        for (ShipDailyReport shipDailyReport : shipDailyReports) {
            System.out.println(shipDailyReport);
        }
        System.out.println("+++++++++++++++++");
        model.put("shipDailyReports", shipDailyReports);
        return "main";
    }


    @PostMapping("sdr")
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
        return "main";
    }

    @PostMapping("filter")
    public String filter (@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date filter,
                          Map<String, Object> model) {
        List<ShipDailyReport> shipDailyReports = sdrRepository.findByDateShipDailyReport(filter);
        model.put("shipDailyReports", shipDailyReports);
        return "main";
    }
}
