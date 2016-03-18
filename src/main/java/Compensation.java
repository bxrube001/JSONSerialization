/**
 * Created by brubert on 3/18/16.
 */
public class Compensation {
    private char currency;
    private long salary;

    public void setCurrency(char currency) {
        this.currency = currency;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    public char getCurrency(){
        return this.currency;
    }
    public long getSalary(){
        return this.salary;
    }
    @Override
    public String toString() {
        return String.format("%s %s", currency, salary);
    }
}
