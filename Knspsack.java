import java.util.*;
import java .io.*;
import  java.util.Set;

public class Knspsack {

    public static double getMax(ItemValue arr[],int capacity){
Arrays.sort(arr,new Comparator<ItemValue>() {
    public int compare(ItemValue item1,ItemValue item2){
        double cpr1=Double.valueOf(item1.profit/item1.weight);
        double cpr2=Double.valueOf(item2.profit/item2.weight);
        if(cpr1<cpr2){
            return 1;
        } return -1;
    }
    
});
double totalValue=0;
for(ItemValue i: arr){
    int curwt=(int)i.weight;
    int currprft=(int)i.profit;
    if(capacity-curwt>=0){
        capacity=capacity-curwt;
        totalValue+=currprft;

    }else{
        double fraction=((double)capacity/(double)curwt);
        totalValue+=currprft*fraction;
        capacity =(int)(capacity-(curwt*fraction));
        break;

    }
} return totalValue;

    }
    static class ItemValue{
        int weight;
        int profit;
        ItemValue(int profit,int weight){
            this.weight=weight;
            this.profit=profit;

        }

    }

    public static void main(String[] args) {
       ItemValue v1=new ItemValue(25, 5);
       ItemValue v2=new ItemValue(75, 10);
       ItemValue v3=new ItemValue(100,12);
       ItemValue v4=new ItemValue(50, 4);
       ItemValue v5=new ItemValue(45, 7);
       ItemValue v6=new ItemValue(90, 9);
       ItemValue v7=new ItemValue(30, 3);
       ItemValue arr[]={v1,v2,v3,v4,v5,v6,v7};
       int capacity=37;
       double max=getMax(arr,capacity);
       System.out.println(max);
    }
    
}
