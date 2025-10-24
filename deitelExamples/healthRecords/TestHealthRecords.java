/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthRecords;

/**
 *
 * @author arif
 */

//import java.util.Scanner;

public class TestHealthRecords {
    
    static HealthRecord generateRecord(String name, String lastName, int age, 
            double weight, double height) {
        Person person = new Person(name, lastName, age);
        //HealthRecord record = new HealthRecord(person, weight, height);
        return new HealthRecord(person, weight, height);    
    }
    
    public static void main (String[] args) {
        HealthRecord newRecord = generateRecord("Ahmet", "Mehmetoglu", 45, 200, 72);
        System.out.println(newRecord);
    }
 }
