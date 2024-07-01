package Data;

import Book.Book;
import JDBC.JDBCTools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookData {
    private static Book[] books;
    private static int index;
    static {
        books = new Book[3];
        //数组数组长度为3
        index = 0;
        //长度初始化0
    }
    public static void addStudent (Book book) throws SQLException {
        Connection connection = JDBCTools.getConnection();
        //获取数据库连接对象
        // `Connection`接口代表了到数据库的一个连接，通过这个连接可以执行SQL语句
        String sql = "insert into Book(name, author, price, type)" +
                "values(?,?,?,?)";
        //`?`是参数化查询的占位符
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //获取连接对象，预处理
        preparedStatement.setString(1,book.getName());
        preparedStatement.setString(2,book.getAuthor());
        preparedStatement.setInt(3,book.getPrice());
        preparedStatement.setString(4,book.getType());
        preparedStatement.executeUpdate();

    }


}

