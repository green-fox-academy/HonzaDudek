public class example02 {
    public static void main(String[] args) {

        // Solution one
        String url = "https//www.reddit.com/r/nevertellmethebots";
        // Splitting url into substrings and concatenating them with the extra character
        String urlNew = url.substring(0,5) + ":" + url.substring(5, url.length());
        url = urlNew;
        // Replacing the wrong words
        urlNew = url.replace("bots", "odds");
        url = urlNew;

        System.out.println(url);
    }
}
