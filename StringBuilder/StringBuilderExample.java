package StringBuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("My name is : ");
        stringBuilder.append("");
        stringBuilder.append("");
        String resultStringBuilder = stringBuilder.toString();

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("My name is :");
        stringBuffer.append("");
        stringBuffer.append("");
        String resultStringBuffer = stringBuffer.toString();

        System.out.println("STRING BUILDER : " + resultStringBuilder);
        System.out.println("STRING BUFFER : " + resultStringBuffer);
    }
}
