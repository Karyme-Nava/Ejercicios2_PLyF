fun nota(calif: Double): String{
    return when(calif){
        in 95.0..100.0 -> "Excelente"
        in 85.0..94.0 -> "Notable"
        in 75.0..84.0 -> "Bueno"
        in 70.0..74.0 -> "Suficiente"
        else -> "Desempeño insuficiente"
    }
}

fun calif(diccionario: HashMap<String, Double>): HashMap<String, String>{
    val resultados = hashMapOf<String, String>()
    for ((materia, calif) in diccionario){
        resultados[materia.uppercase()] = nota(calif)
    }
    return resultados
}

fun main(){
    val diccionario = hashMapOf("Algebra" to 87.0, "Comprension lectora" to 65.2, "Fisica" to 72.9,
        "Etica" to 98.0, "Fundamentos de programacion" to 82.6)
    val resultados = calif(diccionario)
    for(r in resultados) println(r)
}