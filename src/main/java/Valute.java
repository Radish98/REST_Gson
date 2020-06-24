public class Valute {

    String ID;

    int NumCode;

    String CharCode;

    int Nominal;

    String Name;

    double Value;

    public Valute(String ID, int numCode, String charCode, int nominal, String name, long value){
        this.ID = ID;
        this.NumCode = numCode;
        this.CharCode = charCode;
        this.Nominal = nominal;
        this.Name = name;
        this.Value = value;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setNominal(int nominal) {
        this.Nominal = nominal;
    }

    public void setNumCode(int numCode) {
        this.NumCode = numCode;
    }

    public void setValue(long value) {
        this.Value = value;
    }

    public void setCharCode(String charCode) {
        this.CharCode = charCode;
    }

    public int getNominal() {
        return Nominal;
    }

    public double getValue() {
        return Value;
    }

    public int getNumCode() {
        return NumCode;
    }

    public String getCharCode() {
        return CharCode;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }
}
