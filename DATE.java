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

public class DATE {
    private int dd,mm,yyyy;
    public DATE(){
}
    public DATE(int Day,int Month,int Year){
    dd=Day;
    mm=Month;
    yyyy=Year;
    }
    public int getDd(){
        return dd;
    }
    public void setDd(int dd){
        this.dd=dd;
    }
      public int getMm(){
        return mm;
    }
    public void setMm(int mm){
        this.mm=mm;
    }
  public int getYyyy(){
        return yyyy;
    }
    public void setYyyy(int yyyy){
        this.yyyy=yyyy;
    }
public String toString(){
    return dd+"/"+mm+"/"+yyyy;
}
}
