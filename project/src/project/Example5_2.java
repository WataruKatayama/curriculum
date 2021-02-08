package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example5_2 {

    //定数の設定
    //ドライバーのクラス名
    private static final String POSTGRES_DRIVER ="org.postgresql.Driver";
    private static final String JDBC_CONNECTION ="jdbc:postgresql://localhost:5432/lesson_db";
    private static final String USER ="postgres";
    private static final String PASS ="postgres";

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Connection connection = null;
        Statement statement = null;

        try {
            //JDBCドライバーを読み込む
            Class.forName(POSTGRES_DRIVER);
            //接続先の情報を取得し、connectionに格納する
            connection = DriverManager.getConnection(JDBC_CONNECTION,USER,PASS);
            //SQLを実行し、statmentに格納する
            statement = connection.createStatement();
            String SQL = "INSERT INTO TB_SHOHIN(SHOHIN_ID,SHOHIN_NAME,TANKA)"+"VALUES('021','SHOHIN021',2100)";
            //INSERT文、UPDATE文、DELETE文の場合は、 executeUpdate() メソッドを使用する。
            statement.executeUpdate(SQL);
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally {
            try {
                if(statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }

}
