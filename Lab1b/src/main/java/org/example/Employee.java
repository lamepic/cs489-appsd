package org.example;

import java.time.LocalDate;

public class Employee {
    private long employeeId;
    private String firstName;
    private String lastName;
    private LocalDate employmentDate;
    private double yearlySalary;
    private PensionPlan pensionPlan;

    public Employee(long employeeId, String firstName, String lastName, LocalDate employmentDate, double yearlySalary, String planReferenceNumber, LocalDate enrollmentDate, Double monthlyContributions) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employmentDate = employmentDate;
        this.yearlySalary = yearlySalary;
        this.pensionPlan = planReferenceNumber == null ? null : new PensionPlan(planReferenceNumber, enrollmentDate, monthlyContributions);
    }

    public Employee(long employeeId, String firstName, String lastName, LocalDate employmentDate, double yearlySalary){
        this(employeeId, firstName, lastName, employmentDate, yearlySalary, null, null, null);
    }

    public Employee(){}

    public PensionPlan getPensionPlan() {
        return pensionPlan;
    }

    public void setPensionPlan(PensionPlan pensionPlan) {
        this.pensionPlan = pensionPlan;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public boolean isUpcomingEnrollee(){
        if(this.getPensionPlan() != null) return false;
        var now = LocalDate.now().plusMonths(1);
        var employeeDate = this.getEmploymentDate().plusYears(5);
        return now.getMonth() == employeeDate.getMonth();
    }

    public String toJson(){
        var pension = this.getPensionPlan() == null ? null : this.getPensionPlan().toJson();
        return String.format("\t{\n\t \"employeeId\":%s,\n\t \"firstName\":%s,\n\t \"lastName\":%s,\n\t \"employmentDate\":%s,\n\t \"yearlySalary\":%f,\n\t \"pensionPlan\":%s \n\t},", this.employeeId, this.firstName, this.lastName, this.employmentDate, this.yearlySalary, pension);
    }
}
