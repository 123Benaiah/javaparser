package com.example;
public  class TestMian{
 public static void main(String args[]){
 PatientVital patient = new PatientVital(12.0,35.5,3);
System.out.println(patient.toString());
}
}

//add the main class
class PatientVital {
    private double bloodPressure;
    private double temperature;
    private int pulse;

    public PatientVital(double bloodPressure, double temperature, int pulse) {
        this.bloodPressure = bloodPressure;
        this.temperature = temperature;
        this.pulse = pulse;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    @Override
    public String toString() {
        return "PatientVital \n{" +
                "bloodPressure=" + bloodPressure +
                ", \n temperature=" + temperature +
                ",\n pulse=" + pulse +
                '}';
    }
}
