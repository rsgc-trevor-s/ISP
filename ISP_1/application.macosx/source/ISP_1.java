import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class ISP_1 extends PApplet {

float time = 0; 
float opacity =15; 

float diameter = 80; //sets variable for the radius of the circle
float xposition; //variable for x position 
float yposition; //variable for y position
float xspeed=2;// set variable for how fast circle moves along x axis 
float yspeed = 2;//set variable for how fast circle moves along y axis
float xdirection = -1;//set variable for the direction the circle moves along the x axis 
float ydirection = -1;//set variable for the direction the circle moves along the y axis 


float diameter2 = 80; 
float xposition2; 
float yposition2; 
float xspeed2= 3;
float yspeed2 = 3;
float xdirection2 = 1;
float ydirection2 = 1; 



float diameter3 = 80; 
float xposition3; 
float yposition3; 
float xspeed3= 2;
float yspeed3 = 2;
int xdirection3 = 1;
int ydirection3 = 1; 

float xpositionmid= 400;
float ypositionmid = 300;
float diametermid = 100; 


public void setup() { 
  size (1200, 720); //size of canvas
  background(0); //sets background colour to black
  noStroke(); 
  frameRate(60); 
  xposition = width/2; //determines starting x vaue of circle
  yposition = height/2;//determines starting y vaue of circle

  xposition3 = width/20;
  yposition3 = height/6;

  xposition2 = width/6;
  yposition2 = height/6;

  // xposition4 = width/6;
  // yposition4 = height/2;
}


public void draw() {

  if (keyPressed==true) {
    background(0);
  }


  // Filter only every other frame (when frameCount is evenly divisible by 2, i.e.: when the remainder is 0)
  //if (frameCount % 2== 0) {
  // filter(BLUR, 1);



  float a = yposition2-yposition; //sets a(ylength) variable for ellipse
  float b= xposition2-xposition; //set b(x length) variable for ellipse 
  float distance= sqrt(a*a+b*b); //finds distance between ellipses 

  float a2 = yposition2-yposition3; //sets a(ylength) variable for ellipse
  float b2= xposition2-xposition3; //set b(x length) variable for ellipse 
  float distance2= sqrt(a2*a2+b2*b2); //finds distance between ellipses

  float a3 = yposition-yposition2; //sets a(ylength) variable for ellipse
  float b3= xposition-xposition2; //set b(x length) variable for ellipse 
  float distance3= sqrt(a3*a3+b3*b3); //finds distance between ellipses 
  
  float amid = ypositionmid-yposition; //sets a(ylength) variable for ellipse
  float bmid= xpositionmid-xposition; //set b(x length) variable for ellipse 
  float distancemid= sqrt(amid*amid+bmid*bmid); //finds distance between ellipses 




  xposition2 = xposition2+ (xspeed2 * xdirection2);
  yposition2 = yposition2 +(yspeed2 * ydirection2);

  xposition3 = xposition3+ (xspeed3 * xdirection3);
  yposition3 = yposition3 +(yspeed3 * ydirection3);

  xposition = xposition+ (xspeed * xdirection); //determines the x position
  yposition = yposition +(yspeed * ydirection); //determines the x position



    if (xposition >width-30||xposition<0+30) { //states if the xposition is greater then the width 
    xdirection *= -1;//decrease x value by one
  }
  if (yposition >height-30|| yposition<0+30) {//states if the yposition is greater then the height
    ydirection *= -1;//decrease y value by one
  }

  if (xposition2 >width-30||xposition2<0+30) {
    xdirection2 *= -1;
    ;
  }
  if (yposition2 >height-30|| yposition2<0+30) {
    ydirection2 *= -1;
    ;
  }

  if (xposition3 >width-30||xposition3<0+30) { //states if the xposition is greater then the width 
    xdirection3 *= -1;//decrease x value by one
  }
  if (yposition3 >height-30|| yposition3<0+30) {//states if the yposition is greater then the height
    ydirection3 *= -1;//decrease y value by one
  }

  if (distance <= (diameter/2 + diameter2 /2)) {
    xdirection = ydirection * -1;
    xdirection2 =  ydirection2 * -1;
  }
  if (distance3 <= (diameter3/2 + diameter /2)) {
    xdirection3 = ydirection3 * -1;
    xdirection =  ydirection * -1;
  }

  if (distance2 <= (diameter2/2 + diameter3 /2)) {
    xdirection2 = ydirection2 * random(-1, 1);
    xdirection3 =  ydirection3 * -1;
  }

  if (distance <= (diameter/2 + diameter3 /2)) {
    xdirection = ydirection * -1;
    xdirection3 =  ydirection3 * -1;
  }





  fill(0, 255, yposition, 25);
  ellipse(xposition, yposition, diameter, diameter);
  fill(xposition2, 50, yposition2, 25);
  ellipse (xposition2, yposition2, diameter2, diameter2);
  fill(250, 180, 0, 25);
  ellipse (xposition3, yposition3, diameter3, diameter3);
 
}

public void keyPressed(){
  exit();
}
public void mouseMoved(){
  exit(); 
} 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--full-screen", "--bgcolor=#666666", "--stop-color=#cccccc", "ISP_1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
