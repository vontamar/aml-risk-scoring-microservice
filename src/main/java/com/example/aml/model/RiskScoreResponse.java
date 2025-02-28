package com.example.aml.model;

public class RiskScoreResponse {

    private String transactionId;
    private double riskScore;
    private String riskLevel;
    public RiskScoreResponse(String transactionId, double riskScore, String riskLevel) {
        this.transactionId = transactionId;
        this.riskScore = riskScore;
        this.riskLevel = riskLevel;
    }
    // Getters and Setters
}
