var med: Double = 0.0
var desv: Double = 0.0
fun media(numeros: List<Double>): Double{
    var sum = 0.0
    for(num in numeros) sum+=num
    return sum/numeros.size
}

fun desvTipica(numeros: List<Double>): Double{
    var sum = 0.0
    for(num in numeros) sum+=(num-med)*(num-med)
    return Math.sqrt(sum/numeros.size)
}

fun puntuacionTipica(valor: Double): Double{
    return (valor-med)/desv
}

fun esAtipico(valor: Double): Boolean{
    if(puntuacionTipica(valor)>3.0 || puntuacionTipica(valor)<-3) return true;
    return false;
}

fun valAtipicos(numeros: List<Double>): List<Double>{
    val atipicos = mutableListOf<Double>()
    for(num in numeros){
        if(esAtipico(num)) atipicos.add(num)
    }
    return atipicos
}

fun main(){
    val lstMuestra1 = listOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 1000.0)
    med = media(lstMuestra1)
    desv = desvTipica(lstMuestra1)
    println("Valores atípicos en la muestra 1 -> ${valAtipicos(lstMuestra1)}")
    val lstMuestra2 = listOf(15.0, 15.2, 16.8, 17.1, 18.3, 18.9, 19.2, 19.8, 20.1, 21.3, 21.9, 36001.7)
    med = media(lstMuestra2)
    desv = desvTipica(lstMuestra2)
    println("Valores atípicos en la muestra 2 -> ${valAtipicos(lstMuestra2)}")
}