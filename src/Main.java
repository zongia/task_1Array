import java.util.ArrayList;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random s =new Random();
        ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList();






        int op=0;



        while(op<100)
        {

            int sayi=s.nextInt(1000);
            list.add(sayi);
            op++;




        }
        list1.addAll(list);
        int sayi=s.nextInt(list.size());
        list1.remove(sayi);







        for(int y=0;y<list.size();y++)
        {
            if(list.get(y)==list1.get(y)) {}
            else
            {

                System.out.println("eksik olan elaman 2 =="+(y+1) );//index değil kaçıncı sayı oldunu yazdım
                System.out.println("eksik olan sayı "+list.get(y));
                break;

            }



        }










    }
}