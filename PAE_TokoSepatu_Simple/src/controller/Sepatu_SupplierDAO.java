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
import java.util.UUID;
import model.Sepatu;
import model.Sepatu_Supplier;
import model.Supplier;

/**
 *
 * @author lexs
 */
public class Sepatu_SupplierDAO {
    private Connection conn = null;

    public Sepatu_SupplierDAO() {
        this.conn = new Koneksi().getConnection();
    }
    
    public boolean Insert(Sepatu_Supplier ss){
        boolean cek = false;
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement("INSERT INTO tb_sepatu_supplier VALUES (?,?,?)");
            ps.setString(1, UUID.randomUUID().toString());
            ps.setString(2, ss.getId_supplier());
            ps.setString(3, ss.getId_sepatu());
            if(ps.executeUpdate()>0){
                cek = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cek;
    }
    
    public boolean DeleteSupplier(Supplier sup){
        boolean cek = false;
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement("DELETE FROM tb_sepatu_supplier WHERE id_supplier=?");
            ps.setString(1, sup.getId_supplier());
            if(ps.executeUpdate()>0){
                cek = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cek;
    }
    
    public boolean DeleteSepatu(Sepatu spt){
        boolean cek = false;
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement("DELETE FROM tb_sepatu_supplier WHERE id_sepatu=?");
            ps.setString(1, spt.getId_sepatu());
            if(ps.executeUpdate()>0){
                cek = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cek;
    }
    
    public List<Sepatu_Supplier> GetAllSepatuBySupplier(String index){
        List<Sepatu_Supplier> getSep = new ArrayList<Sepatu_Supplier>();
        Sepatu_Supplier sep;
        PreparedStatement ps;
        ResultSet rs;
        try {
            int a = 0;
            ps = conn.prepareStatement("SELECT * FROM tb_sepatu_supplier WHERE id_supplier=?");
            ps.setString(1, index);
            rs = ps.executeQuery();
            while(rs.next()){
                sep = new Sepatu_Supplier();
                sep.setId_sepatu(rs.getString(3));
                getSep.add(sep);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getSep;
    }
    
    public Sepatu_Supplier GetSupplier(String index){
        Sepatu_Supplier sup = new Sepatu_Supplier();
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareStatement("SELECT * FROM tb_sepatu_supplier WHERE id_sepatu=?");
            ps.setString(1, index);
            rs = ps.executeQuery();
            while(rs.next()){
                sup.setId(rs.getString(1));
                sup.setId_supplier(rs.getString(2));
                sup.setId_sepatu(rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sup;
    }
}
