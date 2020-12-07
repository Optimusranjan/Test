package kotlinbasic

fun main(args: Array<String>) {
    val mydictionary = mapOf<String, String>(
            "apple" to "Apple is a sweet fruit.",
            "ball" to "Ball is used to play games like football, basketball, volleyball etc",
            "cat" to "Cat is an animal.",
            "dog" to "Dog is an pet animal.",
            "elephant" to "Elephant is a wild animal."
    )

    print("Choose a word (apple, ball, cat, dog, elephant): ")
    val input = readLine()!!.toString()

    if(input in mydictionary) {
        print(mydictionary[input])
    } else {
        print("Invalid input")
    }
}