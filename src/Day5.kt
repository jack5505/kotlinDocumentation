/*
* 
*  @author Sabirov Jakhongir  
*  
*/    


sealed class Mamal(val name:String)

class Cat(val catName: String) : Mamal(catName)

class Human(val humanArg: String, val job: String) : Mamal(humanArg)

fun greetMammal(mamal: Mamal) : String{
    when (mamal){
        is Human -> return "Hello ${mamal.name}; You're working as a ${mamal.job}"
        is Cat -> return "Hello ${mamal.name}"
    }
}

fun main(){
    println(greetMammal(Cat("Snowy")))
    BigBen.getBongs(3)
    // to call function from function need to use :: this
    val sumResut = calculate(3,2,::sum)
    //or you can write here function that you want to see in calculation
    val multiplyResult = calculate(3,2){a,b -> a * b}
    println("summa: $sumResut  multiply:$multiplyResult")


}

fun calculate(a : Int, b : Int,summa: (Int,Int)-> Int ) :Int{
    return summa(a,b);
}
fun sum(x: Int,y: Int) = x + y;



class BigBen{
    /**
     * An object declaration inside a class defines another useful case: the companion object.
     * Syntactically it's similar to the static methods in Java: you call object members using its class name as a qualifier.
     * If you plan to use a companion object in Kotlin, consider using a package-level function instead
     */
    companion object Bonger{
        fun getBongs(nTimes : Int){
            for (i in 1..nTimes){
                println("BOng")
            }
        }
    }
}

/**
 *
 *  1 Defines a sealed class.
    2 Defines subclasses. Note that all subclasses must be in the same package.
    3 Uses an instance of the sealed class as an argument in a when expression.
    4 A smartcast is performed, casting Mammal to Human.
    5 A smartcast is performed, casting Mammal to Cat.
    6 The else-case is not necessary here since all possible subclasses of the sealed class are covered. With a non-sealed superclass else would be required.
        **/