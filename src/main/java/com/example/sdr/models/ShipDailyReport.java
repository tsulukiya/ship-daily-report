package com.example.sdr.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sdr_form")
public class ShipDailyReport {
    private Long id;
    private Date dateShipDailyReport;
    private String positionGps;
    private Double presentSpeed;
    private Double averageSpeed;
    private Integer course;
    private String vesselOperationMode;
    private String engineOperationMode;
    private Double gasOilConsumptionPerDay;
    private Double lubricantOilConsumptionPerDay;
    private Double gasOilRemainOnBoard;
    private Double lubricantOilRemainOnBoard;
    private String remarks;

    public ShipDailyReport() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sdr_form_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "date_sdr")
    public Date getDateShipDailyReport() {
        return dateShipDailyReport;
    }

    public void setDateShipDailyReport(Date dateShipDailyReport) {
        this.dateShipDailyReport = dateShipDailyReport;
    }

    @Column(name = "position_gps")
    public String getPositionGps() {
        return positionGps;
    }

    public void setPositionGps(String positionGps) {
        this.positionGps = positionGps;
    }

    @Column(name = "present_speed")
    public Double getPresentSpeed() {
        return presentSpeed;
    }

    public void setPresentSpeed(Double presentSpeed) {
        this.presentSpeed = presentSpeed;
    }

    @Column(name = "avg_speed")
    public Double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(Double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    @Column(name = "course")
    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    @Column(name = "vessel_operation_mode")
    public String getVesselOperationMode() {
        return vesselOperationMode;
    }

    public void setVesselOperationMode(String vesselOperationMode) {
        this.vesselOperationMode = vesselOperationMode;
    }

    @Column(name = "engine_operation_mode")
    public String getEngineOperationMode() {
        return engineOperationMode;
    }

    public void setEngineOperationMode(String engineOperationMode) {
        this.engineOperationMode = engineOperationMode;
    }

    @Column(name = "go_consumption_per_day")
    public Double getGasOilConsumptionPerDay() {
        return gasOilConsumptionPerDay;
    }

    public void setGasOilConsumptionPerDay(Double gasOilConsumptionPerDay) {
        this.gasOilConsumptionPerDay = gasOilConsumptionPerDay;
    }

    @Column(name = "lo_consumption_per_day")
    public Double getLubricantOilConsumptionPerDay() {
        return lubricantOilConsumptionPerDay;
    }

    public void setLubricantOilConsumptionPerDay(Double lubricantOilConsumptionPerDay) {
        this.lubricantOilConsumptionPerDay = lubricantOilConsumptionPerDay;
    }

    @Column(name = "go_remain_on_board")
    public Double getGasOilRemainOnBoard() {
        return gasOilRemainOnBoard;
    }

    public void setGasOilRemainOnBoard(Double gasOilRemainOnBoard) {
        this.gasOilRemainOnBoard = gasOilRemainOnBoard;
    }

    @Column(name = "lo_remain_on_board")
    public Double getLubricantOilRemainOnBoard() {
        return lubricantOilRemainOnBoard;
    }

    public void setLubricantOilRemainOnBoard(Double lubricantOilRemainOnBoard) {
        this.lubricantOilRemainOnBoard = lubricantOilRemainOnBoard;
    }

    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}

