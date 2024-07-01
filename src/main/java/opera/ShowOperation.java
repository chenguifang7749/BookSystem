package opera;

import Book.BookList;
//显示图书
public class ShowOperation implements IOPeration{
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书！");
        int currentSize= bookList.getUsedSize();
        for (int i=0;i<currentSize;i++){
            System.out.println(bookList.getBook(i));
        }
    }
}