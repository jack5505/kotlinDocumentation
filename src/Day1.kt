/*
* 
*  @author Sabirov Jakhongir  
*  
*/    
fun main(){
    println("here we go ${summaF(3,2)}")
    fun summa(a : Int, b: Int ) = a + b;
    println("${summa(15,25)}")
    withoutReturn(3,5)
    // val as constant
    val first = 213
    val f : Int = 123
    // var as varaible
    var second = 333
    second += 322
    // first += 232 can't assign here because val constant
    val rectangle = Rectangle(3.2,2.0)
    println("Perimeter of this ${rectangle.perimeter}")
    println("We have two digits")

    var a = 1;
    val s1 = "a is $a"

    val s2 = "${s1.replace("is","was")}, but now is $a"
    println(s2)

    val items = listOf("apple","banana","kiwifruit")

    for(index in items.indices){
        println("item at $index is ${items[index]}")
    }

    fun describe(obj: Any): Any = when(obj){
        1 -> "one"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

    println(describe(Long))

    for  (x in 1..5){
        println(funkDescribe(x))
    }

    //Ranges
    println("ranges")
    val x = 10
    val y = 9
    if (x in 1..y + 1){
        println("fits in Range")
    }

    val list = listOf("a","b",'c');
    if(-1 !in 0..list.lastIndex){
        println("-1 is out of range")
    }


    if(list.size !in list.indices){
        println("list size is out of valid list indices range, too")
    }

    for (x in 1..10){
        println("start from $x to 10")
    }

    for(x in 0..10 step 2){
        println("$x ")
    }
    for(x in 9 downTo 0 step  3){
        println("$x ")
    }

    when{
        "x" in list -> println("found a")
        else
            -> println("not found")
    }

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")

    fruits.filter { it-> it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }


    //Nullable values and null checks﻿

    fun parseInt(str: String): Int?{
        var digit:Int = 0
        for (x in str){

            if(x.toInt() in 48..57){
                digit++
            }
            println("$digit ${x.toInt()}  $x")
        }
        return if(digit > 0) digit else null

    }
    var test = "32"
    println(parseInt("232X"))
    println(parseInt("YYY"))
   // println(parseInt(null))
    println(test.toInt())





}

fun funkDescribe(obj: Any) : String{
    when(obj){
        1 -> return "String"
        2 -> return "two"
        else ->
            return "other"
    }

}




fun withoutReturn(a : Int, b : Int){
    println("$a + $b total: ${summaF(a,b)}")
}

fun summaF(a:Int,b:Int): Int{
    return a + b;
}

class Rectangle(var height: Double, var length: Double): Shape(){
    var perimeter = (height + length) * 2


}

/**
 * Inheritance between classes is declared by a colon (:). Classes are final by default; to make a class inheritable, mark it as open.
 */

open class   Shape

fun maxOfTwoDigits(a : Int, b : Int) : Int{
    if(a > b){
        return  a;
    }else{
        return b;
    }
}