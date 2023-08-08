private const val CONSTANT = "my value"

fun myFunction(param: String) {
    println("hello parameter: $param")
}

fun main() {
    println("Hello World")
    val myName = "Mau"
    var age = 27

    println("My name is $myName and my age is $age")

    age += 1
    println("Now my age is $age")
    println("Next my age will be " + (age + 1))

    val knowledge = listOf("React", "TypeScript")
    for (k in knowledge) {
        println("I know $k")
    }

    val newKnowledge = mutableListOf("Architecture")
    newKnowledge.add("Android")
    for (n in newKnowledge) {
        println("I'm learning $n")
    }

    for (i in 1..3) {
        println("Counting: $i")
    }

    for (i in 1 until 3) {
        println("Counting: $i")
    }

    val is28 = age == 28
    if (is28) {
        println("I'm 28")
    } else {
        println("I'm not 28")
    }

    myFunction("hello")

    var optional: String? = null
    if (!is28) {
        optional = "I'm not 28!"
    }
    println("This is optional: ${optional?.toUpperCase()}")

    val mau = Person(myName, age, doesSmile = true)
    println("This is Mau: ${mau.description()}")
    mau.hadBirthday()
    println("This is Mau now: ${mau.description()}")

    println("This is a constant: $CONSTANT")
}

class Person(private val name: String, private var age: Int, doesSmile: Boolean) {
    //    private val name: String = name
//    private var age: Int = age
    private val nickname: String

    init {
        val smiley = if (doesSmile) ":)" else ":("
        nickname = "$name $smiley"
    }

    fun description(): String {
        return "Name $name, age $age"
    }

    fun hadBirthday() {
        age += 1
    }
}