package org.example;

import java.time.LocalDate;

public class PensionPlan {
    private String planReferenceNumber;
    private LocalDate enrollmentDate;
    private double monthlyContributions;

    public PensionPlan(String planReferenceNumber, LocalDate enrollmentDate, double monthlyContributions) {
        this.planReferenceNumber = planReferenceNumber;
        this.enrollmentDate = enrollmentDate;
        this.monthlyContributions = monthlyContributions;
    }

    public String getPlanReferenceNumber() {
        return planReferenceNumber;
    }

    public void setPlanReferenceNumber(String planReferenceNumber) {
        this.planReferenceNumber = planReferenceNumber;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public double getMonthlyContributions() {
        return monthlyContributions;
    }

    public void setMonthlyContributions(double monthlyContributions) {
        this.monthlyContributions = monthlyContributions;
    }

    public String toJson(){
        return String.format("{ \"planReferenceNumber\":%s, \"enrollmentDate\":%s, \"monthlyContributions\":%.2f }", this.planReferenceNumber, this.enrollmentDate, this.monthlyContributions);
    }
}
