package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {


    private SalariedEmployee emp;
    @Before
    public void setUp()  {
       emp = new SalariedEmployee("Logan", Date.valueOf("2020-02-02") ,1250.0);
    }

    @Test
    public void testPay() {
        assertEquals(875.0, emp.pay() , .001); //rate * hours
    }

    @Test
    public void testPayTaxes() {
      assertEquals(375.0, emp.payTaxes(), .001); //0.3*salary

    }
}