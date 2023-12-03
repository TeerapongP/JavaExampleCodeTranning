package Abstraction.model;

import java.math.BigDecimal;

public class Phone {

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    private String brand;

    private String model;

    private String cpu;

    private String camera;

    private Integer battery;

    private BigDecimal price;

    public void open() {
        System.out.println("Open  : " + brand);
    }

    public void setting(String attribute) {
        System.out.println("Setting   : " + attribute);
    }

    public void call(String type, String destination) {
        System.out.println("CALL   : " + type + " TO : " + destination);
    }

    public void takeAPhoto(String photo) {
        System.out.println("Get Photo   : " + photo);
    }

    public void recordAVideo(String video) {
        System.out.println("recording : " + video);
    }

}