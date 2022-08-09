package CO4;
class bubblesort <T extends Comparable<? super T>>{
    T[] a;
    bubblesort(T[] a){
        this.a=a;
    }
    void display(){
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    void sort(){
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if((a[i]).compareTo((a[j]))>0){
                    T x=a[i];
                    a[i]=a[j];
                    a[j]=x;
                }
            }
        }
    }  
    }
public class pg_9 {
    public static void main(String[] args) {
        Integer[] a ={4,8,6,8,5,3,5,9,7};
        bubblesort<Integer> b=new bubblesort(a);
        b.sort();
        b.display();
    }
}
