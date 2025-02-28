package com.example.aml.util;

import com.example.aml.model.TransactionRequest;

public class RiskScoringModel {

    public static double computeRiskScore(TransactionRequest transaction) {
        double score = 0;
        if (transaction.getAmount() > 10000) score += 50;
        else if (transaction.getAmount() > 5000) score += 30;
        if (HighRiskCountries.isHighRisk(transaction.getDestinationCountry())) score += 25;
        if (transaction.getFrequencyPerMonth() > 10) score += 20;
        return Math.min(score, 100);
    }
}