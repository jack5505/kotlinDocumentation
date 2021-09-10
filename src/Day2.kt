/*
* 
*  @author Sabirov Jakhongir  
*  
*/    


fun main(){
    //Default value for function parameters
    fun foo(a: Int, b : String = ""){

    }

    var list = listOf(3,2,52,2);

    var evenList = list.filter { it % 2 == 0 }

    evenList.forEach { println(it) }

    //Read only map
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)

    println(map["a"])


    for((k,v) in map){
        println("$k  value: $v")
    }


    for (x in 1..10){} // include 10
    for(x in 1 until 10){} // not include 10
    for (x in 0..10 step 2){} // step 2,4,6 ...
    for (x in 10 downTo 0 step 2){} // from 10 to 0 by 2 step
    for(x in 10 downTo 0){ // from 10 to zero
        println("hello world $x")
    }
}

data class Customer(val name:String,val email:String)