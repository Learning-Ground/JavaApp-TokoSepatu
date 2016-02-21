/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Supplier;

/**
 *
 * @author lexs
 */
public class SupplierDAO {
    private Connection conn = null;

    public SupplierDAO() {
        this.conn = new Koneksi().getConnection();
    }
    
    public boolean Insert(Supplier sup){
        boolean cek = false;
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement("INSERT INTO tbsupplier VALUES (?,?)");
            ps.setString(1, sup.getId_supplier());
            ps.setString(2, sup.getNama_supplier());
            if(ps.executeUpdate()>0){
                cek = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cek;
    }
    
    public boolean Update(Supplier sup){
        boolean cek = false;
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement("UPDATE tbsupplier SET nama_supplier=? WHERE id_supplier=?");
            ps.setString(1, sup.getNama_supplier());
            ps.setString(2, sup.getId_supplier());
            if(ps.executeUpdate()>0){
                cek = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cek;
    }
    
    public boolean Delete(Supplier sup){
        boolean cek = false;
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement("DELETE FROM tbsupplier WHERE id_supplier=?");
            ps.setString(1, sup.getId_supplier());
            if(ps.executeUpdate()>0){
                cek = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cek;
    }
    
    public List<Supplier> GetAllSupplier(){
        List<Supplier> getSup = new ArrayList<Supplier>();
        Supplier sup;
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbsupplier");
            rs = ps.executeQuery();
            while(rs.next()){
                sup = new Supplier();
                sup.setId_supplier(rs.getString(1));
                sup.setNama_supplier(rs.getString(2));
                getSup.add(sup);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getSup;
    }
    
    public Supplier GetSupplier(String index){
        Supplier sup = new Supplier();
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbsupplier WHERE id_supplier=?");
            ps.setString(1, index);
            rs = ps.executeQuery();
            while(rs.next()){
                sup.setId_supplier(rs.getString(1));
                sup.setNama_supplier(rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sup;
    }
}
