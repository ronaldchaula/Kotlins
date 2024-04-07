class ObjectifiedKotlin (age: Int,firstName:String,middleName:String,lastName:String){
    //in kotlin every value is an object as every type is an object
    //classes are the parent class for all objects
    val objectCreate = ObjectifiedKotlin(30, "Ronald","Henry","Chaula")
}

class Employee(
    val employeeId: String?,
    val employeeName:String?,
    var employeeAge:Int?,
    val employeeDepartment:String?
)
//the above class is called an empty class
// you can pass constructor parameters from it even without the body
//the java old dot notation is called reference to operator or object, the same tricks we use in java can be used in Kotlin
fun main(args: Array<String>) {
    val anen = Employee("2045","Anen Isack", 19,"Computer Science and Engineering")
    println("${anen.employeeName} employee identity number is ${anen.employeeId}")
}