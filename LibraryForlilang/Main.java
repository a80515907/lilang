package LibraryForlilang;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<bookInformation> book = new ArrayList<bookInformation>();
        while (true) {
            System.out.println("--------------图书管理系统------------");
            System.out.println("       1      添加图书信息            ");
            System.out.println("       2      删除图书信息            ");
            System.out.println("       3      查询图书信息            ");
            System.out.println("       4      更改图书信息            ");
            System.out.println("       5        退出系统              ");
            System.out.println("输入选项");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    addbook add = new addbook();
                    add.addBook(book);
                    break;
                case 2:
                    deletBook del = new deletBook();
                    del.deletBook(book);
                    break;
                case 3:
                    queryBook que=new queryBook();
                    que.queryBook(book);
                    break;
                case 4:
                    modifyBook mod=new modifyBook();
                    mod.modifyBookForBookId(book);
                    break;
                default:break;
            }
            if (x==5)break;
        }
    }
}
