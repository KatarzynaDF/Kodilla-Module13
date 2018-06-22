package com.kodilla.hibernate.invoice;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Item")
public class Item {
    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;

    public Item(int id, Product product, BigDecimal price, int quantity, BigDecimal value) {
        this.id = id;
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }

    public Item(){}

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

@ManyToOne
@JoinColumn(name="id")
    public Product getProduct() {
        return product;
    }


    @Column(name="PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @Column(name="QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    @Column(name="VALUE")
    public BigDecimal getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
