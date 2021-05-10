package com.essentials.tasklistserver.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Task {
    public enum Status {
        TODO,
        IN_PROGRESS,
        COMPLETE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    private String description;
    private Status status;
    private Date targetDate;

    public Task(int id, String description, Status status, Date targetDate) {
        Id = id;
        this.description = description;
        this.status = status;
        this.targetDate = targetDate;
    }

    public Task() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }
}
