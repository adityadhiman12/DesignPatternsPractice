package problemStatement;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Action");
        File file = new File("border");
        movieDirectory.add(file);

        Directory comedyDirectory = new Directory("Comedy movie");
        File hulchul = new  File("hulchul");
        comedyDirectory.add(hulchul);
        movieDirectory.add(comedyDirectory);
        movieDirectory.ls();
    }
}
