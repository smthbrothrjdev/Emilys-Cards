package com.emily.server;

import org.springframework.stereotype.Component;

@Component
public class FlashCardDTO {

    private String front;
    private String back;


    public String getFront() {
        return front;
    }

    public void setFront(String front) {
        this.front = front;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }
}
