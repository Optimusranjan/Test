package kotlinbasic

fun main(args: Array<String>) {
    print("Enter starting number: ")
    val start = readLine()!!.toInt()
    print("Enter ending number: ")
    val end = readLine()!!.toInt()

    var sum = 0
    for (i in start..end) {
        if (i % 2 == 0) {
            sum += i
        }
    }

    print("Sum of even nos is $sum")
}