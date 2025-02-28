package com.example.aml.service;

import com.example.aml.model.RiskScoreResponse;
import com.example.aml.model.TransactionRequest;
import com.example.aml.util.RiskScoringModel;
import org.springframework.stereotype.Service;

@Service
public class RiskScoringService {
    public RiskScoreResponse calculateRiskScore(TransactionRequest transaction) {
        double riskScore = RiskScoringModel.computeRiskScore(transaction);
        String riskLevel = riskScore > 75 ? "High" : riskScore > 40 ? "Medium" : "Low";
        return new RiskScoreResponse(transaction.getTransactionId(), riskScore, riskLevel);
    }
}