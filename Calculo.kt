fun main() {
    while (true) {
        println("Seleccione una opcion:")
        println("1. Calcular el area de un cuadrado")
        println("2. Calcular el area de un circulo")
        println("3. Calcular el area de un triangulo")
        println("4. Salir")


        print("Opción: ")
        val opcion = readLine()?.toInt() 

        when (opcion) {
            1 -> calcularAreaCuadrado()
            2 -> calcularAreaCirculo()
            3 -> calcularAreaTriangulo()
            4 -> {
                println("Saliendo del programa. ¡Adiós!")
                break
            }
            else -> println("Opción no válida, intente de nuevo.")
        }
    }
}

fun calcularAreaCuadrado() {
    print("Ingrese el lado del cuadrado: ")
    val lado = readLine()?.toDoubleOrNull()

    if (lado != null && lado > 0) {
        val area = lado * lado
        println("El área del cuadrado es: $area")
    } else {
        println("Entrada no válida. Intente nuevamente.")
    }
}

fun calcularAreaCirculo() {
    print("Ingrese el radio del círculo: ")
    val radio = readLine()?.toDoubleOrNull()

    if (radio != null && radio > 0) {
        val area = 3.14159 * radio * radio // Aproximación de pi
        println("El área del círculo es: $area")
    } else {
        println("Entrada no válida. Intente nuevamente.")
    }
}

fun calcularAreaTriangulo() {
    print("Ingrese la base del triángulo: ")
    val base = readLine()?.toDoubleOrNull()
    print("Ingrese la altura del triángulo: ")
    val altura = readLine()?.toDoubleOrNull()

    if (base != null && base > 0 && altura != null && altura > 0) {
        val area = (base * altura) / 2
        println("El área del triángulo es: $area")
    } else {
        println("Entradas no válidas. Intente nuevamente.")
    }
}
