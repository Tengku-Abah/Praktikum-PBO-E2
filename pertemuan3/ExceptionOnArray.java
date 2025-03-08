package PBO.pertemuan3;

public class ExceptionOnArray {
    public static void main(String[] args) {
        //instansiasi object array integer 
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 3;
            arrayInteger[4] = 4;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("bersihkan code plisss ");
        }
    }
}
