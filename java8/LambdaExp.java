//Lambda Expression is Used for implementing a Functional Interface.
//advantages:
//simplify the code, helps in Readability and maintainability
//enables utilization of Functional programming
//enables Functions as parameters
//parellel programming
class LambdaExp{
    public static void main(String[] args){
        Abcd fi=()->{
            System.out.println("This is the method of Abcd ");
        };
        
        //A Lambda Expression is Not Executed With the Normal flow of Execution. 
        //it need to be Called
        fi.display();
    }
}