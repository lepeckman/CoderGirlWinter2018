package MicroblogProject;

import MicroblogProject.Post;
import MicroblogProject.User;

import java.util.Scanner;

import static java.lang.System.out;

public class Menu {
    Scanner keyboard = new Scanner(System.in);
    //initialize an array of users

    //Stackoverflow example: https://stackoverflow.com/questions/10400373/add-an-object-to-an-array-of-a-custom-class
    //ArrayList creates a List
    //List<MicroblogProject.User> UserArray = new ArrayList<>();

    //UserArray.add(); we haven't actually CREATED and SAVED our new user yet, we've only printed their info

    //initialize an array of posts
    Post[] PostArray = new Post[50];

    User[] UserArray = new User[50];
    User selectedUser;

    //we're going to assign each printed userName a number, in order to pick by username


    public void printAllUsers() {

        for (int counter = 0; counter < this.UserArray.length; counter++) {
            User currentUser = this.UserArray[counter];
            if (currentUser != null) {
                int userNumber = counter + 1;
                out.print(userNumber + " = ");
                out.println(" ");
                System.out.println(currentUser.getUserName());
                out.println(" ");
            }
        }
        out.println(" ");
    }

    public void selectUser() {
        this.printAllUsers();
        out.println("Type in the number associated with the user you'd like to be. ");
        out.println(" ");

        int selectedUserIndex = (this.keyboard.nextInt()) - 1;
        this.selectedUser = UserArray[selectedUserIndex];

        out.println("You are now signed in as: " + selectedUser.getUserName());
        out.println(" ");
    }


    //method
    public void initializeUsers() {

        User sadTroll1 = new User("www.tearyface.com ", "Grumpy McSadTroll ", "sadTroll1 ", "sadtroll1@trollworx.com ");
        this.addUser(sadTroll1);
        //UserArray[0] = sadTroll1; a previous try
        //UserArray.add(sadTroll1);
        User jollyTrollToo = new User("www.giggleface.com", "Giggly O'SillyTroll ", "jollyTrollToo ", "jollytrolltoo@trollworx.com ");
        this.addUser(jollyTrollToo);
        //UserArray[1] = jollyTrollToo;
        //UserArray.add(jollyTrollToo);
        User sassyTroll3 = new User("www.flirtyface.com", "Sassy Von Sasserton ", "sassyTroll3 ", "sassyTroll3@trollworx.com ");
        this.addUser(sassyTroll3);
        //UserArray[2] = sassyTroll3;
        //UserArray.add(sassyTroll3);
    }

    public void addPost(Post nextPost) {
        int position = nextPosition;
        //incrementing:
        nextPosition++;
        PostArray[position] = nextPost;

    }

    //method
    public void initializePost() {

        Post trollSad = new Post("sadTroll1", "This troll is sad. ", "www.sadtroll1.com ");
        this.addPost(trollSad);
        Post trollJolly = new Post("jollyTrollToo", "This troll is jolly. ", "www.jollytrolltoo.com ");
        this.addPost(trollJolly);
        Post trollSassy = new Post("sassyTroll3", "This troll is sassy. ", "www.sassytroll3.com ");
        this.addPost(trollSassy);
        Post trollJolly2 = new Post("JollyTrollToo", "This troll is still quite jolly. ", "www.jollytrolltoo.com ");
        this.addPost(trollJolly2);
        Post trollJolly3 = new Post("JollyTrollToo", "This troll is considerable stable in jolliness. ", "www.jollytrolltoo.com ");
        this.addPost(trollJolly3);
    }


    private static int nextPosition = 0;

    public void printAllPosts() {

        for (int counter = 0; counter < this.PostArray.length; counter++) {
            Post currentPost = this.PostArray[counter];
            if (currentPost != null) {
                int postNumber = counter + 1;
                out.print(postNumber + " = ");
                out.println(" ");
                System.out.println(currentPost.getNameAndContent());
                out.println(" ");
            }
        }
        out.println("What would you like to do next?");
        out.println(" ");
        out.println(" ");
    }

