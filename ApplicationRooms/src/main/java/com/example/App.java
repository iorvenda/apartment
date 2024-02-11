package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.configuration.loginInformationConfig;
import com.example.entities.User;
import com.example.repository.UserRepository;
import com.example.services.UserServices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
@EnableConfigurationProperties(loginInformationConfig.class)
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class App {
	
	static UserServices uss= new UserServices();
    public static void main(String[] args) {
    	
        SpringApplication.run(App.class, args);
      /*  try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Practice","root","password");
//here sonoo is database name, root is username and password
            Statement stmt=con.createStatement();
            User u = new User();
            u.setId(6);
            u.setName("Iorvenda T Akem");
           
            
           // stmt.execute("insert into practice (id,name)VALUES (2,'iorvenda')");
            ResultSet rs=stmt.executeQuery("select * from practice");
            while(rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            con.close();
        }catch(Exception e){ System.out.println(e);}

       */
    }



}
