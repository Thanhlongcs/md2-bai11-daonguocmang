import java.util.Stack;

public class Main {
    public static void main(String[] args) {

//        YÊU CẦU 1: Đảo ngược phần tử trong mảng số nguyên sử dụng Stack
//        B1. Khởi tạo một Stack rỗng, có kiểu số.
        Stack<Integer> stack = new Stack<>();

//        B2: Khoi tao 1 mang so nguyen bat ki
        int[] array = {21, 06, 02, 01, 12, 97} ;

//        B3. Với n phần tử của mảng, lần lượt đưa vào Stack thông qua hàm Push: Push a[i] into Stack.
        for(int i = 0; i<array.length; i++){
            stack.push(array[i]);
        }

//        Stack sau khi dc them: 97  12  01  02  06  21

//        B4. Lần lượt lấy ra từ Stack n phần tử và đưa vào trở lại mảng ban đầu:
        for(int i = 0; i<array.length; i++){
            array[i] = stack.pop();
        }
//       B5: Sử dụng vòng lặp for each để in ra mảng đã dc đảo ngược
        System.out.println("Array sau khi dao nguoc: ");
        for (int integer: array) {
            System.out.println(integer);
        }
//        Array sau khi duoc gan cac phan tu lay ra tu  stack  :  97  12  01  02  06  21

//        YÊU CẦU 2: Đảo ngược chuỗi sử dụng Stack - cũng tương tụ wnhue đảo ngược một mảng số nguyên
//        B1. Tạo một wStack rỗng.
        Stack wStack = new Stack<>();

//        B2: Tao ra 1 string rong va string ban dau
        String newString = "";
        String string = "Hello";

//        B3. Với mỗi từ mWord đọc được từ string, đưa từ đó vào wStack: Push mWord vào wStack.
        for(int i = 0; i < string.length(); i++){
            // Sử dụng hàm string.charAt(i) để lấy ra kí tự thứ i của string hello
            wStack.push(string.charAt(i));
        }

        //      B4: Sử dụng phg thức pop để lần lượt lấy ra từng phần tử trông stack và gán lại cho string ban đầu.
        for(int i = 0; i < string.length(); i++) {
            newString += wStack.pop();
        }
        System.out.println("String sau khi dao nguoc: " + newString);
    }
}