fun invertirFrase(frase: String): String{
    var resultado = ""
    for(ch in frase){
        when{
            ch.isLowerCase() -> resultado += ch.uppercaseChar()
            ch.isUpperCase() -> resultado+= ch.lowercaseChar()
            else -> resultado += ch
        }
    }
    return resultado
}

fun invertirLista(operacion: (String) -> String,lstFrases: List<String>): MutableList<String>{
    var lstResultados = mutableListOf<String>()
    for(s in lstFrases){
        lstResultados.add(operacion(s))
    }
    return lstResultados
}

fun main(){
    val lstFrases = listOf("Hola", "ejemplo", "FRASES 1", "palabras de ejemplo", "aDIOS")
    val lstResultados = invertirLista(::invertirFrase, lstFrases)
    println(lstResultados)
}