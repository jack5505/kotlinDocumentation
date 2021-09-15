/*
* 
*  @author Sabirov Jakhongir  
*  
*/    


val systemUsers: MutableList<Int> = mutableListOf(1,2,3)
val sudoers: List<Int> = systemUsers

fun addSystemUsers(newUser: Int){
    systemUsers.add(newUser)
}

fun getSysSudoers() : List<Int>{
    return sudoers
}


fun main(){
        addSystemUsers(4)
        println("Tot sudoers: ${getSysSudoers().size}")
        getSysSudoers().forEach { it -> printAll("$it") }
        addSystemUsers(56)
        println("Tot sudoers: ${getSysSudoers().size}")
        val  old = systemUsers.add(32)
        print("$old")
}