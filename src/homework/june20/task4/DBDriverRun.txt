package homework.june20.task4;

public class DBDriverRun {

    public static void main(String[] args) {
        DBDriver oracleDriver = new OracleDriver();
        DBDriver mssqlDriver = new MSSQLDriver();
        DBDriver mysqlDriver = new MySQLDriver();

        String query="SELECT * FROM TABLE1";

        executeQuery(oracleDriver, query);
        executeQuery(mssqlDriver, query);
        executeQuery(mysqlDriver, query);
    }

    public static void executeQuery(DBDriver driver, String query) {
        driver.connect();
        driver.execute(query);
        driver.close();
    }
}
