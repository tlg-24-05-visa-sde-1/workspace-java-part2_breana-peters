package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class HourlyEmployeeTest {
//buisness objects under test
    //declare it at the top
 private HourlyEmployee emp;



    @Before
    public void setUp() {
        emp = new HourlyEmployee("Amelia", Date.valueOf("2010-10-10"), 25.0, 35.0); //Initialize it here
    }

//Test here
        @Test
        public void testPayTaxes() {
            assertEquals(218.75, emp.payTaxes(), 0.001);
        }

    }
