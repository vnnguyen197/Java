/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tiendien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DSKhachHang {
    private ArrayList<KhachHang> a = new ArrayList<>();
    private int soluong;
    public void docFile() throws FileNotFoundException{
        try{
            File f=new File("D:\\File.Txt");
            if(f.exists());
            Scanner read=new Scanner (f);
            while(read.hasNextLine()){
                Scanner kb1=new Scanner(read.nextLine());
                String makh,hoten,doituongkh = null,QuocTich;
                DATE ngayhoadon;
                int soluongtieuthu,dongia,dinhmuc;
                makh=kb1.next();
                hoten=" ";
                while(!kb1.hasNextInt())
                    hoten=hoten+kb1.next()+" ";
                ngayhoadon=new DATE();
                ngayhoadon.setDd(kb1.nextInt());
                ngayhoadon.setMm(kb1.nextInt());
                ngayhoadon.setYyyy(kb1.nextInt());
                KhachHang kh = null;
                soluong=kb1.nextInt();
                dongia=kb1.nextInt();
              if(kb1.nextInt()){
                  dinhmuc=kb1.nextInt();
                  KhachHangVietNam kb = new KhachHangVietNam(makh,hoten,ngayhoadon,soluong,dongia,doituongkh,dinhmuc);
                  
              }
         
            else{
                  QuocTich=kb1.next();
                  KhachHangNuocNgoai kb = new KhachHangNuocNgoai(makh,hoten,ngayhoadon,soluong,dongia,QuocTich);
              }
            a.add(kh);
        }
      }
    }
}
    
   
