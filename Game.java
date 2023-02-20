import java.util.*;

class random{
int r, input, guess = 1; 
Scanner sc = new Scanner(System.in);
random(){
Random rand = new Random();
r = rand.nextInt(1,10);

System.out.println("Guess the Random between 1-10 :");

} 
public void takeUserInput(){
    input = sc.nextInt();
}

public void setGuess(){
    guess ++;
}

public int getGuess(){ 
    return guess;
}
public void isCorrectNumber(){ 
    if (input == r){
System.out.println("You guess the right number!");
}
}
}
public class Game {
     public static void main(String[] args) {

int i = 1;

Scanner sc = new Scanner(System.in);

random rand = new random();  

rand.takeUserInput();

while(rand.r!=rand.input){ 
    if(rand.input < rand.r){

System.out.println("Give bigger number than this.");

} else {

System.out.println("Give smaller number than this.");

System.out.println("Try Again!"); 
rand.setGuess(); // THIS IS FOR INCREMENTING THE GUESS NUMBER

rand.takeUserInput();

}

rand.isCorrectNumber(); 
System.out.println("Number of GUESS :"+rand.getGuess()); 
}
     }
}