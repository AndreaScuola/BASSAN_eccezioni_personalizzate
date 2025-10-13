import java.util.ArrayList;

public class Data {
    int dd;
    int mm;
    int yyyy;

    public Data(){
        dd = 1;
        mm = 1;
        yyyy = 2000;
    }

    public Data(int dd, int mm, int yyyy) throws DateException {
        try{
            this.dd = dd;
            this.mm = mm;
            this.yyyy = yyyy;

            Calendario.validDate(this);
        } catch(DateException e){
            setData(01, 01, 2000);
            throw e;
        }
    }

    public int distanzaDate(Data other) throws DateException{

        int giorniEMesi1 = dd + Calendario.getGiorniFinoAMese(mm);
        int giorniEMesi2 = other.dd + Calendario.getGiorniFinoAMese(other.mm);
        int dAnni = (yyyy - other.yyyy)*365;
        return Math.abs(giorniEMesi1 - giorniEMesi2 + dAnni);
    }

    public void setData(int dd, int mm, int yyyy) throws DateException {
        try{
            this.dd = dd;
            this.mm = mm;
            this.yyyy = yyyy;

            Calendario.validDate(this);
        } catch(DateException e){
            setData(01, 01, 2000);
            throw e;
        }
    }

    public String getData() {
        return dd + "/" + mm + "/" + yyyy;
    }
}
