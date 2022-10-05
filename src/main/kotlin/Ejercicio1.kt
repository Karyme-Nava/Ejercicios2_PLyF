fun descuento(precio: Double, descuento: Double): Double{
    return (precio * (100.0 - descuento)) / 100.0
}

fun iva(precio: Double, porcIva: Double): Double{
    return (precio * (100.0 + porcIva)) / 100.0
}

fun conversion(cestaMap: HashMap<Double, Double>, operacion: (Double, Double) -> Double): Double{
    var precioFinal = 0.0;
    for ((precio, porcentaje) in cestaMap){
        precioFinal += operacion(precio, porcentaje)
    }
    return precioFinal
}

fun main() {
    val cestaMap1 = hashMapOf(100.0 to 10.0, 200.0 to 5.0, 500.0 to 20.0, 150.0 to 12.0)
    println(String.format("Precio final cesta 1 = %.2f", conversion(cestaMap1, ::descuento)))
    val cestaMap2 = hashMapOf(120.0 to 15.0, 300.0 to 14.0, 1000.0 to 5.0, 163.0 to 9.0)
    println(String.format("Precio final cesta 2 = %.2f", conversion(cestaMap2, ::iva)))
}