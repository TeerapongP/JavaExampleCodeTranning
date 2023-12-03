package ss;

import ss.model.Phone;

public class Main {
    
    public static void main(String[] args){
        // new iphone
        Phone iphone = new Phone("IPhone", "15 Pro max");
        // iphone call line to whatxxxxxxx
        iphone.call("Line","whatxxxxxxx");
        // iphone take photo Cloud 
        iphone.takeAPhoto("Cloud.png");
    
        // new Samsung
        Phone samsungS23 = new Phone("Samsung", "S23");
        // Samsung call Telephone to whatxxxxxxx
        samsungS23.call("Telephone","089xxxxxx45");
        // iphone take photo Mountain 
        samsungS23.takeAPhoto("Mountain.png");
    
    }

}
