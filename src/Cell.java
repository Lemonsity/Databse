public class Cell {
    private Object value;
    private Cell prev;
    private Cell next;
    public Cell(){
        this.value = null;
        this.prev = null;
        this.next = null;
    }
    public Cell(Object value){
        this.value = value;
        this.prev = null;
        this.next = null;
    }
    public Cell(Object value, Cell prev, Cell next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
    public Cell(Object value, Cell cell) {
        this.value = value;
        this.prev = cell;
        this.next = null;
    }

    public void setValue(Object value) {
        this.value = value;
    }
    public void setPrev(Cell c) {
        this.prev = c;
    }
    public void setNext(Cell c) {
        this.next = c;
    }
    public Object getValue() {
        return value;
    }
    public Cell getPrev() {
        return prev;
    }
    public Cell getNext() {
        return next;
    }


    public void print() { // back track to first in the row
        if (this.prev != null)
            prev.print();
        else
            this.actualPrint();
    }
    public void actualPrint() { // print until last in the row
        System.out.print(this.value + " ");
        if (this.next != null)
            next.actualPrint();
    }
}
