public class Printer {

    private int sheetsLeft;

    public Printer(int sheetsLeft) {
        this.sheetsLeft = sheetsLeft;
    }

    public int getSheetsLeft(){
        return sheetsLeft;
    }

    public int print(int pages, int copies) {




        do {
            return sheetsLeft -= pages * copies;
        }
        while (sheetsLeft >=1);


    }
}
