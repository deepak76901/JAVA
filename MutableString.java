public class MutableString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer ("Deepak");
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());

        System.out.println(sb.indexOf("p"));
        sb.deleteCharAt(3);
        sb.insert(3 , "P");
        String s1 = " Baghel";
        System.out.println(sb.reverse());
        // System.out.println(sb.toString());
        System.out.println(sb.reverse());
        System.out.println(sb.append(s1));
        System.out.println(sb.length());
        sb.setLength(6);
        System.out.println(sb);
        }
}
