/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import entty.Course;
import entty.category;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Locale.Category;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author ADMIN
 */
public class DataProcess {

    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=Demo_AP";
            String user = "sa";
            String pass = "123456";
            try {
                conn = DriverManager.getConnection(url, user, pass);
            } catch (SQLException ex) {
                Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public boolean checkLogin(String u, String p) {

        boolean flag = false;
        String sql = "select * from tblAccount where _user =? and _pass=?";
        try {
            PreparedStatement prst = getConnection().prepareStatement(sql);
            // Connection conn=getConnection();
            // prst=conn.prepareStatement(sql);
            prst.setString(1, u);
            prst.setString(2, p);
            ResultSet rs = prst.executeQuery();
            flag = rs.next();
            rs.close();
            prst.close();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }

        return flag;

    }

    public boolean addCourse(String id, String name, String category, String topic, String start, String end) {
        Connection conn = getConnection();
        int result = 0;
        String sql = "INSERT INTO  tblManageCourse VALUES( ? , ? , ? , ? , ? , ?)";
        try {
            PreparedStatement prst = getConnection().prepareStatement(sql);
            // Connection conn=getConnection();
            // prst=conn.prepareStatement(sql);
            prst.setString(1, id);
            prst.setString(2, name);
            prst.setString(3, category);
            prst.setString(4, topic);
            prst.setString(5, start);
            prst.setString(6, end);

            result = prst.executeUpdate();

            prst.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result > 0;
    }

    public ArrayList<Course> getData() {
        ArrayList<Course> list = new ArrayList<Course>();
        String sql = "select * from tblManageCourse";
        try {
            Statement st = getConnection().createStatement();
            // Connection conn=getConnection();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Course c = new Course();
                c.setId(rs.getString(1));
                c.setName(rs.getString(2));
                c.setCategory(rs.getString(3));
                c.setTopic(rs.getString(4));
                c.setStart(rs.getString(5));
                c.setEnd(rs.getString(6));
                list.add(c);
            }

            st.close();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }



    public ArrayList<category> getCategory() {
        ArrayList<category> list = new ArrayList<category>();
        String sql = "select * from tblCategory";
        try {
            Statement st = getConnection().createStatement();
            // Connection conn=getConnection();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                category c = new category();
                c.setId(rs.getString(1));
                c.setName(rs.getString(2));
                c.setDescription(rs.getString(3));
                list.add(c);
            }

            st.close();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public boolean editCourse(String id, String name, String category, String topic, String start, String end) {
        String sql = "update tblManageCourse set _name=?, _category=?,_topic=?,_start=?,_end=? where _id=?";
        int result = 0;
        try {
            PreparedStatement prst = getConnection().prepareStatement(sql);
            // Connection conn=getConnection();

            prst.setString(1, name);
            prst.setString(2, category);
            prst.setString(3, topic);
            prst.setString(4, start);
            prst.setString(5, end);
            prst.setString(6, id);
            result = prst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;

    }

    public Course getbyID(String id) {
        String sql = "select * from tblManageCourse where _id=?";
        Course c = new Course();
        try {
            PreparedStatement prst = getConnection().prepareStatement(sql);
            prst.setString(1, id);
            ResultSet rs = prst.executeQuery();
            while (rs.next()) {
                c.setId(rs.getString(1));
                c.setName(rs.getString(2));
                c.setCategory(rs.getString(3));
                c.setTopic(rs.getString(4));
                c.setStart(rs.getString(5));
                c.setEnd(rs.getString(6));

            }
            prst.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    public boolean deleteCourse(String id) {
        String sql = "DELETE FROM tblManageCourse WHERE _id = ?";

        int result = 0;
        try {
            PreparedStatement prst = getConnection().prepareStatement(sql);
            prst.setString(1, id);
            result = prst.executeUpdate();

            prst.close();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

}
