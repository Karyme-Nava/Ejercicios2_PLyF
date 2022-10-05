fun modulo(vector:  Pair<Double, Double>): Double{
    return Math.sqrt(Math.pow(vector.first, 2.0) + Math.pow(vector.second, 2.0))
}

fun main(){
    val v1=4.0 to 3.0
    print("Modulo vector $v1 = ")
    println(String.format("%.2f", modulo(v1)))
    val v2=1.0 to 1.0
    print("Modulo vector $v2 = ")
    println(String.format("%.2f", modulo(v2)))
}