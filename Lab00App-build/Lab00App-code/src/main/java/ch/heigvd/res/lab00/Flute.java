package ch.heigvd.res.lab00;

class Flute extends IInstrument {
  private int volume = 5;
  private String color = "black";
  private String sound = "tut";

  public int getSoundVolume(){
    return volume;
  }

  public String play(){
  	return sound;
  }

  public String getColor(){
  	return color;
  }

}