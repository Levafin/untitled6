public class Task2 {

    //2. Составить процедуру, "рисующую" на экране горизонтальную линию из любого
    //   числа символов "*".
    public static void main(String[] args) {
        printLinesToLine(30);
    }
        public static void printLinesToLine(int count) {
        if(count > 0) {
            count--;
            System.out.printf("*" + " ");
            printLinesToLine(count);
        }
        }
}
