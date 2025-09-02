package Unit3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> pro = new ArrayList<>();
        System.out.println("Enter product");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            pro.add(sc.nextLine());
        }
        Collections.sort(pro);
        Iterator it = pro.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        pro.add(2, "truck");
        pro.add("open");
        System.out.println(pro);
    }
}
