import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(10);
    }

    @Test
    public void hasSheets(){
        assertEquals(10, printer.getSheetsLeft());
    }

    @Test
    public void canPrintOneCopy(){
        printer.print(5, 1);
        assertEquals(5, printer.getSheetsLeft());
    }

    @Test
    public void canPrintTwoCopies(){
        printer.print(2, 2);
        assertEquals(6, printer.getSheetsLeft());
    }
}
