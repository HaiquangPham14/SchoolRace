package SchoolCompetition.handle;

import SchoolCompetition.enums.ErrorMessage;

public class UnauthorizeException extends RuntimeException {
    private String message;

    public UnauthorizeException(String message) {
        super(message);
        this.message = message;
    }

    public UnauthorizeException(ErrorMessage message) {
        super(message.getMessage());
        this.message = message.getMessage();
    }

}
