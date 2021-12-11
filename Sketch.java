import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(22, 15, 73);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    stroke(0);
    line(250, 50, 341, 200);  

    stroke(0);
    line(250, 50, 138, 200);
    
    stroke(0,255,0);
    line(400,391,390,377);
    
    stroke(0,255,0);
    line(400,377,390,391);
    
    fill(0,0,255);
    ellipse(395,367,20,20);
    
    fill(0,0,0);
    rect(0,391,500,109);
    
    fill(255, 0, 0);
    rect(140, 190, 200, 200);
    
    fill(165,42,42);
    rect(40,220, 40, 170);
    
    fill(0,255,0);
    ellipse(61,190,70,70);
    
    fill(165,42,42);
    rect(300,320,40,70);
    
    fill(0,0,255);
    ellipse(330,360,10,10);
    
  }
  
  // define other methods down here.
}