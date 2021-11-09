package u5pp;
public class Card{

    private String value;
    private String suit;

    //Constructors
    public Card(){

        this.value = "2";
        this.suit = "clubs";
    }

        public Card(String initsuit){

            this.suit = initsuit;
            this.value = "2";
        }

            public Card(String initsuit, String initValue){
                this.suit = initsuit;
                this.value = initValue;
                
            }
    //Accessors and getters
    public String getValue(){

        return this.value;
    }

        public String getSuit(){
            
            return this.suit;
        }
            public String toString(){
                return "The " + value + " of " + suit;
            }
                public boolean equals(Card c){
                if((this.getSuit().equals(c.getSuit())) && (this.getValue().equals(c.getValue()))){
                    return true;
                }
                else{
                    return false;
                }
                }
    // Mutators/Setter 

        public void changeSuit(String initSuit){

            initSuit = initSuit.toLowerCase();

            if( initSuit.equals("clubs") || initSuit.equals("diamonds") || initSuit.equals("hearts") || initSuit.equals("spades") ){
                suit = initSuit;
            }
            else{
              
            }
            
        }
            public void changeValue(String initValue){
                initValue = initValue.toLowerCase();
                if(initValue.equals("1") || initValue.equals("2") || initValue.equals("3") || initValue.equals("4") || initValue.equals("5") || initValue.equals("6") || initValue.equals("7") || initValue.equals("8") || initValue.equals("9") || initValue.equals("10") || initValue.equals("jack") || initValue.equals("queen") || initValue.equals("king") || initValue.equals("ace") ){
                    value = initValue;
                }
                else{
                  
                }
                

            }
                


}