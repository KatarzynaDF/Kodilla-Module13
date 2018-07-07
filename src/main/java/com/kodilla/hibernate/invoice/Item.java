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
    private Invoice invoice;

    public Item() {
    }

    public Item(int id, BigDecimal price, int quantity, BigDecimal value) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }

    public int getId() {
        return id;
    }


    @ManyToOne
    @JoinColumn(name = "Items_ID")
    public Product getProduct() {
        return product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getValue() {
        return value;
    }

   @ManyToOne
    @JoinColumn(name = "Invoice_ID")
    public Invoice getInvoice() {
        return invoice;
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

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
