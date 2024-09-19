package org.DesignPattern.Creat.Prototype;


// A prototype class for message object,which can be cloned to create new message object.
public class Message {
    private String sender;
    private String receiver;
    private String content;

    public Message clone() {
        Message message = new Message();
        message.sender = this.sender;
        message.receiver = this.receiver;
        message.content = this.content;
        return message;
    }
}
