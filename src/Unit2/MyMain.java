package Unit2;

public class MyMain {
    public static void main(String[] args) {
        Threading thi = new Threading();
        Thread2 th2 = new Thread2();
        thi.start();
        th2.start();
//        System.out.println(thi.getName());
//        thi.setName("KIET_Thread");
//        System.out.println(thi.getName());
//        System.out.println(thi.getPriority());
//        thi.setPriority(9);
//        System.out.println(thi.getPriority());
    }
}
