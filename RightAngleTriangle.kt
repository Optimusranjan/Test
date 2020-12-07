package kotlinbasic

fun main(args: Array<String>) {
    print("Enter number of rows: ")
    val rows = readLine()!!.toInt()

    for (i in 1..rows) {
        for (j in i downTo 1) {
            print("*")
        }
        println("")
    }
}