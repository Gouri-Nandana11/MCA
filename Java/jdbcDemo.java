import java.sql.*;

public class jdbcDemo {
    public static void main(String args[]){
        String url="jdbc:mysql://localhost:3306/testdb"; // change DB name
        String user="root"; // your MySQL username
        String password="123"; // your MySQL password

        String create="CREATE TABLE IF NOT EXISTS Employee(" +
                      "id INT PRIMARY KEY," +
                      "name VARCHAR(30)," +
                      "salary DECIMAL(10,2))";

        String ins="INSERT INTO Employee(id,name,salary) VALUES(?,?,?)";
        String sel="SELECT * FROM Employee";
        String selq="SELECT name,salary FROM Employee WHERE salary=?";
        String upd="UPDATE Employee SET salary=? WHERE name=?";
        String del="DELETE FROM Employee WHERE id=?";

        try(
            Connection con=DriverManager.getConnection(url,user,password);
            Statement Create=con.createStatement();
            PreparedStatement Insert=con.prepareStatement(ins);
            PreparedStatement SelectQ=con.prepareStatement(selq);
            Statement Sel=con.createStatement();
            PreparedStatement Update=con.prepareStatement(upd);
            PreparedStatement Delete=con.prepareStatement(del);
        ){
            System.out.println("Connection established successfully");

            Create.executeUpdate(create);
            System.out.println("Table created successfully");

            // Insert data
            Insert.setInt(1,1);
            Insert.setString(2,"John");
            Insert.setDouble(3,50000);
            Insert.executeUpdate();

            Insert.setInt(1,2);
            Insert.setString(2,"Tom");
            Insert.setDouble(3,45000);
            Insert.executeUpdate();

            Insert.setInt(1,3);
            Insert.setString(2,"Anu");
            Insert.setDouble(3,55000);
            Insert.executeUpdate();

            // Select all
            ResultSet rs=Sel.executeQuery(sel);
            System.out.println("Employees:");
            while(rs.next()){
                System.out.println(
                    "ID:"+rs.getInt("id")+
                    " Name:"+rs.getString("name")+
                    " Salary:"+rs.getDouble("salary")
                );
            }

            // Update
            Update.setDouble(1,65000);
            Update.setString(2,"Tom");
            Update.executeUpdate();

            // Select with condition
            SelectQ.setDouble(1,65000);
            ResultSet rsel=SelectQ.executeQuery();
            while(rsel.next()){
                System.out.println(
                    "Name:"+rsel.getString("name")+
                    " Salary:"+rsel.getDouble("salary")
                );
            }

        }catch(SQLException e){
            System.out.println("Database error: "+e.getMessage());
        }
    }
}




