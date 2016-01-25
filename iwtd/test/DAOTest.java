/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import business.BO.ITduserBO;
import business.model.Tduser;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Quentin
 */
public class DAOTest {


    public DAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testDAO() {

        ApplicationContext appContext
                = new ClassPathXmlApplicationContext("spring/config/BeanIwtd.xml");

        ITduserBO userBO;
        userBO = (ITduserBO) appContext.getBean("ITduserBO");

        /**
         * insert *
         */
        Tduser user = new Tduser("test", "test", "test", "test", "test", true);
        userBO.save(user);

        /**
         * select *
         */
        Tduser user2 = userBO.findByTrackCode("1");
        System.out.println(user2);

        /**
         * update *
         */
        //stock2.setStockName("HAIO-1");
        //stockBo.update(stock2);
        /**
         * delete *
         */
        //stockBo.delete(stock2);
        System.out.println("Done");
    }
// TODO add test methods here.
// The methods must be annotated with annotation @Test. For example:
//
// @Test
// public void hello() {}
}
