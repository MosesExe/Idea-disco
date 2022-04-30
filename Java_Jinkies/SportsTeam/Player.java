import java.util.Random;

public class Player {
        private String name;
        private int age;
        private int playerNumber;
        private String weight;
        private boolean isStarting;

        public Player(){}
    
        public Player (String name, int age, int playerNumber, String weight) {
            this.name = name;
            this.age = age;
            this.playerNumber = playerNumber;
            this.weight = weight;
            this.isStarting = this.getIsStarting(); 
        }
    
        public String getName (){
            return this.name;    
        }
    
        public int getAge (){
            return this.age;
        }
    
        public int getPlayerNumber (){
            return this.playerNumber;
        }
    
        public String getWeight() {
            return this.weight;
        }
    
        public boolean getIsStarting(){
            boolean result;
            Random rd = new Random();
            result = rd.nextBoolean();
            return result;
        }
}