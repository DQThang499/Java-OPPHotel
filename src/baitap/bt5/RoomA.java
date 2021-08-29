package baitap.bt5;

public class RoomA extends Room {
    public RoomA(){
        super("A",500);
    }
    @Override
    public String toString(){
        return "RoomA{"+
                "loaiphong = '" + loaiphong + '\''+
                ", giaphong = '" + giaphong +
                '}';
    }
}
