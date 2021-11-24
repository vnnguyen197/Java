/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendien;

/**
 *
 * @author nguyen123
 */
public class KhachHang {
    protected int makh;
    protected String hoten,ngayhoadon;
    protected float soluongtieuthu,dongia,dinhmuc;
    public KhachHang(){}
    public KhachHang(int makh,String hoten,String ngayhoadon,float soluongtieuthu,float dongia,float dinhmuc){
        this.makh=makh;
        this.hoten=hoten;
        this .ngayhoadon=ngayhoadon;
        this.soluongtieuthu=soluongtieuthu;
        this.dongia=dongia;
        this.dinhmuc=dinhmuc;
    }
    public int getMakh(){
     return makh;   
    }
    public void setMakh(int makh){
        this.makh=makh;
    }
    public String getHoten(){
        return hoten;
    }
    public void setHoten(String Hoten){
        this.hoten=hoten;
    }
    public String getNgayhoadon(){
        return ngayhoadon;
    }
    public void setNgayhoadon(String ngayhoadon){
        this.ngayhoadon=ngayhoadon;
    }
    public float getSoluongtieuthu(){
        return soluongtieuthu;
    }
    public void setSoluongtieuthu(float soluongtieuthu){
        this.soluongtieuthu=soluongtieuthu;
    }
    public float getDongia(){
        return dongia;
    }
    public void setDongia(float dongia){
        this.dongia=dongia;
    }
    public float getDinhmuc(){
        return dinhmuc;
    }
    public void setDanhmuc(float dinhmuc){
        this.dinhmuc=dinhmuc;
    }
    @Override
    public String toString(){
        return makh+" "+hoten+" "+ngayhoadon+" "+soluongtieuthu+" "+dongia+" "+dinhmuc;
    }
}
