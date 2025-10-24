/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthRecords;

/**
 *
 * @author arif
 */
public class HealthRecord {
    
    private final Person person;
    private double weight;
    private double height;
    
    public HealthRecord(Person person, double weight, double height) {
        this.person = person;
        this.weight = weight;
        this.height = height;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getBmi() {
        return 30;
    }
    
    public double[] getHeartRange() {
        return new double[] {50, 130};
    }
    
    @Override
    public String toString() {
        return String.format("%sWeight: %.1f%nHeight: %.1f%nBMI: %.1f%n"
                + "Heart Range: %f - %f", person, weight, height, getBmi(), 
                getHeartRange()[0], getHeartRange()[1]);
    }
}
