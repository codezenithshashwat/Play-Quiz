import java.util.*;

public class QuestionSerivce {
    Question[] question = new Question[5];
    String[] selection = new String[5];
    int score=0;
    // Hard coded questions
    public QuestionSerivce() {

        question[0] = new Question(1, "what laguage found in 1985", "java", "cpp", "python", "javascript", "a");
        question[1] = new Question(2, "Who developed the C programming language?", "Dennis Ritchie", "James Gosling",
                "Bjarne Stroustrup", "Guido van Rossum", "a");

        question[2] = new Question(3, "Which language is mainly used for AI development?", "C", "Java", "Python",
                "Swift", "c");

        question[3] = new Question(4, "What year was JavaScript created?", "1991", "1995", "2000", "1989", "b");

        question[4] = new Question(5, "Which of the following is a backend framework?", "React", "Vue", "Django",
                "Bootstrap", "Django");

    }

    public void playquiz() {
        int i = 0;
        for (Question q : question) {
           
            System.out.println("Question Id : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println();
            System.out.println("(a) " + q.getA());
            System.out.println("(b) " + q.getB());
            System.out.println("(c) " + q.getC());
            System.out.println("(d) " + q.getD());
            System.out.println();
            Scanner sc = new Scanner(System.in);
            selection[i++] = sc.nextLine();
            System.out.println();
            System.out.println();
        }
        System.out.println("Your given answers are: ");
        System.out.println();
        for (String s : selection) {
            System.out.println(s);
        }
    
    }
    
    public void calculate_score(){
       
        for(int i=0; i<question.length; i++){
        Question que= question[i];
        String answer= que.getAnswer();

        String userinput= selection[i];
        if(answer.equals(userinput)){
            score++;
        }
        }
        System.out.println("Score: "+ score);
    }

    // public void playquiz(){
    // for(Question q: question){
    // System.out.println("Question");
    // }

    // }

    // public void displayanswer(){
    // Scanner sc= new Scanner(System.in);
    // System.out.println("Enter the Question id to get the correct Answer");
    // int id= sc.nextInt();

    // boolean found=false;

    // for(Question q: question){
    // if(q.getId()== id){
    // System.out.println("Answer: "+ q.getAnswer());
    // found=true;
    // break;
    // }
    // }

    // if (found!=true){
    // System.out.println("Invalid Question ID");
    // }
    // }
}
