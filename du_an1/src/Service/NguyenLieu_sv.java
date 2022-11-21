/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import java.util.ArrayList;
import DOMAINMODELS.NguyenLieu;

/**
 *
 * @author Inspiron
 */
public interface NguyenLieu_sv {
    public void insert (NguyenLieu nguyenLieu);
    public void update (String id, NguyenLieu nguyenLieu);
    public void delete (String id);
    public ArrayList<NguyenLieu> getAll();
    
    
}
