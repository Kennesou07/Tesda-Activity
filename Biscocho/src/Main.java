import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("enter role number: ");
            byte role = sc.nextByte();
            switch (role){
                case 1:
                    System.out.println("admin");
                    break;
                case 2:
                    System.out.println("teacher");
                    break;
                case 3:
                    System.out.println("student");
                    break;
                default:
                    System.out.println("Invalid role");
            }
        }
    }
}