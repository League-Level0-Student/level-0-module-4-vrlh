void setup(){
  size(1000, 250);
}
void draw(){
  fill(#FFFCFC);
  ellipse(250, 100, 250, 150);
  fill(#FFFCFC);
  ellipse(750, 100, 250, 150);
  
  fill(#0A0A0A);
  if(mousePressed){
  print(mouseX + " " + mouseY);
  }
  ellipse(mouseX, mouseY, 50, 50);
  ellipse(mouseX + 500, mouseY, 50, 50);
  
  
}