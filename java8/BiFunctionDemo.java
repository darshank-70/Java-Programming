//BiFunction<T,U,R> is a FunctionalInterface 
//which takes 2 parameters in apply method
//it has 1.method
//R apply(T ob1,U ob2){}
//2. default methods  compose(), andThen()


import java.util.function.BiFunction;
class BiFunctionDemo{
    public static void main(String[] args){
        //example lets pass one string, one integer and get back the String with appending integer at beginning

        BiFunction<String,Integer,String> numStr=
                                            (str,num)->num+str;
        String s1="Hello";
        Integer n1=1;
        String result=numStr.apply(s1,n1);
        System.out.println(result);
    }
}