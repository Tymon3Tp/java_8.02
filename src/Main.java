import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Koszulka> koszulki =new ArrayList<>();
        koszulki.add((new Koszulka("Adidas",Rozmiar.S));
        koszulki.add((new Koszulka("Nike",Rozmiar.XS));

        Scanner scanner new Scanner(System.in);
        System.out.println("Podaj marke");
        String marka = scanner.nextLine();
        System.out.println("Podaj rozmiar(XS,S,M,L,XL)");
        String rozmiar = scanner.next();
        Rozmiar rozmiarEnum;
        switch (rozmiar){
            case "XS":
                rozmiarEnum = Rozmiar.XS;
                break;
            case "S":
                rozmiarEnum = Rozmiar.S;
                break;
            case "M":
                rozmiarEnum = Rozmiar.M;
                break;
            case "L":
                rozmiarEnum = Rozmiar.L;
                break;
            case "XL":
                rozmiarEnum = Rozmiar.XL;
                break;
        }
        koszulki.add(new Koszulka(marka,rozmiarEnum));
        System.out.println(koszulki);
    }
}