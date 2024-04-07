fun main(){
    //creating arrays
    val arrayData:Array<Int> = arrayOf(12,34,23,23,23,2)
    val x:Int = 0
    val a = 12
    val b=10
 val max = if (a > b) a else b
    println("$max is greater")

    when(x){
        1 -> println("You have chosen 1")
        2 -> println("You have chose 2")
        else -> {
            println("Nothing is chosen")
        }
    }
}