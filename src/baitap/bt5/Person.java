package baitap.bt5;

public class Person  {
    private String hoten;
    private int tuoi;
    private String socmnd;
    private Room room;
    private int sothue;
    public Person(String hoten,int tuoi,String socmnd,Room room,int sothue){
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.socmnd = socmnd;
        this.room = room;
        this.sothue = sothue;
    }
    public int getSothue() {
        return sothue;
    }

    public void setSothue(int sothue) {
        this.sothue = sothue;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSocmnd() {
        return socmnd;
    }

    public void setSocmnd(String socmnd) {
        this.socmnd = socmnd;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString(){
        return "Person{ "+
                "hoten = '" + hoten + '\''+
                ",tuoi = " + tuoi +
                ",socmnd = '" + socmnd + '\''+ room.toString()+
                '}';
    }

}
