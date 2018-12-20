package MicroblogProject;//from Lesson 91 of Udemy course, MicroBlog1
import java.util.ArrayList;

public class Post {

    //a post will show (defining variables section)
    private String userName;
    private int orderNumber;
    private static int nextOrderNumber = 1;
    private String content;
    private String webLink;

    //constructor method
    public Post(String userName, String content, String webLink) {
        this.userName = userName;
        this.content = content;
        this.webLink = webLink;
        this.orderNumber = nextOrderNumber;
        //incrementing:
        nextOrderNumber++;
    }

    public String getNameAndContent() {

        return userName + " wrote: " + content;

    }

    public String getContent() {

        return content;
    }

}
