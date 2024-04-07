/*
**********************************     Introduction    ******************************************************
*all programs are usually running on the hardware(physical computer), few programs run on another program called a server or a virtual machine

* Programming is writing steps to tell the computer to complete certain task

* the computer use RAM to process the program using the CPU

* The program is translated into machine language in order for the computer to understand it

* Other languages are interpreted, the Kotlin language is a JVM language hence it is translated into a byte code and processed using the JVM (java virtual machine) hence there is interoperability between Java programming language and Kotlin programming language

* Computer programs are everywhere and ones understanding of the programming knowledge is very important

*In any program there has to be a starting point, all Kotlin programs begin executing on the main function, fun is a keyword that is used to declare a function in Kotlin program

 */

/*
******************************************* Value and their types ******************************************
* Every literal in a programming language has a type
*
*
*
*
*
*
* */
fun main(){
// rules for using a function
    //each function should have very low abstraction
    //low level of abstraction serve more

    val factorialNum = 6
    fun counter (factorial:Int): Int {
        var counterNum = 1
        for(i in 1..factorial){
            counterNum *= i
        }
    return counterNum;
    }
    counter(factorialNum)
    println("Factorial of $factorialNum is "+ counter(factorialNum))

    fun factorial(number: Int): Int {

        var accumulator = 1

        for (i in 1..number) {

            accumulator *= i
        }

        return accumulator
    }

        println("Accumulator factorial is "+ factorial(6)) // 720

    //Recursion call using Kotlin syntax
      val factorial =  fun (n:Int) = factorial(n - 1) * n
     println("Factorial based on recursion is "+ factorial(6))
}