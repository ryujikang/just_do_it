import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("== 자바 텍스트 게시판 ==");
        System.out.println("== 프로그램 시작 ==");

        while (true) {
            System.out.printf("명령) ");
            String command = scanner.nextLine();

            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("입력 된 명령어) " + command);
    
        }
        

        System.out.println("== 프로그램 종료 ==");
        scanner.close();
    }
}
