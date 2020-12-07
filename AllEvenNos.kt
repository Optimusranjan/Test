package kotlinbasic

fun main(args: Array<String>) {
    print("Enter starting number: ")
    val start = readLine()!!.toInt()
    print("Enter ending number: ")
    val end = readLine()!!.toInt()

    for (i in start..end) {
        if (i % 2 == 0) {
            println("$i is even")
        }
    }
}