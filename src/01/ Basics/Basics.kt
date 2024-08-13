package `01`.` Basics`

import kotlin.io.readlnOrNull//In Kotlin main function is the entry point for regular console programs
import kotlin.io.readLine
// Expressions can be done with values or with variables involvement

//super variables
var attempt=0
var choice: Any? = null

fun reviewHistory(){
    println("Nothing is available currently")
}

fun createAgreement(){
    println("Enter terms of agreement")
    var agreementTerms = readlnOrNull()
    println("Enter amount in numerals that is 1 or 2 or 3 or so")
    var quantity = readlnOrNull()?.toInt()
    println("Enter number you want to receive the request")
    var phoneNumber = readlnOrNull()
    val agreementObject = mutableListOf<Any>()
    agreementObject.add(agreementTerms as Any)
    agreementObject.add(quantity as Any)
    agreementObject.add(phoneNumber as Any)

}

fun exit():Boolean{
   return true
}

fun authorisePayment():Unit{
    val updates = "No new updates are available"
    println(updates)
    inAppMenu()
}
fun fileComplaint():Unit{
   println("Service is currently unavailable \n1. Go back 2. \n2. Exit" )
   choice = readlnOrNull()?.toInt()
   if(choice ==1){
    inAppMenu()
   }
   else{
    exit()
   }
}
 fun inAppMenu() {
       println("Choose your option below: \n 1. Authorize payment \n 2. File complaints \n 3. Create new agreement \n 4. Review history ")
       choice = readLine()?.toInt()
       when(choice){
        1 -> {
            authorisePayment()
        }
        2-> {
            fileComplaint()
        }
        
        3 -> {
            createAgreement()
        }
        4 ->{
            reviewHistory()
        }
       }
    }

fun login(){
println("Welcome to Kotlin's login console")
println("Enter your phone number")
val username = readlnOrNull()?.toLong()
if(username != null){
    println("Hello user with $username, welcome to your account")
    inAppMenu()
    attempt +=1
    if(attempt ==3){
        println("You have exceeded the number of attempts")
        exit()
    }
}
else{
    println("You have submitted an empty entry please repeat the login")
    login()
}
}
lateinit var name:String
fun main(){
println("Welcome to Kotlin's\n 1. Login \n 2. Exit application")
choice = readLine()?.toInt()
when(choice){
    1 -> {
        login()
    }
    2 -> {
        exit()
    }
}
}