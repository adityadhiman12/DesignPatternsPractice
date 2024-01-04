package solution1WithCompositeDesign;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory1 = new Directory("Movie");
        File border1 = new File("border");
        movieDirectory1.add(border1);

        Directory comedyDirectory1 = new Directory("Comedy movie");
        File hulchul1 = new File("hulchul");
        comedyDirectory1.add(hulchul1);
        movieDirectory1.add(comedyDirectory1);
        movieDirectory1.ls();

    }
}
