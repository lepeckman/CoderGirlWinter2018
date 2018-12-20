package MicroblogProject;//class on 2018.10.03 from Lesson 91 of Udemy course
import MicroblogProject.Post;
import MicroblogProject.User;


//primary task is to work through the syntax of how to create classes,
//and define the data that they hold

public class MicroblogPart1 {
    //why doesn't it let me copy & paste? why doesn't it recognize a class within a class?

    public static void main(String[] args) {
        User sadTroll1 = new User("www.tearyface.com ", "Grumpy McSadTroll ", "sadTroll1 ", "sadtroll1@trollworx.com ");
        User jollyTrollToo = new User("www.giggleface.com", "Giggly O'SillyTroll ", "jollyTrollToo ", "jollytrolltoo@trollworx.com ");
        User sassyTroll3 = new User("www.flirtyface.com", "Sassy Von Sasserton ", "sassyTroll3 ", "sassyTroll3@trollworx.com ");
        System.out.println(sadTroll1.getAvatarLink());
        System.out.println(jollyTrollToo.getAvatarLink());
        System.out.println(sassyTroll3.getAvatarLink());

        Post trollSad = new Post("sadTroll1", "This troll is sad. ", "www.sadtroll1.com ");
        Post trollJolly = new Post("jollyTrollToo", "This troll is jolly. ", "www.jollytrolltoo.com ");
        Post trollSassy = new Post("sassyTroll3", "This troll is sassy. ", "www.sassytroll3.com ");
        Post trollJolly2 = new Post("JollyTrollToo", "This troll is still quite jolly. ", "www.jollytrolltoo.com ");
        Post trollJolly3 = new Post("JollyTrollToo", "This troll is considerably stable in jolliness. ", "www.jollytrolltoo.com ");
       //the function call returns the string that's wanted
        System.out.println(trollSad.getNameAndContent());
        System.out.println(trollJolly.getNameAndContent());
        System.out.println(trollSassy.getNameAndContent());
        System.out.println(trollJolly2.getNameAndContent());
        System.out.println(trollJolly3.getNameAndContent());
    }
}
