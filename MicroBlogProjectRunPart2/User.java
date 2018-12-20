package MicroblogProject;//from Lesson 91 of Udemy course, MicroBlog1


public class User {
    // define variables section

    private String avatarLink;
    private String firstNameLastName;
    private String userName;
    private String emailAdd;

    //constructor method
    public User(String avatarLink, String firstNameLastName, String userName, String emailAdd) {
        this.avatarLink = avatarLink;
        this.firstNameLastName = firstNameLastName;
        this.userName = userName;
        this.emailAdd = emailAdd;
    }
    //exposed
    public String getAvatarLink() {

        return avatarLink;
    }

    public String getUserName() {

        return userName;
    }
}
