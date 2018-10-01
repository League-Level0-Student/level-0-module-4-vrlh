int x = mouseX;
int y = mouseY;
void setup(){
  
  size(1000, 250);
}
void draw(){
  background(0);
  fill(#FFFCFC);
  ellipse(250, 100, 250, 150);
  fill(#FFFCFC);
  ellipse(750, 100, 250, 150);
  
  fill(#0A0A0A);
  x = mouseX;
   y = mouseY;
  if(mousePressed){
  print(mouseX + " " + mouseY);
  }
  if (mouseX < 180){
    x = 180;
  }
 if (mouseY < 62){
    y = 62;
  }
  if (mouseY > 135){
    y = 135;
  }
  if (mouseX > 322){
    x = 322;
  }
 
   
  
  
  ellipse(x, y, 50, 50);
  ellipse(x + 500, y, 50, 50);
 
  
}