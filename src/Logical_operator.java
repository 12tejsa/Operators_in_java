public class Logical_operator {
    public static void main(String[] args) {
        int p = 23,k=232;

        System.out.println("&& OPEARATOR AND AND ");
        System.out.println((p>k )&&(k<p));
        System.out.println((p<k)&&(k>p));
        // || or operator
        System.out.println("Or operator");
        System.out.println((p<k)||(k>p));
        System.out.println((p>k )||(k<p));
        System.out.println((p<k)||(k>p));
        // not operator
        System.out.println("NOT Operator");
        System.out.println(!(p>k ));
        System.out.println(!(p<k));
        System.out.println(!(p>k ));
        System.out.println(!(p<k));
    }
}
