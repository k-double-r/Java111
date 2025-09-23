package Unit2;

public class MyMain {
    public static void main(String[] args) {
        Threading thi = new Threading();
        thi.start();
        System.out.println(thi.getName());
        thi.setName("KIET Thread");
        System.out.println(thi.getName());
        System.out.println(thi.getPriority());
        thi.setPriority(9);
        System.out.println(thi.getPriority());
    }
}
