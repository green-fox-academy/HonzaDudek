import java.util.Scanner;

public class BlogPost {
    String author;
    String title;
    String text;
    String publicationDate;

    public BlogPost() {
        createBlogPost();
    }

    public void createBlogPost(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, provide the author:");
        author = scanner.nextLine();
        System.out.println("Please provide a title:");
        title = scanner.nextLine();
        System.out.println("Enter text of the blog post:");
        text = scanner.nextLine();
        System.out.println("Enter publication date:");
        publicationDate = scanner.nextLine();
    }
}
