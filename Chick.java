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
        myOtherSound = "unknown";
	   	
    }
    public String getSound(){return mySound;}
    public String getType(){return myType;}
    public void setType(String sound, String otherSound) {
        if (Math.random() < 0.5)
            mySound = sound;
        else 
            mySound = otherSound;
    }
}
