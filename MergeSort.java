



public class MergeSort {
public static void mergeProcedure(int a[],int i,int mid,int j){
    int n1=mid-i+1;
    int n2=j-mid;
    int []sa1=new int[n1];
    int []sa2=new int[n2];

    for(int k=0;k<n1;k++){
        sa1[k]=a[i+k];

    }
    for(int k=0;k<n2;k++){
        sa2[k]=a[mid+1+k];
    }
    int s=0;
    int t=0;
    int k=i;
    while(s<n1&&t<n2){
     if(sa1[s]<=sa2[t]){
        a[k]=sa1[s];
        s++;
     }else{
        a[k]=sa2[t];
        t++;
     }k++;
     
    }while(s<n1){
        a[k]=sa1[s];
        s++;
       k++;
        
     }
     while(t<n2){
        a[k]=sa2[t];
        t++;
       k++;
        
     }

}


    public static void sortArr(int []a,int i,int j){
        
        
        if(i<j){
            int mid=(i+j)/2;
        
            sortArr(a,i,mid);
            sortArr(a,mid+1,j);
           // mergeProcedure(a,i,mid,j);

        }
        
    } public static void print(int []a){
        for(int x:a){
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        
        int a[]={10,9,18,15,21};
        int i=0;
        int j=a.length-1;
        System.out.println("before sorting");
        print(a);
        sortArr(a,i,j);
        System.out.println("after sorting");
        
        print(a);
    }

}
