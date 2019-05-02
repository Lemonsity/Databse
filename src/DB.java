import java.util.ArrayList;
import java.util.Collection;

public class DB {
    private ArrayList<TitleNC> list;
    public DB() {
        list = new ArrayList<>();
    }
    public void addC(String name) {
        list.add(new TitleNC(name));
    }
    public void addRow(ArrayList values) {
        ArrayList<Cell> cells = new ArrayList<>();
        for (Object v : values)
            cells.add(new Cell(v));
        for (int i = 1; i < cells.size(); i++)
            cells.get(i).setPrev(cells.get(i - 1));
        for (int i = 0; i < cells.size() - 1; i++)
            cells.get(i).setNext(cells.get(i + 1));
        for (int i = 0; i < cells.size(); i++)
            list.get(i).insert(cells.get(i));
    }
    public void search(String title, Object value) {
        for (TitleNC t : list)
            System.out.print(t.getTitle() + "\t");
        System.out.print("\n");
        boolean check = false;
        for (TitleNC t : list) {
            if (t.getTitle().equals(title)) {
                check = true;
                Column column = t.get();
                ArrayList<Cell> cells = column.get(value);
                if (cells != null) {
                    for (Cell c : t.get().get(value))
                        c.print();
                }
                else System.out.print("Cannot find such value in the column specified");
                System.out.print("\n");
                break;
            }
        }
        if (!check) System.out.print("Cannot find such column\n");
    }
}
