public class Koszulka {
    private String producent;
    private Rozmiar rozmiar;

    public Koszulka(String producent, Rozmiar rozmiar) {
        this.producent = producent;
        this.rozmiar = rozmiar;
    }

    @Override
    public String toString() {
       return String.format("Koszilka %s, rozmiar %s",
               producent,rozmiar);
    }
}
