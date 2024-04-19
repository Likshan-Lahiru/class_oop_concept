package ijse.lk;

public class Main {
    public static void main(String[] args) {

           Student gayathmi  = new Student();
           gayathmi.fullName = "Gayathmi ...... see more";
           gayathmi.age = 21;
           gayathmi.canWritten();
           gayathmi.canPainting();

           System.out.println(gayathmi.fullName);
           System.out.println(gayathmi.age);

           Student mahindha = new Student();
           mahindha.fullName = "Mahindha Thenakoon";
           mahindha.age = 65;
           mahindha.canWritten();
           mahindha.canPainting();

           System.out.println(mahindha.fullName);
           System.out.println(mahindha.age);






    }
}