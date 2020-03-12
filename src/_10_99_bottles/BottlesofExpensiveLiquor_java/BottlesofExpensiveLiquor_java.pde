void setup(){
 for(int bottles = 99; bottles>=0; bottles--){
   println(bottles+ bottles +"bottles of beer on the wall," +bottles +"bottles of beer.Take one down and pass it around,"+bottles+" bottles of beer on the wall.");
   if (bottles == 1){
     println("1 bottle of beer on the wall, 1 bottle of beer.Take one down and pass it around, no more bottles of beer on the wall.");
     
 }
 else if(bottles == 0){
  println(" No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall." );
 }
 }
}