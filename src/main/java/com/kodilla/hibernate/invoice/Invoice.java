package com.kodilla.hibernate.invoice;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "Invoice")
public class Invoice {
    private int id;
    private String number;
    private List<Item> items;

    public Invoice(int id, String number, List<Item> items) {
        this.id = id;
        this.number = number;
        this.items = items;
    }

    public Invoice(){}

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "items",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public void setItems(List<Item> items) {
        this.items = items;
    }
}
