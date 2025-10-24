/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthRecords;

/**
 *
 * @author arif
 */
public class Person {
    
   private final String name;
   private final String lastName;
   private int age;
   
   public Person(String name, String lastName, int age) {
       this.name = name;
       this.lastName = lastName;
       this.age = age;
   }
   
   public String getName () {
       return name;
   }
   
   public String getLastName() {
       return lastName;       
   }
   
   public int getAge() {
       return age;
   }
   
   @Override
   public String toString() {
       return String.format("%nName: %s%nLast Name: %s%nAge: %d%n", name, 
               lastName, age);               
   }
    
}
