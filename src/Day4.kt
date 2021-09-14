/*
* 
*  @author Sabirov Jakhongir  
*  
*/    



open class Lion(val name: String, val origin:String){
    fun sayHello(){
        println("$name, the lion from $origin says: graoh")
    }
}
class Asian(val nm:String) : Lion("jack",origin = "default")
fun main(){
    val asian = Asian("Jack")
    asian.sayHello()

    //Todays lesson is control Flow
    val test: Long = 1
    println(whenAssing(test))
    println(whenAssing(Long.MAX_VALUE))
    // The most interesting why Long class dosn't is Long )))
    println(whenAssing(Long))
    println(whenAssing(1))
    println(whenAssing("Hello"))
    println(whenAssing(Int))

}

fun whenAssing(any: Any):Any{
    val result = when (any){
            1 -> "one"
            "Hello" -> 1
            is Long -> "Long"
        else
            -> 42
    }

    return result
}