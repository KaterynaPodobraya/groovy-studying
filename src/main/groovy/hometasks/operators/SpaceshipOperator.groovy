package hometasks.operators

class SpaceshipOperator {

   static void main(String[] args) {
   //  The spaceship operator (<=>) delegates to the compareTo method
       assert (1 <=> 1) == 0
       assert (1 <=> 2) == -1
       assert (2 <=> 1) == 1
       assert ('a' <=> 'z') == -1
   }
}