public class MadLibs {
    /*
    This program generates a mad libbed story.
    Author: Miguel Lorenzo
    Date: 03/04/2024
    */
    public static void main(String[] args){
        String name1 = "Miguel";
        String name2 = "Diego";
        String adjective1 = "good";
        String adjective2 = "nice";
        String adjective3 = "hard";
        String verb1 = "play";
        String noun1 = "food";
        String noun2 = "table";
        String noun3 = "car";
        String noun4 = "phone";
        String noun5 = "mouse";
        String noun6 = "window";
        int number = 10;
        String place1 = "Lima";


        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}
