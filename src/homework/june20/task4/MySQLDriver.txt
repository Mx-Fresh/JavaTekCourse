package homework.june20.task4;

public class MySQLDriver implements DBDriver {
    @Override
    public void connect() {
        System.out.println("MySQLDriver is establishing connection");
    }

    @Override
    public void execute(String query) {
        System.out.println("MySQLDriver is executing query: " + query);
    }

    @Override
    public void close() {
        System.out.println("MySQLDriver is closing connection");
    }
}
