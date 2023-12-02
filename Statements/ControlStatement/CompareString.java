package Statements.ControlStatement;

public class CompareString {
    public static void main(String[] args) {

        String appNameObj = new String("tiktok");
        String appName2Obj = new String("tiktok");

        String appNameEqualIgnorecase = new String("Tiktok");
        String appName2EqualIgnorecase = new String("tiktok");

        String appName = "facebook";
        String appName2 = "facebook";

        if (appName == appName2) {
            System.out.println("Equal");
        } else {
            System.out.println("not Equal");
        }

        if (appNameObj.equals(appName2Obj)) {
            System.out.println("Equal");
        } else {
            System.out.println("not Equal");
        }

        if (appNameEqualIgnorecase.equalsIgnoreCase(appName2EqualIgnorecase)) {
            System.out.println("Equal");
        } else {
            System.out.println("not Equal");
        }
    }
}
