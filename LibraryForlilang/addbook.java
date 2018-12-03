package LibraryForlilang;


import java.util.ArrayList;
import java.util.Scanner;
public class addbook {
    public void addBook(ArrayList book) {
        bookInformation bookl = new bookInformation();

        System.out.println("输入需要添加的图书的信息   编号 书名  作者   剩余数量");
        Scanner sc = new Scanner(System.in);
        bookl.setBookId(sc.nextLine());
        bookl.setBookName(sc.nextLine());
        bookl.setBookAuthor(sc.nextLine());
        bookl.setHaveNumber(sc.nextInt());
        book.add(bookl);
    }
}


