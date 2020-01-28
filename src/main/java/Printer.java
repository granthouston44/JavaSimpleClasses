public class Printer {

    private int sheetsLeft;

    public Printer(int sheetsLeft) {
        this.sheetsLeft = sheetsLeft;
    }

    public int getSheetsLeft(){
        return sheetsLeft;
    }

    public int print(int pages, int copies) {



        if (pages * copies >= sheetsLeft){
            return sheetsLeft = 0;
        }
        else{
           return sheetsLeft -= pages * copies;
        }

    }
}
