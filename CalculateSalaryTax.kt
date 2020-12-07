package kotlinbasic

fun main(args: Array<String>) {
    print("Enter you monthly salary : ")

    val salary = readLine()!!.toInt()
    val tax : Double


    tax = calculateTax(salary * 12)
    print("You tax is $tax")
}

fun calculateTax(salary: Int) : Double {
    var tax : Double = 0.0
    when(salary) {
        in 1..200000 -> tax = taxCalculator(salary, 1)
        in 200001..350000 -> tax = taxCalculator(200000, 1) + taxCalculator(salary - 200000, 15)
        in 350001..Int.MAX_VALUE -> tax = taxCalculator(200000, 1) + taxCalculator(150000, 15) + taxCalculator(salary - 200000 - 150000, 25)
    }
    return tax
}

fun taxCalculator(salary: Int, rate : Int): Double {
    return (salary * rate) / 100.0
}