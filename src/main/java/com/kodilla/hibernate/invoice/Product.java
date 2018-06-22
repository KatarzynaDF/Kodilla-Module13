package com.kodilla.hibernate.invoice;

import javax.persistence.*;

@Entity
@Table(name = "Product")

public class Product {
    private int id;
    private String name;


    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Product() {
    }
    @OneToMany
            (
                    targetEntity = Item.class,
                    mappedBy = "product",
                    cascade = CascadeType.ALL,
                    fetch = FetchType.LAZY
            )
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name="NAME")
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
