package ch.heigvd.res.lab00;

class Trumpet extends IInstrument {
  private String color = "golden";
  private int volume = 10;
  private String sound = "pouet";

  public String play(){
    return sound;
  }

  public String getColor(){
    return color;
  }

  public int getSoundVolume(){
    return volume;
  }

}

