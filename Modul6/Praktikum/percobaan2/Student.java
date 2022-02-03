package Modul6.Praktikum.percobaan2;

public class Student extends Person{
    public Student(){
        super ("Ini nama","Ini Alamat");
        // super();
        super.name = "Ini nama";
        System.out.println("Inside Student : Constructor");
    }
}
