/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class namanyarahma {
    
   int personAge;

   public namanyarahma(String name) {
      // This constructor has one parameter, name.
      System.out.println("Name chosen is :" + name );
   }

   public void setAge( int age ) {
      personAge = age;
   }

   public int getAge( ) {
      System.out.println("Person's age is :" + personAge );
      return personAge;
   }

   public static void main(String []args) {
      
      namanyarahma myName = new namanyarahma( "rahma" );
      
      myName.setAge( 19 );

      myName.getAge( );
          
      System.out.println("Variable Value :" + myName.personAge );
   }
}