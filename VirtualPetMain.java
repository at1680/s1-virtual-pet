import javax.swing.*;

public class VirtualPetMain {
    VirtualPet vp = new VirtualPet();
    
    public VirtualPetMain(){
        this.waitABeat(2000);
        vp.speech("I'm gonna exercise for a bit");
        this.waitABeat(1500);
        vp.exercise();
        this.waitABeat(6000);
        String answer = this.askForInput("Do you want to feed me?");
            if(answer.toLowerCase()=="no"){
                this.waitABeat(500);
                vp.setEmotion("shocked");
                this.waitABeat(2500);
                vp.setEmotion("sad");
                this.waitABeat(3000);
            }
            else{
                vp.setEmotion("joyful");
                this.waitABeat(1000);
                int time = Integer.parseInt(this.askForInput("How long do you want to feed me for?"));
                vp.feed();
                this.waitABeat(time);
            }
        answer=this.askForInput("What should we do next?");
            //say more exercise
        this.waitABeat(1000);
        vp.setEmotion("surprised");
        this.waitABeat(2000);
        this.askForInput("Are you serious");
            //say yes
        this.waitABeat(500);
        vp.enraged();
        this.waitABeat(1000);
        vp.speech("I can't believe this");
        this.waitABeat(3000);
        vp.setEmotion("normal");
        vp.speech("Ok let's go");
        this.waitABeat(750);
        vp.exercise();
        this.waitABeat(6000);
        vp.setEmotion("tired");
        this.waitABeat(1500);
        vp.setEmotion("starving");
        this.askForInput("Can I eat now please");
            //say no
        this.waitABeat(1000);
        vp.setEmotion("tired");
        this.waitABeat(2500);
        vp.speech("I'm starting to feel a bit sick");
        vp.setEmotion("verysick");
        this.waitABeat(3000);
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

