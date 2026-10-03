public class equality {
    public static void main(String[] args) {
        String s1 = "Utkarsh";
        String s2 = new String("Utkarsh");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
