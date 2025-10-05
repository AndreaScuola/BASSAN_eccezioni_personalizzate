public class Main {
    public static void main(String[] args) {
        try {
            Data d1 = new Data();
            Data d2 = new Data(15, 3, 2005);
            System.out.println("Differenza fra " + d1.getData() + " e " + d2.getData() + " = " + d1.distanzaDate(d2));

            //Provo con data non valida
            try {
                Data d3 = new Data(30, 2, 2020); //Giorno non valido
            } catch (DateException e) {
                System.err.println("Eccezione catturata: " + e.getMessage());
            }

            Data d6 = new Data(1, 1, 2000);
            Data d7 = new Data(31, 12, 2000);
            System.out.println("Differenza fra " + d6.getData() + " e " + d7.getData() + " = " + d6.distanzaDate(d7));

            Data d8 = new Data(10, 5, 2000);
            Data d9 = new Data(25, 5, 2000);
            System.out.println("Differenza fra " + d8.getData() + " e " + d9.getData() + " = " + d8.distanzaDate(d9));

        } catch (DateException e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }
}
