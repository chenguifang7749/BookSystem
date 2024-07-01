import Book.BookList;
import User.AdUser;
import User.NorUser;
import User.User;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    //登录
    public static User login() throws SQLException {
        System.out.println("请输入你的姓名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请选择你的身份：1->管理员 0->普通用户");
        int choice = scanner.nextInt();
        if (choice == 1) {
            //说明是管理员
            //由于有返回值,所以我们的方法返回值就不能写void了。但是我们也无法确定返回值是什么,可能是管理员,可能是用户。所以,用向上转型,写User.
            return new AdUser(name);//返回实例化一个管理员对象
        } else {
            return new NorUser(name);//返回实例化一个用户对象
        }
    }

    public static void main(String[] args) throws SQLException {
        User user = login();//执行上面的login方法
        BookList bookList = new BookList();
        while (true) {
            int choice = user.menu();//实现打印菜单
            user.doWork(choice, bookList);
        }
    }
}