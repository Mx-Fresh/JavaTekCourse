package homework.june20.task4;

public class MSSQLDriver implements DBDriver{
    @Override
    public void connect() {
        System.out.println("MSSQLDriver is establishing connection");
    }

    @Override
    public void execute(String query) {
        System.out.println("MSSQLDriver is executing query: " + query);
    }

    @Override
    public void close() {
        System.out.println("MSSQLDriver is closing connection");
    }
}
