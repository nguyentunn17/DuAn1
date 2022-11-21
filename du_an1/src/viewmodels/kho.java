/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewModels;

/**
 *
 * @author Phuong
 */
public class kho {
    private String makho;
    private String manl;
    private String tennl;
    private int soluongton;

    public kho() {
    }

    public kho(String makho, String manl, String tennl, int soluongton) {
        this.makho = makho;
        this.manl = manl;
        this.tennl = tennl;
        this.soluongton = soluongton;
    }

    public String getMakho() {
        return makho;
    }

    public void setMakho(String makho) {
        this.makho = makho;
    }

    public String getManl() {
        return manl;
    }

    public void setManl(String manl) {
        this.manl = manl;
    }

    public String getTennl() {
        return tennl;
    }

    public void setTennl(String tennl) {
        this.tennl = tennl;
    }

    public int getSoluongton() {
        return soluongton;
    }

    public void setSoluongton(int soluongton) {
        this.soluongton = soluongton;
    }
    
    
}
