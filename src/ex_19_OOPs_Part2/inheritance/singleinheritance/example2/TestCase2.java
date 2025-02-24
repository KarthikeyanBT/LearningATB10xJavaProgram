package ex_19_OOPs_Part2.inheritance.singleinheritance.example2;

public class TestCase2 extends CommonTOAllTest {
    void runningtheTC2()
    {
        startBrowser();
        System.out.println("Running the TC 2");
        closeBrowser();
        readExcelFile();
        readDataBaseFile();
    }
}
