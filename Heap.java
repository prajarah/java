public class Heap {
    public static void swap(int []a,int i,int j){
       
        if(a[i]>a[j]){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }

    }
    public static void print(int []a,int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }System.out.println();

    }public static void heapify(int []a,int n,int i){
           int parent=(i-1)/2;
           if (a[parent]>=0){
            if(a[i]>a[parent]){
                swap(a,i,parent);
                heapify(a,n, parent);
            }
           }
    }
    public static int insret(int []a,int n,int value){
        n++;
        a[n-1]=value;
        heapify(a, n, n-1);
        return n;

    } public static int delete(int a[],int n,int del){
      int i;
        int temp;
       for( i=0;i<a.length-1;i++){
        if(a[i]==del)
        break;
       }
        temp=a[n-1];
        a[i]=temp;
        a[n-1]=del;
        n--;
        while(i<(n-1)/2){
            if(a[2*i+1]>a[2*i+2]){
        heapify(a, n, 2*i+1);
    i=2*i+1;}
        else if(a[2*i+2]>a[2*i+1]){
        heapify(a, n, 2*i+2);
 i=2*i+2;}
   
        }
return n;
    }
    
    
    public static void main(String []args){
int max=100;
int []a=new int[100];
a[0]=100;
a[1]=70;
a[2]=60;
a[3]=40;
a[4]=50;
int n=5;
System.out.println("before insert, heap elements are :");
print(a, n);
int value1=188;
n=insret(a, n, value1);
int value2=23;
n=insret(a, n, value2);
System.out.println("after insert, heap elements are: ");
print(a, n);
n=delete(a, n, 23);

System.out.println("after delete, heap elements are: ");
print(a, n);
    }
}
