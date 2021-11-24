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
public class KhachHangNuocNgoai extends KhachHang implements ITienDien{
    protected String QuocTich;
    public KhachHangNuocNgoai(){
    }
    public KhachHangNuocNgoai(String QuocTich,int makh,String hoten,String ngayhoadon,float soluongtieuthu,float dongia,float dinhmuc){
        super(makh,hoten,ngayhoadon,soluongtieuthu,dongia,dinhmuc);
        this.QuocTich=QuocTich;            
    }

    KhachHangNuocNgoai(String makh, String hoten, DATE ngayhoadon, int soluong, int dongia, String QuocTich) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public double TinhThanhTien(){
        return soluongtieuthu*dongia;
    }
}

