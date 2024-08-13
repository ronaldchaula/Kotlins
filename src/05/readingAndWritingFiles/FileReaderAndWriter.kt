package `05`.readingAndWritingFiles

import java.io.File
import kotlin.io.path.writeLines

fun main(){
//connecting to the file
    println("If you wish to read a file, please include its exention")
    print("Enter file name you wish to read: ")
    val fileName = readlnOrNull() ?: ""
    try {

        val scoreFile = File("./src/05/readingAndWritingFiles/$fileName")

        val doesExist = scoreFile.exists()

           if(doesExist){
            println("Here are the scores:")
           }
            scoreFile.forEachLine { println(it) }

        if(doesExist){
                val sortedFile = scoreFile.readLines().sorted()
                println("Here are the sorted scores:")
                sortedFile.forEach { println(it) }
            //we store the path to sorted-scores.pdf, and we use that path to writeLines()
                val outputFile = File("./src/05/readingAndWritingFiles/sorted-scores.txt").toPath()
                outputFile.writeLines(sortedFile)
            }

    }
    catch (error: Exception){
        println("File not found on the current directory")
    }

}