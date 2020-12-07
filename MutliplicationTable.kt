package kotlinbasic

fun main(args: Array<String>) {
    println("***** Multiplication table generator *****")
    print("Enter a number : ")
    val num = readLine()!!.toInt()

    for (i in 1..10) {
        println("$num x $i = ${ num * i }")
    }
}