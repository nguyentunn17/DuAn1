/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import java.util.ArrayList;
import DOMAINMODELS.NguyenLieu;
import Service.NguyenLieu_sv;
import repositories.NguyenLieu_rep;

/**
 *
 * @author Inspiron
 */
public class NguyenLieu_lmpl implements NguyenLieu_sv{
    private NguyenLieu_rep nguyenLieu_rep;

    public NguyenLieu_lmpl() {
        this.nguyenLieu_rep=new NguyenLieu_rep();
    }
    

    @Override
    public void insert(NguyenLieu nguyenLieu) {
        this.nguyenLieu_rep.insert(nguyenLieu);
      
        
    }

    @Override
    public void update(String id, NguyenLieu nguyenLieu) {
        this.nguyenLieu_rep.update(id, nguyenLieu);
    }

    @Override
    public void delete(String id) {
        this.nguyenLieu_rep.delete(id);
    }

    @Override
    public ArrayList<NguyenLieu> getAll() {
      return this.nguyenLieu_rep.getAll();
    }
    
    
}
