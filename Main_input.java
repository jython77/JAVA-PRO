import java.util.Scanner;

public class Main_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String score = sc.next();

        switch(score){
            case "A":
                System.out.println("A등급입니다.");
                break;
            case "B":
                System.out.println("B등급입니다.");
                break;
            case "C":
                System.out.println("C등급입니다.");
                break;
            default:
                System.out.println("D등급 이하 입니다.");
                break;
        }
    }
}
