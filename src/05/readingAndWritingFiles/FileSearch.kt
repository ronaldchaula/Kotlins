package `05`.readingAndWritingFiles

import java.io.File

fun main(){
    //receiving user input from the command line
    println("Please enter a file name: ")
    val fileName = readlnOrNull() ?:""
    //check whether the file exists or not
    val isValid = File(fileName).isFile
    if (isValid) println("The entered file $fileName is valid") else println("File does not exist")

}