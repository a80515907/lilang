package LibraryForlilang;

import java.util.ArrayList;
import java.util.Scanner;

public class modifyBook {
    //按编号  书名  作者  更改
    private void modifyBookId(ArrayList book, int i) {
        bookInformation books = (bookInformation) book.get(i);
        System.out.println("需要修改的Id");
        Scanner sc = new Scanner(System.in);
        books.setBookId(sc.nextLine());
    }

    private void modifyBookName(ArrayList book, int i) {
        bookInformation books = (bookInformation) book.get(i);
        System.out.println("需要修改的书名");
        Scanner sc = new Scanner(System.in);
        books.setBookName(sc.nextLine());
    }

    private void modifyBookAuthor(ArrayList book, int i) {
        bookInformation books = (bookInformation) book.get(i);
        System.out.println("需要修改的作者名");
        Scanner sc = new Scanner(System.in);
        books.setBookAuthor(sc.nextLine());
    }

    public void modifyBookForBookId(ArrayList book) {
        System.out.println("输入需要修改的编号");
        Scanner sc = new Scanner(System.in);
        String Id = sc.nextLine();
        for (int i = book.size() - 1; i >= 0; i--) {
            bookInformation books = (bookInformation) book.get(i);
            if (Id.equals(books.getBookId())) {

                while (true) {
                    System.out.println("输入修改的部分 1修改编号  2修改书名 3修改作者 4退出");
                    int x = sc.nextInt();
                    switch (x) {
                        case 1:modifyBookId(book,i);
                            break;
                        case 2:modifyBookName(book,i);
                            break;
                        case 3:modifyBookAuthor(book,i);
                            break;
                        default:break;
                    }
                    if(x==4)break;
                }
            }
            System.out.println("修改完成");
        }
    }
}
