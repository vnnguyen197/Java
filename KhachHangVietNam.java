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
public class KhachHangVietNam extends KhachHang implements ITienDien {
    protected String doituongkh;
 public KhachHangVietNam(){
}
 public KhachHangVietNam(String doituongkh,int makh,String hoten,String ngayhoadon,float soluongtieuthu,float dongia,float dinhmuc){
     super(makh,hoten,ngayhoadon,soluongtieuthu,dongia,dinhmuc);
     this.doituongkh=doituongkh;
    }

    KhachHangVietNam(String makh, String hoten, DATE ngayhoadon, int soluong, int dongia, String doituongkh, int dinhmuc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    KhachHangVietNam(String makh, String hoten, DATE ngayhoadon, int soluong, int dongia, String doituongkh, int dinhmuc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 public double TinhThanhTien(){
     if(soluongtieuthu<=dinhmuc)
         return soluongtieuthu*dongia;
     else
         return dinhmuc*dongia+(soluongtieuthu-dinhmuc)*dongia*2.5;
 }
}