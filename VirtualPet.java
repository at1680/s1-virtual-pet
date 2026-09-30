/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello!");
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

    public void anger(){
        hunger=hunger+2;
        face.setMessage("You're making me angry");
        face.setImage("angry");
    }

    public void sad(){
        hunger=hunger+2;
        face.setMessage("Ok, fine");
        face.setImage("sad");
    }

    public void speech(String n){
        face.setMessage(n);
    }

    public void enraged(){
        face.setImage("enraged");
    }

    public void setEmotion(String n){
        face.setImage(n);
    }

} // end Virtual Pet
