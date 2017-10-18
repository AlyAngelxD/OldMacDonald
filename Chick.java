class Chick implements Animal 
{     
    private String myType;
    private String mySound;
    private String myOtherSound;
    public Chick(String type, String sound, String otherSound) {
    	myType = type;
    	mySound = sound;
        myOtherSound = otherSound;
    }
    public Chick() {
    	myType = "unknown";
    	mySound = "unknown";
	   	
    }
    public String getSound(){return mySound;}
    public String getType(){return myType;}
    public void setType(String sound) {
        // if (Math.random() < 0.5) {
        //     mySound = "cheep";
        // }
        // else {
        //     mySound = "cluck";
        // }
        mySound = sound;
    }
}
