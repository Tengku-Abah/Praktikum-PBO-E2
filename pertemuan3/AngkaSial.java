package PBO.pertemuan3;

public class AngkaSial {
    
    public void CobaAngka (int angka) throws AngkaSialException{
        if (angka == 23 ){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial ");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.CobaAngka(10);
            as.CobaAngka(23);
            as.CobaAngka(12);
        }catch(AngkaSialException ase){
            //method get massage telah ada pada kelas exception 
            System.out.println(ase.getMessage());
            System.out.println("hati hati dalam memasukan angka");
        }
    }
}
