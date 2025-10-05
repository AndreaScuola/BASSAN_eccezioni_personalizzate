public class Calendario {
    private static final int[] giorniMese = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int getGiorniMese(int mese) {
        return giorniMese[mese - 1];
    }

    public static int getGiorniFinoAMese(int nMesi){
        int giorni = 0;

        for(int i = 0; i < nMesi - 1; i++) //-1 per non contare il mese corrente --> non è passato
            giorni += giorniMese[i];

        return giorni;
    }

    public static void validDate(Data other) throws DateException{
        if(other.dd <= 0 || other.dd > getGiorniMese(other.mm))
            throw new DateException("Giorni non validi");
        if(other.mm <= 0 || other.mm > 12)
            throw new DateException("Mesi non validi");
    }
}