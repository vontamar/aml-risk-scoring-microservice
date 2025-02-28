package com.example.aml.controller;

import com.example.aml.model.RiskScoreResponse;
import com.example.aml.model.TransactionRequest;
import com.example.aml.service.RiskScoringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aml")
public class AMLController {
    @Autowired
    private RiskScoringService riskScoringService;

    @PostMapping("/analyzeTransaction")
    public ResponseEntity<RiskScoreResponse> analyzeTransaction(@RequestBody TransactionRequest transactionRequest) {
        RiskScoreResponse response = riskScoringService.calculateRiskScore(transactionRequest);
        return ResponseEntity.ok(response);
    }
}