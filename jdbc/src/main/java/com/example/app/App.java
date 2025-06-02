package com.example.app;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/* Basic postgresql connection */
// docker run --name postgres -e POSTGRES_PASSWORD=clave123 -p 5432:5432 -d postgres
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String url = "jdbc:postgresql://localhost:5432/midb";
        String uname = "postgres";
        String pass = "clave123";

        Connection con = null;
        try {
            con = DriverManager.getConnection(url, uname, pass); // Connect to the DB

            // Inserting data using prepared statement in order to avoid SQL inyection
            PreparedStatement pr = con.prepareStatement("INSERT INTO student (sname, sage) VALUES (?,?)");
            pr.setString(1, "ian");
            pr.setInt(2, 10);

            Statement st = con.createStatement(); // Handle querys to the DB
            ResultSet result = st.executeQuery("SELECT * FROM STUDENT;");

            // Move the cursor to the first row (it starts at index -1). Returns false if no
            // row was found)
            if (!result.next()) {
                pr.execute(); // if the table was empty, execute the insert statement for testing
            }

            System.out.println("Name: " + result.getString("sname"));
            System.out.println("Age: " + result.getString("sage"));
            // Another way to print results:
            while (result.next()) {
                System.out.println("--------------------");
                System.out.println("Name: " + result.getString("sname"));
                System.out.println("Age: " + result.getInt("sage"));
            }

        } catch (

        Exception e) {
            e.printStackTrace();
        }

    }
}
