import org.omg.Messaging.SyncScopeHelper;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class DynamicArray {

    //insertAt +
    //insertBack +
    //insertFront +
    //removeAt +
    //removeFront +
    //removeBack +
    //pop from last -
    //At -
    //extendArray +
    int[] array = new int[10];
    int size,index;

    //Constructor
    public DynamicArray() {
        System.out.println("Dynamic array is created");
        index = 0;
    }
    //insertBack
    void insertBack(int value) {
       if (this.index == size) {
           extendArray();
        }
        array[this.index++]=value;
    }
    //insertAt
    void insertAt(int b, int value) {
       if (this.index == size) {
           extendArray();
        }
        //System.out.println("array içi"); for(int k=0; k<array.length; k++){ System.out.println( array[k] + " - sayısı array'in  " + k +". elementidir" ); }
        //sağa kaydırmak için oluşturulan base array
        int[] xarray = array;
        //array değerleri bir sağa kaydır
        for(int i=(array.length-2); i>=b; i-- ){
            array[i+1] = xarray[i];
         }
        this.array[b]=value;
        index++;
        //System.out.println("güncel array içi"); for(int k=0; k<array.length; k++){ System.out.println( array[k] + " - sayısı array'in  " + k +". elementidir" ); }
    }

    //extendArray
    void extendArray(){
        array = Arrays.copyOf(array, array.length *2 );

    }

    void insertFront(int value) {
        int[] xarray = array;
        //array değerleri bir sağa kaydır
        for(int i=(array.length-2); i>=0; i-- ){
            array[i+1] = xarray[i];
        }
        this.array[0]=value;
        index++;
    }
    void removeAt(int b) {

        int[] xarray = array;
        //array değerleri bir sola kaydır
        for(int i=b; i<=(array.length-2); i++ ){
            array[i] = xarray[i+1];
        }
        index--;
    }

    void removeFront() {
        int[] xarray = array;
        //array değerleri bir sola kaydır
        for(int i=0; i<=(array.length-2); i++ ){
            array[i] = xarray[i+1];
        }
        index--;
    }

    void removeBack() {

        int[] xarray = array;
        //array değerleri bir sağa kaydır
        for(int i= (array.length-2); i<=(array.length-2); i++ ){
            array[i] = xarray[i+1];
        }
        index--;

    }

    int pop() {
        return 0;
    }

    int At(int index) {
        return 0;
    }


    void printarray(){
        for(int i=0; i<this.index; i++){
            System.out.println(array[i]);
        }
    }

    void printsize(){
        System.out.println("Array'in uzunluğu: " +array.length);
    }

}
