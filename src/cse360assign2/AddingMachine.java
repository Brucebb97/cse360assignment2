package cse360assign2;
/*Liangbin Gao*/
/*Studen ID : 1213031025*/


public class AddingMachine {

    private int total = 0;
    private String processString = "0";

    public AddingMachine() {

    }

    public int getTotal() {
        return this.total;
    }

    public void add(int value) {
        this.total += value;
        this.processString += "+" + value;
    }

    public void subtract(int value) {
        this.total -= value;
        this.processString += "-" + value;
    }

    public String toString() {
        return this.processString;
    }

    public void clear() {
        this.total = 0;
        this.processString = "0";
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getProcessString() {
        return processString;
    }

    public void setProcessString(String processString) {
        this.processString = processString;
    }

    public static void main(String[] args){
        AddingMachine myCalculator = new AddingMachine();
        myCalculator.add (4);
        myCalculator.subtract (2);
        myCalculator.add(5);
        System.out.println(myCalculator);
        System.out.println(myCalculator.getTotal());
    }
}
