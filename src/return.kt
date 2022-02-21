fun main(){
printName("lavyne")
var result = modulus(35,12)
    println(result)
    var sum =add(32,23, num3 =29,num4=12)
    println(sum)
    name()

}

fun printName(name: String){
    println("hello "+ name)
}

fun modulus(num1: Int, num2: Int):Int {
    var difference = (num1 % num2)
    return difference
}
fun add(num1: Int, num2: Int, num3: Int,num4: Int): Int{
    var sum = num1 + num2 + num3 + num4
    return sum
}
fun name(){
    println("i love sports and exercising")
}