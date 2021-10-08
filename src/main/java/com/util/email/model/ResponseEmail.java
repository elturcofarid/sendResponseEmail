package com.util.email.model;

public class ResponseEmail {
    public String To;
    public String SubmittedAt;
    public String MessageID;
    public float ErrorCode;
    public String Message;


    // Getter Methods

    public String getTo() {
        return To;
    }

    public String getSubmittedAt() {
        return SubmittedAt;
    }

    public String getMessageID() {
        return MessageID;
    }

    public float getErrorCode() {
        return ErrorCode;
    }

    public String getMessage() {
        return Message;
    }

    // Setter Methods

    public void setTo( String To ) {
        this.To = To;
    }

    public void setSubmittedAt( String SubmittedAt ) {
        this.SubmittedAt = SubmittedAt;
    }

    public void setMessageID( String MessageID ) {
        this.MessageID = MessageID;
    }

    public void setErrorCode( float ErrorCode ) {
        this.ErrorCode = ErrorCode;
    }

    public void setMessage( String Message ) {
        this.Message = Message;
    }


    @Override
    public String toString() {
        return "ResponseEmail{" +
                "To='" + To + '\'' +
                ", SubmittedAt='" + SubmittedAt + '\'' +
                ", MessageID='" + MessageID + '\'' +
                ", ErrorCode=" + ErrorCode +
                ", Message='" + Message + '\'' +
                '}';
    }
}