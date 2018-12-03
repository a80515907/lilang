package LibraryForlilang;
import java.util.ArrayList;
import java.util.Scanner;

public class deletBook {
    private void deletBookForId(ArrayList book) {
        System.out.println("输入需要删除书的编号");
        Scanner sc = new Scanner(System.in);
        String Id = sc.nextLine();
        for (int i=book.size()-1;i>=0;i--){
            bookInformation  books=(bookInformation)book.get(i);
            if (Id.equals(books.getBookId())){
                book.remove(i);
            }
        }
        System.out.println("删除完成");
    }
    private void deletBookForBookName(ArrayList book){
        System.out.println("输入需要删除书的书名");
        Scanner sc = new Scanner(System.in);
        String bookMame = sc.nextLine();
        for (int i=book.size()-1;i>=0;i--){
            bookInformation  books=(bookInformation)book.get(i);
            if (bookMame.equals(books.getBookName())){
                book.remove(i);
            }
        }
        System.out.println("删除完成");
    }
    private void deletBookForBookAuthor(ArrayList book){
        System.out.println("输入需要删除书的作者");
        Scanner sc = new Scanner(System.in);
        String BookAuthor = sc.nextLine();
        for (int i=book.size()-1;i>=0;i--){
            bookInformation  books=(bookInformation)book.get(i);
            if (BookAuthor.equals(books.getBookAuthor())){
                book.remove(i);
            }
        }
        System.out.println("删除完成");
    }
    public void deletBook(ArrayList book){
        System.out.println("1    按编号删除");
        System.out.println("2    按书名删除");
        System.out.println("3    按作者名删除");
        Scanner sc=new Scanner(System.in);
        int y = sc.nextInt();
        switch (y) {
            case 1:
                deletBookForId(book);
                break;
            case 2:
                deletBookForBookName(book);
                break;
            case 3:
                deletBookForBookAuthor(book);
                break;
            default:break;
        }
    }
}
