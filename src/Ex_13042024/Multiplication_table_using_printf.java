package Ex_13042024;

public class Multiplication_table_using_printf {

        public static void main(String[] args) {
            int number = 9;
            System.out.printf("Multiplication table of %d in is : \n",number);
            for (int i = 1; i <=10 ; i++) {
                System.out.printf("%d x %d = %d\n",number,i,(number*i));

            }
        }
    }

