import java.io.File
import java.lang.IllegalStateException

/*
* 
*  @author Sabirov Jakhongir  
*  
*/    


fun main(){
    //Default value for function parameters
    fun foo(a: Int, b : String = ""){

    }
    //var can be assigned
    var test = 32
    test ++
    // val cann't be assigned
    val test2 =32
    // test2 ++
    var list = listOf(3,2,52,2);
    var evenList = list.filter { it % 2 == 0 }
    val other = list.filter { it % 2 == 0 }
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

    /*
    lazy() это функция, которая принимает лямбду и возвращает экземпляр класса Lazy<T>,
    который служит делегатом для реализации ленивого свойства: первый вызов get() запускает лямбда-выражение,
    переданное lazy() в качестве аргумента, и запоминает полученное значение, а последующие вызовы просто возвращают вычисленное значение.
     */
    val erinchoq: String by lazy {
        println("hello world")
        println("hello")
        "fall"
    }



    println(erinchoq)
    println(erinchoq)
    println(Resource.name)
    println(Resource.name)

    val value = "fe"
    // Execute if not null
    value?.let{
        print("not null !!!!!")
    }

    //map nullable value if not null
    val lt = mapOf("this" to 2)
    val mapped = lt?.let { it } ?: "other value"



    val myObject = object : MyAbstractClass(){
        override fun doSomething() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun sleep() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }
   // myObject.doSomething()


    val files = File("Test").listFiles()

    println(files?.size) // size is printed if files is not null

    //if not null shorthand
    println(files?.size ?: "empty") // if has size will show size if not then print empty


    val values = mapOf("a" to 1)
    //Execute statement if null
    val email = values["email"] ?: throw IllegalStateException("Email is missing")


    val ls = listOf("salom","ular","bular")
    //Get first item of possibly empty collection
    val mainMail = ls.firstOrNull() ?: ""
    println("$mainMail")



}

data class Customer(val name:String,val email:String)

//This create singleton
object Resource{
    val name = "name"
}


// create abstarct class and declare method as abstract
abstract class MyAbstractClass{
    abstract fun doSomething()
    abstract fun sleep()
}