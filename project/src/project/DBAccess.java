package project;
/*特定のデータベースとの接続(セッション)を表現することができるクラス。
 * コンテキスト内でSQL文が実行され結果が返される。*/
import java.sql.Connection;
/*JDBCドライバーを管理するためのクラス。
 * getConnection メソッドが呼び出されると、DriverManager は、ドライバの中から適切なドライバを探そうとする。*/
import java.sql.DriverManager;
/*データベース・アクセス・エラーまたはその他のエラーに関する情報(メッセージ)を提供するクラス。*/
import java.sql.SQLException;

public class DBAccess {
    //ドライバーのクラス名
    private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
    //JDMC接続先の情報
    private static final String JDBC_CONNECTION = "jdbc://localhost:5432/lesson_db";
    //ユーザー名
    private static final String USER = "postgres";
    //パスワード
    private static final String PASS = "postgres";


    public static void main(String[] args) {
        Connection connection = null;
        try {
            //JDBCドライバーを読み込こみ、データベースに接続する準備を実行。
            Class.forName(POSTGRES_DRIVER);

            //接続先の情報。()内には３つの引数を与え、読み込みたいデータベースを指定している。
            connection=DriverManager.getConnection(JDBC_CONNECTION,USER,PASS);

        //例外が発生したときのために、try catchで対応できるようにする。
        //forName()で例外が発生した場合
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        //getConnection()で例外が発生した場合
        }catch(SQLException e){
            e.printStackTrace();;
        }finally {
            try {
                if (connection != null) {
                    //データベースを切断
                    connection.close();
                }
            } catch (SQLException e) {
                // TODO: handle exception
                e.printStackTrace();
            }

        }
    }
}
