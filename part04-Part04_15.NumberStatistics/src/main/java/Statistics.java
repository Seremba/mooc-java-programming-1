
public class Statistics {

    private int count;
    private int total;

    public Statistics() {
        this.count = 0;
        this.total = 0;
    }

    public void addNumber(int number) {
        this.total = this.total + 1;
        this.count = this.count + number;
    }

    public int getCount() {
        return total;
    }

    public int sum() {
        return count;
    }

    public double average() {
        if(sum() == 0) {
            return 0;
        }
        double avg = (double) sum() / getCount();
        return avg;
    }
}
