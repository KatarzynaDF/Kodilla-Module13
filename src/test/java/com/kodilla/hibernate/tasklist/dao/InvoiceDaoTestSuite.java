package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.dao.InvoiceDao;
import com.kodilla.hibernate.dao.ItemDao;
import com.kodilla.hibernate.dao.ProductDao;
import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest


public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given

        Item item1 = new Item(new BigDecimal("133334"), 23, new BigDecimal("94940"));
        Item item2 = new Item(new BigDecimal("1334545"), 63, new BigDecimal("5955"));
        Product product = new Product("product1");
        Product product2 = new Product("product2");

        item1.setProduct(product);
        item2.setProduct(product2);
        Invoice invoice = new Invoice("Invoice1");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);


        //When

        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.delete(id);

    }
}
