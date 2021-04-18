package boostcourse1.chapter6

import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter
fun main() {
    PrintWriter(FileOutputStream("d:\\test\\output.txt")).use {
        it.println("hello")
    }
}