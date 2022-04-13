package com.openclassrooms.mediscreen_report.controller;

import com.openclassrooms.mediscreen_report.dto.ReportDTO;
import com.openclassrooms.mediscreen_report.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reportPatient")
@RequiredArgsConstructor
public class ReportController {

    private final ReportService reportService;

    @GetMapping("/")
    public ReportDTO getReport(@RequestParam("patientId") Long patientId) {
        return reportService.getReportOfRisk(patientId);
    }
}
