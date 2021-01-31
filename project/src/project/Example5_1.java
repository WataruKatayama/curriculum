package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example5_1 {

    //定数の設定
    //ドライバーのクラス名
    public static final String POSTGRES_DRIVER = "org.postgresql";
    //JDBC接続先の情報
    public static final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5432/lesson_db";
    //ユーザー名
    public static final String USER ="postgres";
    //パスワード
    public static final String PASS ="postgres";


    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Connection connection = null;
        Statement statment = null;
        ResultSet resultSet = null;

        try {
            Class.forName(POSTGRES_DRIVER);
            connection=DriverManager.getConnection(JDBC_CONNECTION);

            //SQLの実行にはstatementインターフェースを使用する。このクラスはConnectionクラスのcreateStatement()メソッドで取得する。
            statment  = connection.createStatement();
            String SQL  = "SELECT * from Goods";
            //executeQuery:引数で指定されたSQLをデータベースで実行するメソッド。
            //resultSetが問題なく成功すると、SQLインターフェースの 実行結果を格納し、その情報も取得できるメソッドになるということになる。
            resultSet = statment.executeQuery(SQL);

            //resultSetオブジェクトは初期状態では、必ずnext()メソッド（次の行に移動する）で最初の行に移動してやる必要がある。
            while(resultSet.next()) {
                //データベースの文字列を取得する場合はgetString、整数はgetInt、日付はgetDateになる。
                String column1 = resultSet.getString("GoodsName");
                String column2 = resultSet.getString("UnitPrice");
                String column3 = resultSet.getString("UpdateDate");

                System.out.println(column1+",");
                System.out.println(column2+",");
                System.out.println(column3);
            }
          //forNameで例外発生した場合の処理
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
         //getConnection() createStatment() executeQuery() で例以外が発生した場合の処理
        }catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally {
            try {
                if(resultSet != null) {
                    resultSet.close();
                }
                if (statment != null) {
                    statment.close();
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
