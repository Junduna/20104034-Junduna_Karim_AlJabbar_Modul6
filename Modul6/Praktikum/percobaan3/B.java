package Modul6.Praktikum.percobaan3;

public class B extends A{
    public int x, y, z;
    public void getJumlah(){
        System.out.println("Jumlah"+(x+y+z));
        super.setX(x);
        super.setY(y);
    }
    public void setZ(int z){
        this.z = z;
    }
}
