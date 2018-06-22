package com.kodilla.hibernate.tasklist.dao;

package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.dao.TaskListDao;
import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest


public class IvoiceDaoTestSuite {
    @Autowired

    private IvoiceDaoTestSuite ivoiceDaoTestSuite;

    //Given
    Invoice invoice = new Invoice(3,"something", List<Item> items);
        ivoiceDaoTestSuite.save(invoice);
    String product= invoice.getProduct();

    //When
    List<Item> items = ivoiceDaoTestSuite.findInvoiceById(listName);

    //Then

    //TaskList findTheList = taskListDao.findByListName(listName);
        Assert.assertEquals(1, items.size());

    // //CleanUp
    // taskListDao.delete(Integer.valueOf(listName));
}

}
