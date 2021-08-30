package baitap.bt5;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        while (true){
		System.out.println("chào mừng bạn đến với Khách sạn của chúng tôi");
		System.out.println("Xin hãy chọn yêu cầu để xác thực thông tin");
            System.out.println("1 : thêm ");
            System.out.println("2 : xóa ");
            System.out.println("3 : tính ");
            System.out.println("4 : sửa ");
            System.out.println("5 : thoát ");
            System.out.println("6 : Đánh giá khách sạn");
            String line = scanner.nextLine();
            switch (line){
                case "1": {
                    System.out.print("Enter name: ");
                    String hoten = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int tuoi = scanner.nextInt();
                    System.out.print("Enter passport: ");
                    scanner.nextLine();
                    String socmnd = scanner.nextLine();
                    System.out.println("chọn loại phong A ");
                    System.out.println("chọn loại phong B ");
                    System.out.println("chọn loại phong C ");
                    String choise = scanner.nextLine();
                    Room room;
                    if (choise.equals("A")){
                        room = new RoomA();
                    }else if (choise.equals("B")){
                        room = new RoomB();
                    }
                    else if (choise.equals("C")){
                        room = new RoomC();
                    }
                    else {
                        continue;
                    }
                    System.out.print("nhập số ngày thuê phòng ");
                    int sothue = scanner.nextInt();
                    Person person = new Person(hoten,tuoi,socmnd,room,sothue);
                    hotel.add(person);
                    scanner.nextLine();
                    break;
                }
                case "2":{
                    System.out.print("nhập số chưng minh ");
                    String socmnd = scanner.nextLine();
                    hotel.delete(socmnd);
                    break;
                }
                case "3":{
                    System.out.println("nhập số chưng minh nhân dân :");
                    String socmnd = scanner.nextLine();
                    System.out.println("giá tiền : "+hotel.calculator(socmnd));
                    break;
                }
                case "4":{
                    hotel.show();
                    break;
                }
                case "5":{
                    return;
                }
                case "6":{
                    System.out.println("nhập đánh giá: ");
                    String danhgia = scanner.nextLine();
                    break;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
