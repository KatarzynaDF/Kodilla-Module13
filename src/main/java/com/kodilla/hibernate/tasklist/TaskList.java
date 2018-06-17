package com.kodilla.hibernate.tasklist;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name="TaskList")
public class TaskList<T> {
    private int id;
    private String listName;
    private String description;

    public TaskList(){

    }

    public TaskList(int id, String listName, String description) {
        this.id = id;
        this.listName = listName;
        this.description = description;
    }
    @Id
    @GeneratedValue
    @Column(name="ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name="LIST NAME")
    public String getListName() {
        return listName;
    }

    @Column(name="DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
