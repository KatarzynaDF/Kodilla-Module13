package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.dao.TaskListDao;
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


public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    private static final String DESCRIPTION = "something";
    private static final String NAME = "something";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(3,NAME, DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTasks = taskListDao.findByListName(listName);

        //Then

        //TaskList findTheList = taskListDao.findByListName(listName);
        Assert.assertEquals(1, readTasks.size());

       // //CleanUp
       // taskListDao.delete(Integer.valueOf(listName));
    }

}
