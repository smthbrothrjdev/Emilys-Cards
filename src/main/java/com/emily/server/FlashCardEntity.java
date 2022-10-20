package com.emily.server;

import javax.persistence.*;

@Entity
public class FlashCardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String front;
    private String back;
    private Boolean lastTimeCorrect;
    private Integer timesCorrect;
    private Integer totalViews;

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

    public Boolean getLastTimeCorrect() {
        return lastTimeCorrect;
    }

    public void setLastTimeCorrect(Boolean lastTimeCorrect) {
        this.lastTimeCorrect = lastTimeCorrect;
    }

    public Integer getTimesCorrect() {
        return timesCorrect;
    }

    public void setTimesCorrect(Integer timesCorrect) {
        this.timesCorrect = timesCorrect;
    }

    public Integer getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(Integer totalViews) {
        this.totalViews = totalViews;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
