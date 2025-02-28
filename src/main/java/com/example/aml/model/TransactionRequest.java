package com.example.aml.model;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class TransactionRequest {
    private String transactionId;
    private double amount;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public String getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public int getFrequencyPerMonth() {
        return frequencyPerMonth;
    }

    public void setFrequencyPerMonth(int frequencyPerMonth) {
        this.frequencyPerMonth = frequencyPerMonth;
    }

    private String sourceAccount;
    private String destinationAccount;
    private String destinationCountry;
    private int frequencyPerMonth;
    // Getters and Setters
}
