package burns.chris.Initialization;


public class Initialization {
    public static void main(String[] args) {

        ColorfulThing blue = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing green = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing red = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing yellow = new ColorfulThing(ColorfulThing.Color.YELLOW);
        ColorfulThing orange = new ColorfulThing(ColorfulThing.Color.ORANGE);

        blue.getColor();
        green.getColor();
        red.getColor();
        yellow.getColor();
        orange.getColor();



        BoringThing Boring1 = new BoringThing();
        BoringThing Boring2 = new BoringThing();
        BoringThing Boring3 = new BoringThing();
        BoringThing Boring4 = new BoringThing();
        BoringThing Boring5 = new BoringThing();



        System.out.println(blue.getColor());
        System.out.println(green.getColor());
        System.out.println(red.getColor());
        System.out.println(yellow.getColor());
        System.out.println(orange.getColor());
    }

}
