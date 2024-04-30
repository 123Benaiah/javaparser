package com.example;

class PatientVitals {

    // Fields to store patient information
    private String name;
    private double bloodPressureSystolic;
    private double bloodPressureDiastolic;
    private double temperature;
    private int pulseRate;
    private int respirationRate;

    // Constructor to initialize patient vitals
    public PatientVitals(String name, double bloodPressureSystolic, double bloodPressureDiastolic,
                         double temperature, int pulseRate, int respirationRate) {
        this.name = name;
        this.bloodPressureSystolic = bloodPressureSystolic;
        this.bloodPressureDiastolic = bloodPressureDiastolic;
        this.temperature = temperature;
        this.pulseRate = pulseRate;
        this.respirationRate = respirationRate;
    }

    // Getter and setter methods for accessing and modifying fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBloodPressureSystolic() {
        return bloodPressureSystolic;
    }

    public void setBloodPressureSystolic(double bloodPressureSystolic) {
        this.bloodPressureSystolic = bloodPressureSystolic;
    }

    public double getBloodPressureDiastolic() {
        return bloodPressureDiastolic;
    }

    public void setBloodPressureDiastolic(double bloodPressureDiastolic) {
        this.bloodPressureDiastolic = bloodPressureDiastolic;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }

    public int getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(int respirationRate) {
        this.respirationRate = respirationRate;
    }

    // Method to format blood pressure as a string
    public String getBloodPressureString() {
        return bloodPressureSystolic + "/" + bloodPressureDiastolic + " mmHg";
    }

    // Method to print patient vitals
    public void printVitals() {
        System.out.println("Patient Name: " + name);
        System.out.println("Blood Pressure: " + getBloodPressureString());
        System.out.println("Temperature: " + temperature + " °C");
        System.out.println("Pulse Rate: " + pulseRate + " bpm");
        System.out.println("Respiration Rate: " + respirationRate + " breaths per minute");
    }
}
    //main class
public class PatientVitals1{
    // Main method
    public static void main(String[] args) {
        // usage
        PatientVitals patient = new PatientVitals("Lushomo Kulungi", 120.0, 80.0, 37.5, 70, 18);
        patient.printVitals();
    }
}
