package JDBC;

import java.sql.*;

public class JDBCTools {
    public static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            // 检查变量connection是否为null，如果为null，则执行大括号内的代码

            String url = "jdbc:mysql://localhost:3306/book";
            // 定义数据库的URL连接，这里使用的是MySQL数据库的URL格式
            // "jdbc:mysql://localhost:3306/qimo" 表示连接到本地机器的3306端口的qimo数据库
            String user = "root";
            String password = "123456";
            connection = DriverManager.getConnection(url, user, password);
            // 使用DriverManager的getConnection方法尝试建立数据库连接
            // 如果连接成功，则将连接对象赋值给变量connection
            return connection;
            // 如果connection变量为null，则在大括号内执行上述代码后，返回建立好的连接对象
        }
        return connection;
// 如果connection变量不为null，则直接返回已经建立的连接对象

    }

}