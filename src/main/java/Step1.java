import java.util.Scanner;




public class Step1 {
        public static void main(String[] args) {

            //deneme deneme = new deneme();
            DynamicArray dynamicarray =  new DynamicArray();
            dynamicarray.insertBack(65);
            dynamicarray.insertBack(22);
            dynamicarray.insertBack(94);
            dynamicarray.insertBack(79);
            dynamicarray.insertAt(2, 45);
            dynamicarray.removeAt(1);
            dynamicarray.insertFront(99);
            dynamicarray.removeBack();
            dynamicarray.printsize();
            dynamicarray.printarray();

        }
}
