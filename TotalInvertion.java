import java.util.Arrays;

public class TotalInvertion {
static int count =0;
    public static int insertion(int a[],int l,int mid,int h){
int swap=0;
int lsubarray[]=Arrays.copyOfRange(a, l,mid+1);
int rsubarray[]=Arrays.copyOfRange(a, mid+1,h+1);

int i=0;int j=0,k=l;
while(i<lsubarray.length&&j<rsubarray.length){
    if(lsubarray[i]<=rsubarray[j]){
      a[k++]=lsubarray[i++];
      
    }else{
      a[k++]=rsubarray[j++];
      swap+=mid+1-(l+i);
    }
} while(i<lsubarray.length){
  a[k++]=lsubarray[i++];
}
while(j<rsubarray.length){
  a[k++]=rsubarray[j++];
} return swap;

    }
    public static int divide(int a[],int l,int h){
        int count=0;
        if(l<h){
            int mid=l+(h-l)/2;
      count+= divide(a,l,mid);
     count+=divide(a,mid+1,h);
   count+= insertion(a,l,mid,h);
   
     } return count;
    }
    public static void main(String[] args) {
        int []a={10,9,18,15,21,5};
        int h=a.length-1;
        int l=0;
        int result=divide(a,l,h);
System.out.println(result);
    }
    
}
