class Person(var firstName:String, var lastName:String,var age:Int){
    val fullName get() = "$firstName $lastName"
}
class Student(var registration:String)

fun main(){
    val director = Person(firstName = "Ronald", lastName = "Chaula", age = 30)
    val lastYear = Student(registration = "2021-04-01176")

    println("")
println("-----------------------------------------------------------")
    println("")

    println(lastYear.registration)

    println("")
    println("-----------------------------------------------------------")
    println("")

    println("""
        First Name is: ${director.firstName}
        Last Name is: ${director.lastName}
        Age is: ${director.age}
    """.trimIndent())

    println("")
    println("-----------------------------------------------------------")
    println("")

    println("Full name is ${director.fullName}")

    println("")
    println("-----------------------------------------------------------")
    println("")
    /**
     * Classes are stored in heap memory and references to class instances are stored to the in a stack unless the reference is part of the class inheritnance which is also stored in the heap memory
     */
}