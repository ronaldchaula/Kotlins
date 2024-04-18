

fun main(){
    //    Unique types
    /**
     * In this section we have learned of unique types such as Nothing,Unit and Any but as well as other unique types like Pair and Triple which work isolate similar to Tuples in Python
     * Any is a super type of all types including classes, it is similar to the Object type being a super class in Java
     * Unit is similar to void in Java it means a function or variable is of no type
     * Nothing is similar to Unit, but it means the function does nothing, or it has no end to execution hence might be ignored if possible
     * Pair and Triple might be used to store data that travels in pairs example coordinates or 3D values
     * We have also learned on the technique of writing multiline printing using triple quotes and trimIndent() method using the dot notation at the end of the multiline printing
     * */
    println("------------------------------------------------------------------")
    println("------------------------------------------------------------------")
    val coordinates: Pair<Int,Int> = 2 to 5
    //assigning the  values to the variable of Pair type
    val coordinatedBeacon: Pair<Int,Int> = Pair(12,15)
    //destructuring reading of the Pair values stored in a variable
    val (x,y) = coordinates
    println("""
        Result from the destructured Pair values
        $x is the first value
        $y is the second value
    """.trimIndent())
    println("------------------------------------------------------------------")
    println("------------------------------------------------------------------")
    //reading values using the dot notation
    val firstValue = coordinatedBeacon.first
    val secondValue = coordinatedBeacon.second
    println("""
        Result from the the dot notation reading of Pair values
        $firstValue is the first value
        $secondValue is the second value
    """.trimIndent())
    println("------------------------------------------------------------------")
    println("------------------------------------------------------------------")
    //Similar approach maybe used to read the values of the Triple type
    val date: Triple<Int,Int,Int> = Triple(18,4,2024)
    //the below method reads using the dot notations
    val day = date.first
    val month = date.second
    val year = date.third
    //let's try by destructuring

    val (firstCoordinate, secondCoordinate, lastCoordinate) = date
    println("""
        Result from the destructured Triple values
        $firstCoordinate is the first value
        $secondCoordinate is the second value
        $lastCoordinate is the last value
    """.trimIndent())
    println("------------------------------------------------------------------")
    println("------------------------------------------------------------------")
    // we can print all methods and you shall see the same result for each
    println(""" 
        Result from the dot notation reading of the Triple values
        Today date is $day
        Today month is $month
        Today year is $year
    """.trimIndent())
    println("------------------------------------------------------------------")
    println("------------------------------------------------------------------")
//    Control Flow in details
    /**
     * The control flow in Kotlin or any other programming language is largely controlled by the use of boolean status that is being tested
     * the data type that is being tested is called a boolean state
     * Boolean is the data type, and there are only two types of values in a boolean state which are true and false
     * the above two types which are Pair and Triple are also data types which store data in pair or in triplets forms, Pair as shown above uses something similar to generics brackets and accepts only two values of any type these are defined by the developer at assign the value to the type one uses the Pair() functions and pass the two values using the comma separation or may use the format of firstValue "to" last value, to access each value from the variable one needs to use the dot operator with the first or the second on the variable/constant name or may choose to destructure the variable by assigning the value to the other variable definitions example val (x,y) = coordinated
     * */
    //Boolean test
    // the below code checks if someone is online or not it is a variable hence var
    var isOnline:Boolean = true
    if(isOnline){
        // if the isOnline variable evaluates to true this part will be executed if not the code inside here wont run
        println("user is online")
    }
    else{
        println("user is offline")
    }
    //any comparison leads to either true or false statement hence all comparison return a boolean value
    //example 10 == 12 returns false which is a boolean type
    // note the new operator == which a combination of two operators which is called the equality operator
    //!= is a not equal operator which is a combination of two operators the ! which is a not operator and the = assignment operator
    //! not operator alone negates the value and change it between the two states which are either true or false
    //other comparison operators are greater than and less than operators > checks if the value on the left is bigger than the one on the right the < checks if the value on the left is less than the one on the right
    //>= as arranged greater than or equal checks if the value on the left is greater than or equal to the one on the right this is checking some form of range from a predefine starting point example checking if someone is from 18 years old or greater than that
    println("------------------------------------------------------------------")
    println("------------------------------------------------------------------")
    var age: Int = 17
    if(age>=18){
        println("user is old enough to use the website")
    }else{
        println("User is not old enough to use the website")
    }
    println("------------------------------------------------------------------")
    println("------------------------------------------------------------------")
    if(10==12){
        println("the value are similar")
    }
    else{
        println("no they are not the same")
    }
    //end of this part
    println("------------------------------------------------------------------")
    println("------------------------------------------------------------------")
}