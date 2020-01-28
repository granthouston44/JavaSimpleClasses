public class Printer {

    private int sheetsLeft;

    public Printer(int sheetsLeft) {
        this.sheetsLeft = sheetsLeft;
    }

    public int getSheetsLeft(){
        return sheetsLeft;
    }

    public int print(int pages, int copies) {

        int totalPages = pages * copies;
        for (int i = 0; i < totalPages; i++){
            if(sheetsLeft != 0) {
                sheetsLeft -= 1;
            }
        }
        return sheetsLeft;
    }

    }

