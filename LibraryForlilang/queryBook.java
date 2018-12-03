package LibraryForlilang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class queryBook {
    private    void   queryBookAll(ArrayList book){
        Iterator<bookInformation> it = book.iterator();
        while(it.hasNext()){
            bookInformation b=it.next();
            System.out.println("编号    "+"书名     "+"作者     "+"  剩余数量");
            System.out.println(b.getBookId()+"\t"+b.getBookName()+"\t"+b.getBookAuthor()+"\t"+b.getHaveNumber());
        }
        System.out.println("查询结束");
    }
    private   void   queryBookForBookName(ArrayList  book){
        System.out.println("输入需要查询书的名字");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        Iterator<bookInformation> it = book.iterator();
        while (it.hasNext()){
            bookInformation bookname=it.next();
            if (name.equals(bookname.getBookName())){
                System.out.println("编号    "+"书名     "+"作者     "+"  剩余数量");
                System.out.println(bookname.getBookId()+"    "+bookname.getBookName()+"   "+bookname.getBookAuthor()+"  "+bookname.getHaveNumber());
            }
        }
        System.out.printf("查询结束");
    }
    private   void   queryBookForBookId(ArrayList  book){
        System.out.println("输入需要查询书的编号");
        Scanner sc=new Scanner(System.in);
        String Id=sc.nextLine();
        Iterator<bookInformation> it = book.iterator();
        while (it.hasNext()){
            bookInformation bookId=it.next();
            if (Id.equals(bookId.getBookId())){
                System.out.println(" 编号  书名  作者   剩余数量");
                System.out.println(bookId.getBookId()+"    "+bookId.getBookName()+"   "+bookId.getBookAuthor()+"  "+bookId.getHaveNumber());
            }
        }
        System.out.println("查询结束");
    }
    private    void   queryBookForBookAuthor(ArrayList  book){
        System.out.println("输入需要查询书的作者");
        Scanner sc=new Scanner(System.in);
        String Author=sc.nextLine();
        Iterator<bookInformation> it = book.iterator();
        while (it.hasNext()){
            bookInformation BookAuthor=it.next();
            if (Author.equals(BookAuthor.getBookAuthor())){
                System.out.println("编号    "+"书名     "+"作者     "+"  剩余数量");
                System.out.printf(BookAuthor.getBookId()+"/t"+BookAuthor.getBookName()+"/t"+BookAuthor.getBookAuthor()+"/t"+BookAuthor.getHaveNumber());
            }
        }
        System.out.printf("查询结束");
    }
    public  void  queryBook(ArrayList  book) {
        System.out.println("      查询方式     ");
        System.out.println("  1   显示所有图书信息     ");
        System.out.println("  2   按书名查询           ");
        System.out.println("  3   按编号查询           ");
        System.out.println("  4   按作者查询           ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();// 选择的序列号
        switch (x) {
            case 1:
                queryBookAll(book);
                break;
            case 2:
                queryBookForBookName(book);
                break;
            case 3:
                queryBookForBookId(book);
                break;
            case  4:
                queryBookForBookAuthor(book);
                break;
        }
    }
}
