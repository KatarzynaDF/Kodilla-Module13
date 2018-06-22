package com.kodilla.hibernate.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InvoiceDao extends CrudRepository<Invoice, Integer> {
    List<Item> findInvoiceById(int id);

}
