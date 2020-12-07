package kotlinbasic

fun main(args: Array<String>) {
    val numbers = arrayOf(2,1,5,3,6,4,7,8,9,8554,66,71,3265,6,64,652,4,64,+9,6,5,6+5,6,53,49,56,56,6,56,5+6,56,5)

    var sum = 0
    for (i in numbers) {
        if (i % 2 == 0) {
            sum += i
        }
    }
    print("Sum of even nos is $sum")
}