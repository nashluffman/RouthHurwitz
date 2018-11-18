public class UserInput {
    public static void main(String[] args) {
        double systemOrder, i;
        TextIO.putln("Please input the order of the system");
        systemOrder = TextIO.getDouble();
        i = 0;
        while (i<systemOrder) {
            TextIO.putln("Please input the " + i + "th coefficient");
            i++;
        }

    }
}
