package org.example.Exceptions;

import java.sql.SQLException;

public class Client {
    public static void main(String[] args) throws Exception{
        Calculator cal = new Calculator();
        try{
            cal.divide(5,1);
        }catch (SQLException e) {
            // Stop and print
            System.out.println(e.getMessage());
            // retry cal.divide(5, 1)
            //rethrow
            throw e;
        }
    }
}
// Break till 8:20 AM
