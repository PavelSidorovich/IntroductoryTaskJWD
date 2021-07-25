package com.epam.jwd.model;

public class InvestmentAgreement {
    private String investorName;
    private double interestRate;
    private double investments;

    public InvestmentAgreement(String investorName, double interestRate, double investments) {
        this.investorName = investorName;
        this.interestRate = interestRate;
        this.investments = investments;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String toString() {
        return "InvestmentAgreement{" +
               "investorName='" + investorName + '\'' +
               ", interestRate=" + interestRate +
               ", investments=" + investments +
               '}';
    }
}
