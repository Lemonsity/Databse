import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DB d = new DB();
        d.addC("Name");
        d.addC("Num");
        ArrayList a = new ArrayList();
        a.add("M");
        a.add("1");
        d.addRow(a);
        a = new ArrayList();
        a.add("W");
        a.add("2");
        //d.addRow(a);
        d.search("Num", "2");
    }
}
