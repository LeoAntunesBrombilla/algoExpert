package easy

fun twoNumberSumSol1(array: MutableList<Int>, targetSum: Int): MutableList<Int> {

    var result: Int
    val answer: MutableList<Int> = mutableListOf()

    for(i in 0 until array.size) {
        for(j in 0 until array.size) {
            result = array[i] + array[j]
            if(result == targetSum && array[i] != array[j]) {
                answer.add(array[i])
                answer.add(array[j])
                return answer
            }
        }
    }

    return answer
}

fun twoNumberSumSol2(array: MutableList<Int>, targetSum: Int): MutableList<Int> {

    var result: Int
    val answer: MutableList<Int> = mutableListOf()

    for(i in 0 until array.size) {
        for(j in 0 until array.size) {
            result = array[i] + array[j]
            if(result == targetSum && array[i] != array[j]) {
                answer.add(array[i])
                answer.add(array[j])
                return answer
            }
        }
    }

    return answer
}



fun main() {
    val array = mutableListOf<Int>(4,6)

    val targetSum = 10

    println(twoNumberSumSol1(array, targetSum))
}