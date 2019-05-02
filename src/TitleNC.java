public class TitleNC {
    String title;
    Column column;
    public TitleNC(String title) {
        this.title = title;
        this.column = new Column();
    }
    public void insert(Cell cell) {
        this.column.insert(cell);
    }
    public Column get() {
        return this.column;
    }
    public String getTitle() {
        return title;
    }
}