   public void createPost() {
        out.println("Let's make extra sure you're signed in as a User. ");
        this.selectUser();
        //---need to change how selectUser works so we don't get stuck in a loop
        //GETTER, don't forget the getter
        /*out.println("Hello, " + selectedUser.getUserName() + ".");
        out.println(selectedUser.getUserName() + ", what's your website, so we can provide a link in your post?");
        String newWebLink = this.keyboard.nextLine();*/


       out.println("Hello, " + selectedUser.getUserName() + ".");
       out.println(selectedUser.getUserName() + ", what's your website, so we can provide a link in your post?");
       String newWebLink = this.keyboard.nextLine();
       keyboard.nextLine(); //add to swallow EOL, whatever that is
       if (newWebLink.equals(" ")) {

       }
       out.println("Now that you're signed in, please type what you'd like your post to say.");
       out.println("Post content here:");
       String newContent= this.keyboard.nextLine();
       if (newContent.equals(" ")) {

       }
        /*out.println("Now that you're signed in, please type what you'd like your post to say.");
        out.println("Post content here:");
        out.println(" ");
        String newContent = this.keyboard.nextLine();
        out.println(" ");*/
        out.println("Thank you, " + selectedUser.getUserName() + ".");

        out.println(" ");

        Post createdPost = new Post(selectedUser.getUserName(), newContent, newWebLink);
        //System.out.println(currentPost.getNameAndContent());
        this.addPost(createdPost);
        //getter
       System.out.println(createdPost.getNameAndContent());
       out.println(" ");

       out.println("What would you like to do next?");
       out.println(" ");
       out.println(" ");
    }

    //method
    public void addUser(User nextUser) {
        int position = nextPosition;
        //incrementing:
        nextPosition++;
        UserArray[position] = nextUser;

    }

    public void createUser() {

        out.println("Please enter your avatar link. ");
        Scanner keyboard = new Scanner(System.in);
        String avatarLinkPart2 = keyboard.nextLine();
        if (avatarLinkPart2.equals(" ")) {

        }
        out.println("Please enter your first and last names. ");
        String firstNameLastNamePart2 = keyboard.nextLine();
        if (firstNameLastNamePart2.equals(" ")) {

        }
        out.println("Please enter your new user name to become a new user. ");
        String userNamePart2 = keyboard.nextLine();
        if (userNamePart2.equals(" ")) {

        }
        out.println("Please enter your email address. ");
        String emailAddPart2 = keyboard.nextLine();
        if (emailAddPart2.equals(" ")) {

        }
        out.println("Thank you, " + userNamePart2 + ".");
        out.println("What would you like to do next?");
        out.println(" ");


        //wireframe, delete later
        //out.println(Arrays.toString(UserArray));

        //from Quora https://www.quora.com/How-can-I-print-an-ArrayList-of-an-ArrayList-in-Java
        //for (int counter = 0; counter < UserArray.length(); counter++) {
        //  System.out.println(UserArray.get(counter));
        User createdUser = new User(avatarLinkPart2, firstNameLastNamePart2, userNamePart2, emailAddPart2);
        this.addUser(createdUser);
    }


    public void printFiveChoices() {
        out.println("Select from these Five Options: ");
        out.println("1. Create a new user");
        out.println("2. Become an existing user");
        out.println("3. Create a post as the current user");
        out.println("4. Print all posts");
        out.println("5. Print all users");
        out.println(" ");
        out.println("Type a number to make your selection. ");
    }


    //orchestrator
    public void openMenu() {

        this.initializeUsers();
        this.initializePost();

//Receive input from user

        this.printFiveChoices();


        boolean keepPickin = true;
        int userSelect = 0;
        String  userYN;
        while (keepPickin) {
            userSelect = this.keyboard.nextInt();


            if (userSelect == 1) {
//move the kickoff here, add question to user to input another number choice prompt
                this.createUser();

            } else if (userSelect == 2) {
                this.selectUser();
                out.println("What would you like to do next?");

            } else if (userSelect == 3) {
                this.createPost();

            } else if (userSelect == 4) {
                this.printAllPosts();

            } else if (userSelect == 5) {
                this.printAllUsers();

            } else {



                /*out.println("Would you like to keep going / make another choice? Type Y or N.");
                userYN = this.keyboard.nextLine();
                    if (userYN.equals("Y")) {
                        this.printFiveChoices();
                    }
                        else if (userYN.equals("y")) {
                        this.printFiveChoices();
                    }
                        else {
                        out.println(" ");
                        out.println("Ok, bye! ");
                    }*/
            }
            this.printFiveChoices();
        }
    }
}
