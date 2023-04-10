public class ConvensaoDeTemperatura {
    public static void main(String[] args) {
        double celsius = 22.0;
        double farrenheit = (celsius * 1.8) + 32;
        System.out.println(String.format("A temperatura de %.1fºC é %.1fºF", celsius, farrenheit ));
    }
}
