public class ChapterTenPartTwo extends ChapterTen{
    static int rand;

    static {
        rand = (int)(Math.random() * 6);
        System.out.println("static block " + rand);
    }

   public ChapterTenPartTwo() {
        System.out.println("constructor");
    }

    public static void main(String [] args) {
        System.out.println("in main");
        ChapterTenPartTwo st = new ChapterTenPartTwo();
    }

}


