/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import java.util.ArrayList;
import domainmodels.luong;
import repositories.impl.LuongRepository;
import services.LuongSV;

/**
 *
 * @author Phuong
 */
public class LuongService  implements LuongSV{
    public  LuongRepository rluong = new LuongRepository();
    @Override
    public ArrayList<luong> getlist() {
            return rluong.all();
    }

    @Override
    public String insert(luong lg) {
        if(rluong.insert(lg)){
            return "Thêm Thành Công";
        }
        return "Thêm Thất bại";
    }

    @Override
    public String Update(String MaLuong, luong lg) {
         if(rluong.Update(MaLuong, lg)){
            return "Sửa Thành Công";
        }
        return "Sửa Thất bại";
    }

    @Override
    public String delete(String MaLuong) {
        if(rluong.delete(MaLuong)){
            return "xóa Thành Công";
        }
        return "xóa Thất bại";
    }
}
