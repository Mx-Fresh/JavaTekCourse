package homework.june20.task4;

public interface DBDriver {

    public void connect();
    public void execute(String query);
    public void close();
}
