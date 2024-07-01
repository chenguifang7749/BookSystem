package opera;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class UpaOperation implements IOPeration{

    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书！");
        System.out.println("请输入要查找的图书名字");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) { // 判断查找图书名字是否相同
                System.out.println("找到了这本书：");
                System.out.println(book); // 输出图书信息

                // 修改书名和作者名
                System.out.println("请输入新的书名：");
                String newName = scanner.nextLine();
                System.out.println("请输入新的作者名：");
                String newAuthor = scanner.nextLine();

                book.setName(newName); // 设置新的书名
                book.setAuthor(newAuthor); // 设置新的作者名

                System.out.println("修改成功！");
                return;
            }
        }
        System.out.println("没有这本书！");
    }
}
