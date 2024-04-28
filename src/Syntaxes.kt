

fun main(args: Array<String>){
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
    val isOnline = true
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
    val age = 17
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

    /**
     * Basically, one can combine more than one condition with the use of other boolena operators such as s && and || which stand for AND OR in boolean mathematics, then AND operator multiplies the values if the comparisons all yields to either true or false the answer evaluates to true if they end up in different responses then the answers might mean they are false the OR operator allow the user to make either of the two choices while the AND forces the user to have both conditions matching  in order for a certain decision to be applied
     * We can combine multiple conditions that needs to be tested in order for us to create some form of decision amking techniques
     * Strings as well can be compared in the example of logging in the application and one needs to check the passwords before they allow a user to use the system
     * You can as well compare greatnetss of String characters, it checks if the alphabets coming before or afterward are arranged in a certain order
     *
     * IF STATEMENTS*
     * We have been using the if statement, but we have said nothing concerning the statement
     * the if statement is programming construct that is used to test the boolean conditions so  a program can make decisions based on given conditions that it is given to test, if block runs only if the condition evaluates to true and the else block is an optional part that runs when the condition evaluates to false
     * One can write an if statement as an expression and return the value to a variable or constant
     * In the code below the = sign acts as a return statement hence returns the responses to the variables calling the state of the if statement
     * You can put code blocks on the body of the expression
     * */
    println("------------------------------------------------------------------")
    println("------------------------------------------------------------------")
    //writing the if statement as an expression
    val onLineStatus = if(isOnline) "online" else "offline"
    println("User online status is \"$onLineStatus\"")

    println("------------------------------------------------------------------")
    println("------------------------------------------------------------------")

    //writing an if statement as a regular if statement but return the value to the constant/variable
    var mark:Int = 90
    val performanceState =  if(mark>=70){
        "Grade is \"A\""
    }
    else if(mark>=60&&mark<=69){
        "Grade is \"B+\""
    }
    else if(mark>=50&&mark<=59){
        "Grade is \"B\""
    }
    else if(mark>=40&&mark<=49){
        "Grade is \"C\""
    }
    else if(mark>=30&&mark<=39){
        "Grade is \"D\""
    }
    else{
        "Grade is \"E\""
    }
    println("Your $performanceState")

    println("------------------------------------------------------------------")
    println("------------------------------------------------------------------")

    /**
     * LOOPS *
     * Loops are iterative structures
     * A while loop is one of the loops that will keep running for as long as the conditon is true until it is no longer true, hence there has to be a structure that update the condition to change the state of the counter
     * do while is the same as while loop except do while runs atleast once before the condition is checked and updates
     * You can break out of the loop if a certain condition has been found, example your are reading a json file and you have found what your looking for break statement might help to terminate the looping and show what is needed
     * */
    var counter:Int=0
    while(/*condition counter*/counter <= 10){
        /*what should happen*/
        if(counter >= 1 && counter <= 10){
        println("Counter in the while loop is now $counter")
        //update counter
        }
        counter++
    }
    println("------------------------------------------------------------------")
    println("------------------------------------------------------------------")
    /**
     *RANGES*
     * is another loop construct that can be used to iterate through a list or a range of values
     * range works best with countable constructs
     * range is usual inclusive that is it includes the begining value to the end value
     * range is denoted by .. hence can be written as 0..10 meaning iterate from 0 to 10
     * Until is half open meaning it includes the first part of the range but ends before 5 meanign it ends at 4
     * hence range are of two types which are open and half open (..) open range and (until) is half open range
     * downTo is another open range but it goes from top value to bottom one
     * ranges can be used in for loops and when expressions
     *
     *
     * FOR LOOPS*
     * for loop is similar to for(variable in range){
     *repeat() is another type of loop that works for a specific number of times
     * repeat(numberOfTimes){ write what should happen inside here}
     * sometime you want to iterate only based on certain numbers hence you might want to jump from one number to the other using step 2, which shows number of steps to jump from one number to another
     *
     * }
     */


    repeat(5){
        println("This is a $ ")
    }
    val counterAgain = 5
    for(i in 0..counterAgain){
        //note the use of i being the iterator counter rather than using the highest number in a range, this can be used to work on arrays as arrays are stored using indexes

        println("Current value of counter Again is $i")
    }
    println("------------------------------------------------------------------")
    println("------------------------------------------------------------------")

    //when is an equivalent of a switch statement in java and other languages
    // the action that you want to be taken can be pointed at by -> you can enclose the action using the {} and set the code that needs to be put inside of it
    // when can work with other data types such as Strings as well
    // you can pass a range of value that can be true
    // a when expression can be written and return values when it evaluates to true
    var hour = 100
    when(hour){
        in 0..5 -> println("Early morning")
        in 6..11 -> println("Morning")
        in 12..15 -> println("Afternoon")
        in 16..16 -> println("Evening")
        in 17..23 -> println("Evening")
        else -> println("Invalid time")
    }
    println("------------------------------------------------------------------")
    println("------------------------------------------------------------------")

     var hourOfDay = when(hour){
        in 0..5 -> "Early morning"
        in 6..11 -> "Morning"
        in 12..15 -> "Afternoon"
        in 16..16 -> "Evening"
        in 17..23 -> "Evening"
        else -> "Invalid time"
    }
    println(hourOfDay)

    println("------------------------------------------------------------------")
    println("------------------------------------------------------------------")

   var result =  when(hour){
        0,1,2,3,4,5 -> "Early morning"
        6,7,8,9,10,11 -> "Morning"
        12,13,14,15,16 -> "Afternoon"
        17,18,19,20,21 -> "Evening"
        22,23 -> "Evening"
        else -> "Invalid time"
    }
    println(result)

    println("------------------------------------------------------------------")
    println("------------------------------------------------------------------")
    /*
    * FUNCTION *
    * Functions are core part of any programming language, they perfom specific functions in the code
    * functions in kotlin are created with the fun keyword followed by a function name, a return type if no return type is provided then the return type is Unit(void), if you provide a return type you need to then return it or use the assignment operator in an expression
    * to call the function you simply pass the function name with the parameter if any is required
    *
    * FUNCTION parameters
    * these are variables like which store the argument that a function uses to pass inside the function
    * parameters have to state the type of data they are receiving from outside, type definition is done the same way as it is done on variables using the colon
    * arguements can be named, given initial values so it is easy for one to manipulate the function whey come incontact with it, named arguments help to pass needed arguements only when the function has too many arguements some of which are option to pass values
    * You can assign values to parameters on creation and provide optional parameters when necessary
    * to return values use the 'return' keyword with the type your writing, but in order for you to return anything you first need to
    * if a function consists of a single expression you can just assign it an equal sign as a return type
    * parameters in Kotlin can not be reassigned, to alter the argument you must create another variable and return the value You can have a function with multiple definitions and this is called function overloading, the compiler is able to tell the difference by looking at the type of data that is being passed
    * function overloading must be differiated through the parameters that it is capable to accept
    * the parameters must be different otherwise it will cause an error and you cant use the return type to overload the function
    *functins can be assigned to variables using the :: (method reference operator)
    * */
    fun overloadeFunction(value:String){
        println("overloaded with String $value")
    }
    fun overloadedFunction(value:Int){
        println("overloaded with integer $value")
    }
    //the below function is designed to crush the program
    fun doNothing():Nothing{
        while (true){
        }
    }

    fun isPrime(numbers:Int){
        for(i in 1..numbers){
        if((i%3!=0) && (i%2!=0) && (i%5!=0)){
            println("$i is a prime number")
        }
//        else{
//            println("$i is not prime")
//        }
        }
    }
    overloadedFunction(12)
    overloadeFunction("Sia")
//    doNothing()
    isPrime(100)

    println("------------------------------------------------------------------")
    println("------------------------------------------------------------------")

    /**
     * Nullability
     * in this section we will discuss the declaration of null assigned values which require no value in order for them to be implemented
     * a valid value that represent an absence of the value is called sentinel value
     * Null is a name given to the absence of value
     * null is a sentinel value, it might mean zero in other languages
     * a nullable is allowed to hold both a value and no value
     * ? is a nullable box that allow the value to be null or have a type hence the type must be defined incase the value is provide
     *playing safe might want a user to check if they have a null value being sent forth or not to avoid the nullPointerException error at runtime
     */
    val errorCodedExpected: Int? //declaring a variable without the initialization
    // to check for null presence
    // safe call is assigning nullables to all variables
    /**
     * Collections in Kt
     *
     * ARRAYS AND LISTS
     * ARRAYS
     * arrayOf() is used to create arrays in Kotlin
     */
    val arrayOfNumbers: Array<Int> = arrayOf(12,15,15)
    //Array<> is used for collecting array in between the angle brackets pass the type that an array will be using throughout
    //to store arrays use a method arrayOf()
    //if you dont specify the type then there is no need to declare the Array<> type Kotlin can just infer that

    val stringsOfNames = arrayOf("Ronald Chaula","Suma Msokwa")
    //arrays can also be of primitive type example
    val primitiveTypes = intArrayOf(4,3,4)

    //One of the most common type of array known to Java devs is the Array generic at the main function
    //main(args: Array<String>) ter args is a variable name of type Array which store String
//arrays are made of indexes hence they position and amount is countable we can use the for loop to iterate the reading of it
    for(arg in args){
        println("The available arguments are $arg")
    }
    println("------------------------------------------------------------------")
    println("------------------------------------------------------------------")
    for (string in stringsOfNames){
        // assigning a name to a variable and then reading the values from the array and assigning them to the variable we dont have to use a counter to go over the list
        println("$string")
    }
    println("------------------------------------------------------------------")
    println("------------------------------------------------------------------")
    stringsOfNames.forEach{
            string -> println("Name is $string")
    }
    println("------------------------------------------------------------------")
    println("------------------------------------------------------------------")
    //List are similar to arrays, but they are more dynamic than Arrays

    val listItems: List<Any> = listOf("String",2,stringsOfNames)
    listItems.forEach{
        item-> println("Item is $item")
    }
    //isEmpty() can be used to check the emptiness of the list or arrays
    //.size can be used the check how many items are available
    //.first() checks the first Items
    //    .last() returns the last item in a list
    //minOrNull() returns the minmum or nullable object
    //maxOrNull() returns the max or nullable object
    //You can basically use the old style index to access arrays/list
    //you can basically use get() to get the value of the list or array
    //IndexOutOfBound exception is still present hence it is important to know the list/array size before interacting with it
    //slice(begin to end) can use range to do so slice cuts the things
    //the ranged values can be extracted
    //contains can check availability of an item in a list or array
    //add() adds new elements to the list an alternative for the add method is += whcih add the value to the end of the list
    //to add at a specific position pass the position then pass the element that needs to be added
    // these functions return the boolean states
    //remove() removes the item from the list and also returns a boolean status
    //removeAt() removes the item at a specific position rather than just removing it
    //indexOf() returns the position of the element pass to it
    //instead of using the index position to put the value you can use set to pass position and element
    //
    /**
     * Maps And Sets
     * Maps are unordered set of elements stored as key index values
     * keys can point to the same value if the keys and values are of the same type
     * maps can be created by passing the mapOf(key to value,key1 to value2)
     * maps are created using an interface unlike the Pair or Triple which are created using the infix function
     * namesAndScores = mutableMapOf()
     * to access values using keys you just pass the
     * If you use a key that does not exist the value returned will be null
     * do add new value into the map you use put, which adds the value to the end of a map or u may use the array notation
     * all map values are created using the key to value
     * remove() can remove the elements from the
     */
    val pair = "name" to "Ronald"
    val mutableMap = mutableMapOf(pair)
   for ((key,value) in mutableMap){
       println("$key is $value")
   }
    println("------------------------------------------------------------------")
    println("------------------------------------------------------------------")
    /** sets can be created using the
     * setOf() which allow storation of a single value without duplication
     * You can transform any array into a set by spreading its values usnig the spread operator *
     */

    /** LAMBDA
     * A lambda expression is a function with no name
     * lambdas are aslso known as anonymous functions
     * they derive their name from lambda calculus of Alonzo Church lambdas are synonymous with closure, they also go by that name in many other languages like JavaScripts
     * closure are said to manipulate anything they are in scope with, the variables in a lambda are said to be captured by the lambda
     */

    //lambda function
    var multiplyLambda: (Int,Int) -> Int
    var add = {a:Int,b:Int -> a+ b}
    add(12,12)
    println("------------------------------------------------------------------")
    println("------------------------------------------------------------------")
    /**OOP
     * CLASSES
     *
     */

    //Classes in object oriented programming enable a programmer to create new types, the new types are called named types


}