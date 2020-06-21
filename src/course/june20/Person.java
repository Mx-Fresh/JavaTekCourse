package course.june20;

public class Person {
    private String name;
    private int age;
    private String job;
    private boolean aBoolean;

    public Person(String name, int age, String job, boolean aBoolean) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.aBoolean = aBoolean;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", aBoolean=" + aBoolean +
                '}';
    }
}
