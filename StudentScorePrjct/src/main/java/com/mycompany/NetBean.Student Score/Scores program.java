package com.mycompany.netbeanprjct1;


import java.util.Scanner; 
public class  NETBEANprjct1{

    public static void main(String[] args) {
        Scanner Scm = new Scanner(System.in);
        System.out.println("Please enter your Name");
                                                                                             String nme = Scm.nextLine();
      System.out.println("Please enter your admission number");
                                                                                              String adm = Scm.nextLine();
      System.out.println("ENTER YOUR RESPECTIVE SCORES");
                                                                                            System.out.println("Mathematics");
      int math = Scm.nextInt();
                                                                                               System.out.println("English");
      int eng = Scm.nextInt();
                                                              System.out.println("Kiswahili");
      int kis = Scm.nextInt();
      System.out.println("Science");
      int sci = Scm.nextInt();
      System.out.println("Social studies");
      int std = Scm.nextInt();
      
      int ttl = math + eng + kis+ sci + std;
      int avr = ttl/5;
      
      String grade;
      if(avr >=85){
          grade = "A";
      }else if(avr >= 75){
        grade = "B";
      }else if(avr >= 65){
      grade = "C";
    }else if(avr >= 55){
    grade = "D";
    }else{
        grade = "FAIL";
          }
      
      System.out.println("Name: " + nme);
      System.out.println("Adm No. :" + adm);
      System.out.println("Avarage Score:" + avr);
      System.out.println("Your grade :" + grade);
      
  
    }
}
