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
import model.Sepatu;

/**
 *
 * @author lexs
 */
public class SepatuDAO {
    private Connection conn = null;

    public SepatuDAO() {
        this.conn = new Koneksi().getConnection();
    }
    
    public boolean Insert(Sepatu sep){
        boolean cek = false;
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement("INSERT INTO tbsepatu VALUES (?,?,?)");
            ps.setString(1, sep.getId_sepatu());
            ps.setString(2, sep.getNama_sepatu());
            ps.setString(3, sep.getJenis());
            if(ps.executeUpdate()>0){
                cek = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cek;
    }
    
    public boolean Update(Sepatu sep){
        boolean cek = false;
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement("UPDATE tbsepatu SET nama_sepatu=?, jenis=? WHERE id_sepatu=?");
            ps.setString(1, sep.getNama_sepatu());
            ps.setString(2, sep.getJenis());
            ps.setString(3, sep.getId_sepatu());
            if(ps.executeUpdate()>0){
                cek = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cek;
    }
    
    public boolean Delete(Sepatu sep){
        boolean cek = false;
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement("DELETE FROM tbsepatu WHERE id_sepatu=?");
            ps.setString(1, sep.getId_sepatu());
            if(ps.executeUpdate()>0){
                cek = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cek;
    }
    
    public List<Sepatu> GetAllSepatu(){
        List<Sepatu> getSep = new ArrayList<Sepatu>();
        Sepatu sep;
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbsepatu");
            rs = ps.executeQuery();
            while(rs.next()){
                sep = new Sepatu();
                sep.setId_sepatu(rs.getString(1));
                sep.setNama_sepatu(rs.getString(2));
                sep.setJenis(rs.getString(3));
                getSep.add(sep);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getSep;
    }
    
    public Sepatu GetSepatu(String index){
        Sepatu sep = new Sepatu();
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbsepatu WHERE id_sepatu=?");
            ps.setString(1, index);
            rs = ps.executeQuery();
            while(rs.next()){
                sep.setId_sepatu(rs.getString(1));
                sep.setNama_sepatu(rs.getString(2));
                sep.setJenis(rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sep;
    }
}
