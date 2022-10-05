fun contarLetras(frase: String): MutableMap<String, Int>{
    val delimitador=" "
    val palabras = frase.split(delimitador)
    val resultados = mutableMapOf<String, Int>()
    for (palabra in palabras){
        resultados.put(palabra, palabra.length)
    }
    return resultados
}

fun main(){
    val frase1 = "Hola mundo"
    val resultados1 = contarLetras(frase1)
    for ((palabra, longitud) in resultados1) println("$palabra -> $longitud")
    println()
    val frase2 = "Karyme Jocelyn Nava Osorio"
    val resultados2 = contarLetras(frase2)
    for ((palabra, longitud) in resultados2) println("$palabra -> $longitud")
}