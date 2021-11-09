package u5pp;
public class Dice {
    // instance variables
    private int numSides = 6;
    private int currentSide = 1;
    private String color = "green";

    // constructor for normal new die
    public Dice(){

        this.numSides = 6;
        this.currentSide = 1;
        this.color = "green";
      
    }

        public Dice(int numSides){

            this.numSides = numSides;
            this.currentSide = 1;
            this.color = "green";
            
        }

            public Dice(int numSides, int currentSide){
                this.numSides = numSides;
                this.currentSide = currentSide;
                this.color = "green";
              if (1 <= this.currentSide && this.currentSide <= numSides){
                  this.currentSide = currentSide;
                      }
                else {
                this.currentSide = 1;
                }
            }

                public Dice(int numSides, int currentSide, String color){
                    this.numSides = numSides;
                    this.currentSide = currentSide;
                    this.color = color;
                  if (1 <= this.currentSide && this.currentSide <= numSides){
                  this.currentSide = currentSide;
                      }
                else {
                this.currentSide = 1;
                }
                  
                }

    // accessors/getters
    public int getSides(){

        return this.numSides;
    }

        public int getCurrentSide(){
            if(this.currentSide >=1 || this.currentSide < this.numSides)
            return this.currentSide;
            else{
              this.currentSide = 1;
              return this.currentSide;
            }
            
        }

            public String getColor(){
                return color;
            }
                public String toString(){
                    return "The " + color + " " + numSides + "-sided dice is showing " + currentSide;
                }
                    public boolean equals(Dice d){
                       if(this.getCurrentSide() == d.getCurrentSide()){
                        return true;
                       }
                       else{
                        return false;
                       }
                    }
    // mutators
    public int roll(){

        currentSide = (int)(Math.random() * numSides +1);
        return currentSide;
    }

        public void changeSide(int num){
            if(num > 1 && num < numSides){
                currentSide = num;
            }
            else{
              
            }
        }
            public void changeColor(String colorChange){
                color = colorChange;
            }
                public void changeNumSides(int numChange){
                    numSides = numChange;
                }
                
}