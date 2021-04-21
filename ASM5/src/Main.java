public class Main {
    public static void main(String[] args) throws Exception {
        Person a = new Person();
        a.NewPerson("1.txt", "tuan", "linhdam", 1000);
        System.out.println(a.GetPerson("1.txt"));
    }
}
