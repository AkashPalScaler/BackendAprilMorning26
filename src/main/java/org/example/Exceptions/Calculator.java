package org.example.Exceptions;

import org.example.Genericsa.Pair;

import java.io.IOException;
import java.sql.SQLException;

public class Calculator {
    Integer divide(Integer a, Integer b) throws SQLException, IOException, OwnException {

        int d = 1;
        try {
            d = a / b;
            if (b == 1) {
                // DB query
                throw new SQLException("Some error");
            }
            if(b == 2){
                throw new NullPointerException();
            }
            if(b == 3){
                throw new IOException("sdj");
            }
            if(b == 4){
                throw new OwnException("Hello");
            }
            if(b == 5){
                throw new OwnRuntimeException("My runtime exception");
            }

        }

        catch (SQLException e){
            // handle SQL exception with retry
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            throw e;
        }catch (NullPointerException e){
            // Handle it by raising an alert

        }catch (IOException e){
            // Handle by retry with exponential backoff
            throw e;
        }
        catch (OwnException e){
            throw e;
        }
        catch (OwnRuntimeException e){
            throw e;
        }
        catch (Exception e){
            //common handler
        }
        System.out.println("DEBUG");
        return d;
    }
}
