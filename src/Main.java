import java.util.ArrayList;

// Some test data

public class Main {

    public static void main(String[] args) {
        Table t = new Table();
        t.addC("Name");
        t.addC("Num");
        ArrayList a = new ArrayList();
        a.add("M");
        a.add("1");
        t.addRow(a);
        
        a.clear()
        a.add("W");
        a.add("2");
        t.addRow(a);
        
        a.clear()
        a.add("Q");
        a.add("2");
        t.addRow(a);
        t.search("Num", "2");
    }
}
