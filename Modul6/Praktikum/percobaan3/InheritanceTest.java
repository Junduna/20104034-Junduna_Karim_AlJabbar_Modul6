package Modul6.Praktikum.percobaan3;

public class InheritanceTest {
    static class InheritenceTest{
        public static void main(String[] args){
            A ortu = new A();
            B anak = new B();
            System.out.println("Superclass");

            ortu.setX(10);
            ortu.setY(20);
            ortu.getNilai();
            System.out.println("Subclass");

            anak.setX(5);
            anak.setY(4);
            anak.getNilai();
            anak.setZ(50);
            anak.getJumlah();
        }
    }
}
