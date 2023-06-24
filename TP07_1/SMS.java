package TP07_1;

public class SMS {
    String subject;
    String fromPhoneNumber;
    String receiverNumber;
    String type;
    String content;
    String status;

    public SMS(String subject, String fromPhoneNumber, String receiverNumber, String type, String content,
            String status) {
        this.subject = subject;
        this.fromPhoneNumber = fromPhoneNumber;
        this.receiverNumber = receiverNumber;
        this.type = type;
        this.content = content;
        this.status = status;
    }

    public SMS(String subject, String fromPhoneNumber, String receiverNumber, String content) {
        this(subject, fromPhoneNumber, receiverNumber, "Text", content, "new");
    }

    public SMS(String fromPhoneNumber, String receiverNumber, String type, String content, String status) {
        this("", fromPhoneNumber, receiverNumber, type, content, status);
    }
}