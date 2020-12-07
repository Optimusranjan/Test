package kotlinbasic

fun main(args: Array<String>) {
    val numbers = arrayOf(2,1,5,3,6,4,7,8,9,8554,66,71,3265,6,64,652,4,64,+9,6,5,6+5,6,53,49,56,56,6,56,5+6,56,5)

    var min : Int = numbers[0]
    var max : Int = numbers[0]

    for (i in numbers) {
        if (min > i) {
            min = i
        }
        if(max < i) {
            max = i
        }
    }
    print("Minimum: $min, Maximum: $max")
}