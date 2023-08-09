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
    println("This is optional: ${optional?.uppercase()}")

    val mau = Person(myName, age, doesSmile = true)
    println("This is Mau: ${mau.description()}")
    mau.hadBirthday()
    println("This is Mau now: ${mau.description()}")

    println("This is a constant: $CONSTANT")

    println("Let's play with some strings:")
    println("My name is $myName and it contains ${myName.length} chars")
    println(myName.uppercase())
    println(myName.lowercase())
    println(myName.replaceFirstChar { it.uppercase() })
    println(myName.replaceFirstChar(fun(c: Char): Char { return c.uppercase()[0] }))
    val nl = "\nNewLine"
    val nt = "\tNewTab"
    println("Value: $nl $nt $nl $nl $nt $nt")
    println("Is blank? ${"".isBlank()} ${"\n".isBlank()} ${"\t".isBlank()} ${myName.isBlank()} ${nl.isBlank()} ${nt.isBlank()}")
    println("Is empty? ${"".isEmpty()} ${"\n".isEmpty()} ${"\t".isEmpty()} ${myName.isEmpty()} ${nl.isEmpty()} ${nt.isEmpty()}")

    println("Let's play with ArrayList")
    val numbers: ArrayList<Int> = ArrayList()
    numbers.add(10)
    numbers.add(20)
    numbers.add(30)
    println("First element: ${numbers[0]}")
    println("Second element: ${numbers[1]}")
    println("Third element: ${numbers[2]}")
    numbers[1] = 25
    println("Updated second element: ${numbers[1]}")
    numbers.removeAt(0)
    println("ArrayList after removing first element: $numbers")
    val containsElement = numbers.contains(30)
    println("ArrayList contains 30: $containsElement")
    println("Size of ArrayList: ${numbers.size}")
    println("ArrayList elements:")
    for (num in numbers) {
        println(num)
    }
    numbers.clear()
    println("ArrayList after clearing: $numbers")

    println("Let's play with ArrayList a second time")
    val secondNumbers: ArrayList<Int> = arrayListOf(10, 20, 30, 40, 50)
    val firstEvenNumber = secondNumbers.find { it % 2 == 0 }
    println("First even number: $firstEvenNumber")
    val evenNumbers = secondNumbers.filter { it % 2 == 0 }
    println("Even numbers: $evenNumbers")
    val sum = secondNumbers.reduce { acc, num -> acc + num }
    println("Sum of all numbers: $sum")

    println("Let's play with HashMap")
    val studentScores: HashMap<String, Int> = HashMap()
    studentScores["Alice"] = 95
    studentScores["Bob"] = 80
    studentScores["Carol"] = 88
    val aliceScore = studentScores["Alice"]
    println("Alice's score: $aliceScore")
    studentScores["Bob"] = 85
    println("Updated score for Bob: ${studentScores["Bob"]}")
    studentScores.remove("Carol")
    println("HashMap after removing Carol: $studentScores")
    val containsAlice = studentScores.containsKey("Alice")
    println("HashMap contains key Alice: $containsAlice")
    val containsScore88 = studentScores.containsValue(88)
    println("HashMap contains value 88: $containsScore88")
    println("Size of HashMap: ${studentScores.size}")
    println("HashMap key-value pairs:")
    for ((name, score) in studentScores) {
        println("$name: $score")
    }
    studentScores.clear()
    println("HashMap after clearing: $studentScores")

    println("Let's play with HashMap a second time")
    val secondStudentScores: HashMap<String, Int> = hashMapOf(
        "Alice" to 95,
        "Bob" to 80,
        "Carol" to 88,
        "David" to 92,
        "Eve" to 78
    )
    val highScorerEntry = secondStudentScores.entries.find { it.value >= 90 }
    println("High scorer: ${highScorerEntry?.key} - ${highScorerEntry?.value}")
    val aboveEightyEntries = secondStudentScores.entries.filter { it.value >= 80 }
    println("Scores above 80:")
    for (entry in aboveEightyEntries) {
        println("${entry.key}: ${entry.value}")
    }
    val totalScore = secondStudentScores.values.reduce { acc, score -> acc + score }
    println("Total score: $totalScore")
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