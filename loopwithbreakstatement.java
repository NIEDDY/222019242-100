public class loopwithbreakstatement{
    public static void main(String[] args) {
        String[] provinces = {"Kigali City", "Northern Province", "Southern Province", "Eastern Province", "Western Province"};

        int i = 0;
        while (i < provinces.length) {
            System.out.println("Province: " + provinces[i]);
            i++;

        
            if (i == 1) {
                break;
            }
        }
    }
}
