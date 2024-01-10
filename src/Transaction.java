import java.sql.Date;
import java.time.LocalDate;

public class Transaction {
    Date data;
    String type;
    double amount;

    public Transaction(Date data, String type, double amount) {
        this.data = data;
        this.type = type;
        this.amount = amount;
    }

    public Transaction(LocalDate now, String type2, double amount2) {
    }

    public Date getData() {
        return data;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

}
