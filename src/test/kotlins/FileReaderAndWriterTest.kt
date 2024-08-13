package test.kotlins

import org.jetbrains.annotations.TestOnly
import java.io.File

class FileReaderAndWriterTest {
    @TestOnly
    fun verifyFilePathFound(path: String) {
        val file = File(path).exists()
        assert(file)

    }
}