
void setup(){
  
 background(255,255,255); 
  size(1000,1000);
  
  
  
}
void draw(){
 
  ellipse(500,500,300,300);
  fill(255,0,0,10);
  ellipse(354,355,300,300);
  fill(0,255,0,10);
  ellipse(499,229,300,300);
  fill(0,0,255,10);
  
  if(mousePressed){
   println(mouseX);
   println(mouseY);
   text("H",mouseX,mouseY);
   textSize(100);
   
  }
  
}