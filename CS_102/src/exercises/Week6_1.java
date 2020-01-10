package exercises;

import java.util.Scanner;

public class Week6_1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] columnsArr = new int[8];
        for (int i = 0; i < columnsArr.length; i++) {
            columnsArr[i] = input.nextInt();
        }
        for (int i: columnsArr) {
            switch (i) {
                case 0:
                    System.out.println("|Q|_|_|_|_|_|_|_|");
                    break;
                case 1:
                    System.out.println("|_|Q|_|_|_|_|_|_|");
                    break;
                case 2:
                    System.out.println("|_|_|Q|_|_|_|_|_|");
                    break;
                case 3:
                    System.out.println("|_|_|_|Q|_|_|_|_|");
                    break;
                case 4:
                    System.out.println("|_|_|_|_|Q|_|_|_|");
                    break;
                case 5:
                    System.out.println("|_|_|_|_|_|Q|_|_|");
                    break;
                case 6:
                    System.out.println("|_|_|_|_|_|_|Q|_|");
                    break;
                case 7:
                    System.out.println("|_|_|_|_|_|_|_|Q|");
                    break;
            }
        }
    }
}
