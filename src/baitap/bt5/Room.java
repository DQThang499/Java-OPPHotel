package baitap.bt5;

public class Room {
    protected String loaiphong;
    protected int giaphong;
    public Room(String loaiphong,int giaphong){
        this.loaiphong = loaiphong;
        this.giaphong = giaphong;
    }
    public String getLoaiphong(){
        return loaiphong;
    }
    public void setLoaiphong(String loaiphong){
        this.loaiphong = loaiphong;
    }
    public int getGiaphong(){
        return giaphong;
    }
    public void setGiaphong(int giaphong){
        this.giaphong = giaphong;
    }
}
