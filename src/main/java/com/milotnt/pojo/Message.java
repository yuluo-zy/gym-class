package com.milotnt.pojo;

public class Message {

        private Integer messageId;
        private String messageInfo;

    public Message(Integer messageId, String messageInfo) {
        this.messageId = messageId;
        this.messageInfo = messageInfo;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getMessageInfo() {
        return messageInfo;
    }

    public void setMessageInfo(String messageInfo) {
        this.messageInfo = messageInfo;
    }
}
