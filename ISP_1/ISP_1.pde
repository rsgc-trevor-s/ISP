

float radius = 60; //sets variable for the radius of the circle
float xposition; //set variable for x position 
float yposition; //set variable for y position
float xspeed=4.5;// set variable for how fast circle moves along x axis 
float yspeed = 4.5;//set variable for how fast circle moves along y axis
int xdirection = 1;//set variable for the direction the circle moves along the x axis 
int ydirection = 1;//set variable for the direction the circle moves along the y axis 


float radius2 = 60; 
float xposition2; 
float yposition2; 
float xspeed2= 5;
float yspeed2 = 5;
int xdirection2 = 1;
int ydirection2 = 1; 

float radius3 = 60; 
float xposition3; 
float yposition3; 
float xspeed3= 6;
float yspeed3 = 6;
int xdirection3 = 1;
int ydirection3 = 1; 

float radius4 = 60; 
float xposition4; 
float yposition4; 
float xspeed4=4.5;
float yspeed4 = 4.5;
int xdirection4 = 1;
int ydirection4= 1; 

void setup() { 
  size (1300, 800); //size of canvas
  background(0); //sets background colour to black
  noStroke(); 
  frameRate(60); 
  xposition = width/4; //determines starting x vaue of circle
  yposition = height/4;//determines starting y vaue of circle
  
  xposition3 = width/20;
  yposition3 = height/6;

  xposition2 = width/2;
  yposition2 = height/2;

  xposition4 = width/6;
  yposition4 = height/2;
}


void draw() {
  xposition=xposition+2;
  xposition3=xposition3+2;



  //background(0);
  xposition = xposition+ (xspeed * xdirection);
  yposition = yposition +(yspeed * ydirection); 

  if (xposition >width-radius||xposition<0+radius) {
    xdirection *= -1;
  }
  if (yposition >height-radius|| yposition<0+radius) {
    ydirection *= -1;
  }


  xposition2 = xposition2+ (xspeed2 * xdirection2);
  yposition2 = yposition2 +(yspeed2 * ydirection2); 

  if (xposition2 >width-radius2||xposition2<0+radius2) {
    xdirection2 *= -1;
  }
  if (yposition2 >height-radius2|| yposition2<0+radius2) {
    ydirection2 *= -1;
  }



  xposition3 = xposition3+ (xspeed3 * xdirection3);
  yposition3 = yposition3+(yspeed3 * ydirection3); 

  if (xposition3 >width-radius3||xposition3<0+radius3) {
    xdirection3 *= -1;
  }
  if (yposition3 >height-radius3|| yposition3<0+radius3) {
    ydirection3 *= -1;
  }


  xposition4 = xposition4+ (xspeed4 * xdirection4);
  yposition4 = yposition4 +(yspeed4 * ydirection4); 

  if (xposition4 >width-radius4||xposition4<0+radius4) {
    xdirection4 *= -1;
  }
  if (yposition4 >height-radius4|| yposition4<0+radius4) {
    ydirection4 *= -1;
  }



  fill(255, 10, 0);
  ellipse(xposition, yposition, radius, radius);
  fill(0, 255, 20);
  ellipse (xposition2, yposition2, radius2, radius2);
  fill(100, 0, 255);
  ellipse (xposition3, yposition3, radius3, radius3);
  fill(255, 255, 8);
  ellipse(xposition4, yposition4, radius4, radius4);
}
