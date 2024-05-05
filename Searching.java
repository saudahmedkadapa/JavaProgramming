public class Searching {
    public static void main(String[] args) {
        String str = "Umbrella";
        char cArray[] = str.toCharArray();
        Boolean per = false;
        for (int i = 0; i < cArray.length; i++) {
            if (cArray[i] == 'e') {
                per = true;
                break;
            }
        }
        System.out.println(per);
    }

}
