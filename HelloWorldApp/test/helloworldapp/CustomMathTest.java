/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package helloworldapp;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Student
 */
public class CustomMathTest {
    
    public CustomMathTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of sum method, of class CustomMath.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int x = 0;
        int y = 0;
        int expResult = 0;
        int result = CustomMath.sum(x, y);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of division method, of class CustomMath.
     */
    @Test
    public void testDivisionByZero() {
        int x = 0;
        int y = 2;
        int expResult = 0;
        try{
            int result = CustomMath.division(x, y);
            assertEquals(expResult, result);
            if(y==0) fail("Деление на ноль не создает исключительной ситуации");
        }catch(IllegalArgumentException e){
            if(y!=0) fail("Генерация исключения при ненулевом знаменателе");
        }
        
    }

    /**
     * Test of main method, of class CustomMath.
     */
    @Test
    @Ignore
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CustomMath.main(args);
        fail("The test case is a prototype.");
    }
    
}
