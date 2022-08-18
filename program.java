public class program {
    private String location;
    private String object;
    private String object2;
    private String facts;
    private int counter;

    public void set_good_recycle(String object) {
        this.object = object;
    }

    public String get_good_recycle() {
        return object;
    }

    public void set_bad_recycle(String object2) {
        this.object2 = object2;
    }

    public String get_bad_recycle() {
        return object2;
    }

    public void setrecycledb(String location) {
        this.location = location;
    }

    public String getrecycledb() {
        return location;
    }

    public void intro() {
        System.out.println(
                "Welcome to the AIGHT portable trash machine. I will take care of your trash today.\nPlease insert your trash in any of the openings you see. Have a blessed day as you\nhave blessed the future of our environment :))\n\n");
    }

    public void help(String facts, int counter) {
        this.facts = facts;
        this.counter = counter;
        counter = 0;
        counter++;
        System.out.println("Fact " + counter++
                + ": Of the 40 million tons of plastic waste generated in the U.S. in 2021,\nonly 5% to 6% — or about two million tons — was recycled.\n");
        System.out.println("Fact " + counter++
                + ": Between 2019 and 2020, there was a 5.7% overall decrease in plastics\nrecovered for recycling in the U.S. That is the equivalent of 290 million pounds.\n");
        System.out.println("Fact " + counter++
                + ": Approximately 36% of all plastic produced is used to create packaging, 85% of which ends up in landfills.\n");
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("--This chart shows the biggest recycling in the world by rank-- \n");

        display d1 = new display();
        d1.dis();

        System.out.println("Take some time to check the chart out.\n\n");
        Thread.sleep(10000);

        program a = new program();
        a.help("", 1);

        program p = new program();
        p.intro();

        program p1 = new program();
        p1.set_good_recycle("Water bottle");
        System.out.println("--DISPENSING-->\t" + p1.get_good_recycle());

        decide c1 = new decide();
        c1.dec();

        program p2 = new program();
        p2.set_good_recycle("Soda can");
        System.out.println("--DISPENSING-->\t" + p2.get_good_recycle());

        decide c2 = new decide();
        c2.dec();

        program p3 = new program();
        p3.set_good_recycle("Newspaper");
        System.out.println("--DISPENSING-->\t" + p3.get_good_recycle());

        decide c3 = new decide();
        c3.dec();

        program p4 = new program();
        p4.set_bad_recycle("Flower pot");
        System.out.println("--DISPENSING-->\t" + p4.get_bad_recycle());

        decide c4 = new decide();
        c4.dec();

        program p5 = new program();
        p5.set_bad_recycle("Bubble wrap");
        System.out.println("--DISPENSING-->\t" + p5.get_bad_recycle());

        decide c5 = new decide();
        c5.dec();

        program p6 = new program();
        p6.set_bad_recycle("Synthetic oil");
        System.out.println("--DISPENSING-->\t" + p6.get_bad_recycle());

        decide c6 = new decide();
        c6.dec();

    }
}
