import org.junit.Before;

public class PrinterTest {
    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(10);
    }
}
