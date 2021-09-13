/*
* 
*  @author Sabirov Jakhongir  
*  
*/    


fun main(){

    println(4 times "fnn")
    var pair = "Ferrari" to "Katrina"
    println(pair)
    val matches = "a bc dc" subsTringMatches ".?".toRegex()
    println(matches)

    val test = "Jack" onto "test"


    println(test)

    val sophia = Person("Sophia")
    val claudia = Person("Jack")
    print("${sophia.likedPeople} ${claudia.likedPeople}")
    sophia likes claudia
    print("${sophia.likedPeople[0].name}")



    //Varargs allow you to pass any number of arguments by separating them with commas.
    printAll("jack","shular","bular")
    val dog = Dog()
    dog.sayHello()

    val york = Yorkshire()
    york.sayHello()

}
// to make extend of class in kotlin need to use open
open class Dog{
    open fun sayHello(){
        println("salom dunyo")
    }
}
// Kotlin classes are final by default. If you want to allow the class inheritance, mark the class with the open modifier.
// Kotlin methods are also final by default. As with the classes, the open modifier allows overriding them.
//A class inherits a superclass when you specify the : SuperclassName() after its name. The empty parentheses () indicate an invocation of the superclass default constructor.
//Overriding methods or attributes requires the override modifier.
class Yorkshire : Dog(){
    override fun sayHello() {
        printAll("wifi ")
    }
}

//Varargs
//only single vararg allowed to write here
fun printAll(vararg messages: String){
    for(m in messages){
        println(m)
    }

}
// The vararg modifier turns a parameter into a vararg.
//This allows calling printAll with any number of string arguments.
//Thanks to named parameters, you can even add another parameter of the same type after the vararg. This wouldn't be allowed in Java because there's no way to pass a value.
//Using named parameters, you can set a value to prefix separately from the vararg.
//At runtime, a vararg is just an array. To pass it along into a vararg parameter, use the special spread operator * that lets you pass in *entries (a vararg of String) instead of entries (an Array<String>).

class Person(val name: String){

    val likedPeople = mutableListOf<Person>()

    infix fun likes(other: Person){likedPeople.add(other)}

}

//Custom infix
infix fun String.subsTringMatches(reg: Regex) : List<String>{
    return reg.findAll(this)
        .map { it.value }
        .toList()
}


infix fun Int.times(str: String) {
    println(this)
    str.repeat(this)
}

infix fun String.onto(value: String): Pair<Any,Any>{
    return this to value
}