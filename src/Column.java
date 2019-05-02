import java.util.ArrayList;
import java.util.HashMap;

public class Column {
    private HashMap<Object, ArrayList<Cell>> valueMap;
    public Column(){
        valueMap = new HashMap<>();
    }
    public void insert(Cell cell) {
        if (!valueMap.containsKey(cell.getValue()))
            this.valueMap.put(cell.getValue(), new ArrayList<>());
        this.valueMap.get(cell.getValue()).add(cell);
    }
    public ArrayList<Cell> get(Object value) {
        if (!valueMap.containsKey(value))
            return null;
        return valueMap.get(value);
    }
}
