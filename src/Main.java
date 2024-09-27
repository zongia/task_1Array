import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random s =new Random();

        int[] list=new int[100];

        int[] list_kopya=new int[100];

        int op=0;



        while(op<list.length)
        {

            int sayı=s.nextInt(1000);


            for(int i=0;i<list.length;i++)
            {
                if(list[i]==sayı) {	}
                else
                {	list[op]=sayı;op++;
                }

            }
        }




        for(int y=0;y<list.length;y++) {
            list_kopya[y]=list[y];
        }
        int p=s.nextInt(100);
        list_kopya[p]=-1;


        for(int y=0;y<list.length;y++)
        {
            if(list[y]==list_kopya[y]) {}
            else
            {

                System.out.println("eksik olan elaman  =="+(y+1) );//index değil kaçıncı sayı oldunu yazdım
                break;

            }



        }










    }
}