package Animal_Inheritance;

public class LandAnimal extends Animal {
        @Override
        String move() {
            return "Swing on trees";
    
        }
        public static void main(String[] args) {
            
            LandAnimal monkey = new LandAnimal();
            monkey.name = "Monkey";
            
            System.out.println(monkey.move());
        }
        
    }    
