package school.fees;

public class Payment {
    private String paymentId;
    private String studentId;
    private double amount;
    private String status;
    
    public Payment(String paymentId, String studentId, double amount, String status) {
        this.paymentId = paymentId;
        this.studentId = studentId;
        this.amount = amount;
        this.status = status;
        
    }

    public String getPaymentId() {
        return paymentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public String toFileLine() {
        return "PaymentID"+paymentId + "," +"StudentId"+ studentId + "," +"Amount"+ amount + "," + "Status" + status;
    }

    public String toDisplayString() {
        return "Payment ID: " + paymentId
                + " | Student ID: " + studentId
                + " | Amount: " + amount
                + " | Status: " + status;
    }
}
