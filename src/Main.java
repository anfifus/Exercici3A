import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	   String name = createName();
       String surname = createSurname();
       String surnameINV = changeOrder(surname);
       fuseString(name,surnameINV);

    }

    private static void fuseString(String name, String surnameINV) {
        String newName = name.concat(surnameINV);
        System.out.println("New name: "+newName);
    }

    private static String changeOrder(String surname) {
        String surnameINV = "";
        StringBuilder buildSurnameINV = new StringBuilder();
        char[] surnameCH = new char[surname.length()];
        for (int contInverter = 1;contInverter <= surname.length();contInverter++)
        {

            surnameINV += surname.charAt(surname.length()-contInverter);
            /*surnameCH[cont] = surname.charAt(surname.length()-contInverter);
            if(contInverter == (surname.length()-1)) {
                buildSurnameINV.append(surnameINV).append(surnameCH);
                System.out.println("El apellido invertido es "+surnameINV);
            }*/
        }
        return surnameINV;
    }

    private static String createSurname() {
        System.out.println("Write the surname: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static String createName() {
        System.out.println("Write the name: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
