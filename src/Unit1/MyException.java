package Unit1;

import java.io.DataInputStream;

public class MyException {
    public static void main(String[] args)throws Exception {
        int x, y, z=0;
        DataInputStream dis = new DataInputStream(System.in);
        x = dis.readInt();
        y = dis.readInt();
        z=x/y;
        System.out.println(z);
//      Scanner sc = new Scanner(System.in);
//        try{
//            x = sc.nextInt();
//            y = sc.nextInt();
//            z = x/y;
//            System.out.println("Exception does not occur");
//        }
//        catch(ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
//        catch(InputMismatchException e){
//            System.out.println(e);
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//        finally{
//            System.out.println("Result is : "+z);
//        }
      }
}
