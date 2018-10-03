public class App {
    public static void main(String[] args) {
        PostIt orange = new PostIt("orange", "Idea 1", "blue");
        PostIt pink = new PostIt("pink", "Awesome", "black");
        PostIt yellow = new PostIt("yellow", "Superb!", "green");

        System.out.println(orange.backgroundColor);
        System.out.println(orange.text);
        System.out.println(orange.textColor);

        BlogPost newPost = new BlogPost();



    }
}
