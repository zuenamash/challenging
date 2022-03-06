fun main() {
    set()
    count()
    capitals()
    var y=identify(arrayOf("zuenah","mary","cheko","ruth"))
    println(y)

}
fun set(){
    var people= arrayOf("luo","kukuyu","maasai","luhya")
    println(people.contentToString())
}

fun count(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var o= numbers.get(1)
    var p=numbers.get(6)
    var sum= o+p
    println(sum)
    println(numbers[11])
    println(numbers.sorted())
}
fun capitals(){
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach { capitals ->
        println(capitals.capitalize())
    }
}
fun identify(get:Array<String>):String{
    var names= get.contentToString()
    return names
}




