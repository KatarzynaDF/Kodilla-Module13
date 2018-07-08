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
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest


public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    private ItemDao itemDao;
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given

        Item item1 = new Item(1, new BigDecimal("133334"), 23, new BigDecimal("94940"));
        Item item2 = new Item(2, new BigDecimal("1334545"), 63, new BigDecimal("5955"));
        Product product1 = new Product(1, "product1");
        Product product2 = new Product(2, "product2");
        Invoice invoice = new Invoice(2334, "Invoice1");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setProduct(product1);
        item2.setProduct(product2);

        //When

        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0,id);

        //CleanUp
        invoiceDao.delete(id);

    }
}
