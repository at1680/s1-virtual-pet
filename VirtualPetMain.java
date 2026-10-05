import javax.swing.*;
import java.util.*;

public class VirtualPetMain {
    VirtualPet vp = new VirtualPet();
    
    public VirtualPetMain(){
        this.waitABeat(2000);
        vp.speech("I'm gonna exercise for a bit");
        this.waitABeat(1500);
        vp.exercise();
        this.waitABeat(6000);
        String answer = this.askForInput("Do you want to feed me?");
            if(answer.toLowerCase().equals("no")){
                this.waitABeat(500);
                vp.setEmotion("shocked");
                this.waitABeat(2500);
                vp.setEmotion("sad");
                this.waitABeat(3000);
            }
            else{
                vp.setEmotion("joyful");
                this.waitABeat(1000);
                int time = Integer.parseInt(this.askForInput("How many seconds do you want to feed me for?"));
                vp.feed();
                this.waitABeat(time*1000);
                vp.setEmotion("love");
                this.waitABeat(2000);
                vp.setEmotion("normal");
            }
        this.waitABeat(1000);
        vp.speech("What should we do next?");
        this.waitABeat(2500);
        vp.speech("Hopefully not more exercise");
        this.waitABeat(1500);
        answer=this.askForInput("More exercise?");
            if (answer.toLowerCase().equals("yes")){
                this.waitABeat(1000);
                vp.setEmotion("shocked");
                this.waitABeat(2000);
                answer=this.askForInput("For how many minutes?");
                if (Integer.parseInt(answer)>=10){
                    vp.setEmotion("surprised");
                    this.waitABeat(2000);
                    answer=this.askForInput("Are you serious");
                    if (answer.toLowerCase().equals("yes")){
                        this.waitABeat(500);
                        vp.enraged();
                        this.waitABeat(1000);
                        vp.speech("I can't believe this");
                        this.waitABeat(3000);
                        vp.setEmotion("normal");
                        this.waitABeat(750);
                        vp.speech("Ok let's go");
                        this.waitABeat(750);
                        vp.exercise();
                        this.waitABeat(6000);
                        vp.setEmotion("tired");
                        this.waitABeat(1500);
                    }
                    else if (answer.toLowerCase().equals("no")){
                        vp.setEmotion("relieved");
                        this.waitABeat(1500);
                        vp.speech("Thank goodness");
                        this.waitABeat(2000);
                    }
            }
            else {
                vp.setEmotion("relieved");
                this.waitABeat(1500);
                vp.speech("Thank goodness it's not for that long");
                this.waitABeat(2000);
            }
            }
            else {
                vp.speech("Thank you!");
                vp.setEmotion("happy");
                this.waitABeat(3000);
            }
        vp.setEmotion("normal");
        this.waitABeat(1000);
        vp.speech("I'm getting a bit hungry");
        vp.setEmotion("starving");
        this.waitABeat(1500);
        answer=this.askForInput("Can I eat now please");
        if (answer.equals("no")){
            this.waitABeat(1000);
            vp.setEmotion("tired");
            this.waitABeat(2500);
            vp.speech("I'm starting to feel a bit sick");
            vp.setEmotion("verysick");
            this.waitABeat(3000);
            answer=this.askForInput("Can I eat just a little");
            if (answer.equals("no")){
                this.waitABeat(1500);
                vp.speech("I don't think I can hold on much longer");
                this.waitABeat(4000);
                vp.speech("I will be back");
                this.waitABeat(2500);
                vp.setEmotion("dead");
                this.waitABeat(6000);
                vp.setEmotion("ascension");
                this.waitABeat(1000);
                vp.speech("With my final ascension, you will now pay for your wrongdoings");
            }
            else if (answer.equals("yes")){
                this.waitABeat(1500);
                vp.setEmotion("relieved");
                this.waitABeat(1500);
                vp.setEmotion("happy");
                this.waitABeat(1000);
                vp.speech("Thank you");
                this.waitABeat(2000);
            }
        }
        else if (answer.equals("yes")){
                this.waitABeat(1500);
                vp.setEmotion("relieved");
                this.waitABeat(1500);
                vp.setEmotion("happy");
                this.waitABeat(1000);
                vp.speech("Thank you");
                this.waitABeat(2000);
            }
    }

    public void waitABeat(int ms){
        try {
            Thread.sleep(ms); //milliseconds
        } catch(Exception e){
        
        }
    }

    public String askForInput(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Input Dialog",
                    JOptionPane.PLAIN_MESSAGE
        );
        return s;
    }

    public static void main(String[] args) {
        new VirtualPetMain();    
    }
}

