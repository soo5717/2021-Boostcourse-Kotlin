package boostcourse1.chapter6.section8

import java.io.FileOutputStream
import java.io.PrintWriter
fun main() {
    PrintWriter(FileOutputStream("d:\\test\\output.txt")).use {
        it.println("hello")
    }
}