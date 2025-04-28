import java.util.Scanner;
class StringRepeat{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print number count for repeat: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Print string for repeat: ");
        String s = scanner.nextLine();
        if (n <= 0){
            System.out.println("Number is negative");
        }
        System.out.println(s.repeat(n));
    }
}


