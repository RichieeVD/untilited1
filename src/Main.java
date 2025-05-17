public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        var friend = 19;

        System.out.println("friend " + friend);

        friend = friend + 2;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("friend " + friend);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        friend = friend / 7;

        System.out.println("friend " + friend);
        System.out.println("dog " + dog);
        System.out.println("cat " + cat);
        System.out.println("paper " + paper);
    }
}