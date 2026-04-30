package com.tnsif.jdbcprogram;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCSelect {
	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
         
         // step 2: load and register driver
         
 Class.forName("org.postgresql.Driver");
 System.out.println("step 2 : load and register driver completed");
 
 // step 3: Establish the connection
 
 Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/AtriaCG07", "postgres", "root");
 System.out.println("Establish the connection completed");
 
// step 4:create statement 
 
 Statement st=conn.createStatement();
 
 System.out.println("create statement completed");
 
 // step 5: execute query
 
// String strselect="select sid ,sname,semail,sbranch from Student";
// System.out.println("The sql statement" +strselect );
// 
 System.out.println("step 5 completed");
 
 // process the result to display
// ResultSet rs=st.executeQuery(strselect);
 
// System.out.println(" the records are");
// int rowcount=0;
// while(rs.next()) {
//         int sid=rs.getInt("sid");
//         String sname=rs.getString("sname");
//         String semail=rs.getString("semail");
//         String sbranch=rs.getString("sbranch");
//         
//         System.out.println(sid+" "+sname+" "+semail+" "+sbranch);
//         ++rowcount;
 
 //insert query
 
 String Sqlinsert="insert into Student values(5,'fiza','fiza@345','EC')";
 System.out.println("query written");
 
 int countinserted=st.executeUpdate(Sqlinsert);
 System.out.println("countinserted");
         
 }
 }





}
