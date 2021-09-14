/*
* 
*  @author Sabirov Jakhongir  
*  
*/

fun main(args: Array<String>) {
    var test: Int = readLine()!!.toInt()

    while (test > 0){
        compute()
        test--;
    }

}
fun compute(){
    val n = readLine()!!
    val s = readLine()!!
    var found : Boolean = false
    for (i in 0..s.length - 2){
        if(s[i] != s[i + 1]){
            println("${i + 1} ${i + 2}")
            found = true;
            break;
        }
    }
    if(!found){
        println("-1 -1")
    }
}