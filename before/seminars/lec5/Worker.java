package seminars.lec5;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        String res = String.format("id:%d fn:%s ln:%s s:%d", id, firstName, lastName, salary);
        return res;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
}
