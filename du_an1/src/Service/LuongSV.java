/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.luong;

/**
 *
 * @author Phuong
 */
public interface LuongSV {
    ArrayList<luong> getlist();
    String insert(luong lg);
    String Update(String MaLuong ,luong lg);
    String delete(String MaLuong);
}