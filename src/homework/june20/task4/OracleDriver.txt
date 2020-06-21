package homework.june20.task4;

public class OracleDriver implements DBDriver {
    @Override
    public void connect() {
        System.out.println("OracleDriver is establishing connection");
    }

    @Override
    public void execute(String query) {
        System.out.println("OracleDriver is executing query: " + query);
    }

    @Override
    public void close() {
        System.out.println("OracleDriver is closing connection");
    }
}
