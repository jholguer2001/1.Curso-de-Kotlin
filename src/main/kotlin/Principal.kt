// 1. VariablesTipos.kt

//fun main() {
//    // Definición de variables
//    var numero: Int = 10
//    var n = 10
//    var m: Int = 90
//
//    // Tipos básicos
//    var entero: Int = 10
//    var f: Float = 10.1f
//    var d: Double = 30.30000
//    var l: Long = 100L
//    var s: Short = 1
//    var b: Byte = 127
//
//    var mayor: Boolean = false
//    var caracter: Char = 'l'
//
//    // Cadenas (Strings)
//    var cadena = "Jose Lujan"
//    var c = "Hola esto es una nueva cadena que quiero utilizar"
//
//    println(cadena.get(2)) // Obtiene el carácter en la posición 2
//    println(cadena.length)
//
//    // Arreglos básicos
//    var arreglo = arrayOf("jose", "dimas", "lujan", "maria", "pedro")
//    arreglo[0] = "hola mundo"
//    println(arreglo[0])
//}


//////

// 2. CastingSeguridad.kt manejo de nulos

//fun main() {
//    // 16 & 17. Constantes y Conversión explícita
//    val constanteX = 10
//    var decimal = 10.9
//    val enteroConvertido = decimal.toInt()
//    println(enteroConvertido)
//
//    // 18. Smart Cast
//    val texto: Any = "Hola Mundo"
//    if (texto is String) {
//        println(texto.length) // El compilador ya sabe que es String
//    }
//
//    // 19. Unsafe cast (puede lanzar excepción si es nulo)
//    val x: String? = null
//    // val y: Int? = x as Int? // Esto fallaría si no son compatibles
//
//    // 20. Safe cast (devuelve null si falla la conversión)
//    val xSafe: String? = null
//    val ySafe: Int? = xSafe as? Int
//    println(ySafe)
//}


/////

// 3. OperadoresControl.kt

//fun main() {
//    // Condicional If
//    var x = 10
//    if (x > 5) {
//        println("Si es mayor a 5")
//    } else {
//        println("Es menor")
//    }
//
//    // Operadores Aritméticos y Asignación
//    var a = 1
//    var b = 2
//    a += b
//    println("Suma: ${a + b}")
//
//    // If como expresión
//    val resultado = if (x > 50) 0 else 1
//
//    // When (Equivalente a Switch)
//    when (x) {
//        1 -> println("Es uno")
//        in 11..20 -> println("Está en el rango 11-20")
//        else -> println("No encontrado")
//    }
//}

//////

// 4. CiclosBucles.kt

//fun main() {
//    // For con rangos y steps
//    for (e in 1..10) { println(e) }
//
//    for (x in 1..10 step 2) { println(x) }
//
//    for (x in 100 downTo 0 step 10) { println(x) }
//
//    // While y Do-While
//    var z = 1
//    while (z < 10) {
//        println(z)
//        z++
//    }
//}


/////

 //5. FuncionesAvanzadas.kt

//import java.math.BigInteger
//
//// 1. Asegúrate de que esta función esté al principio del archivo, fuera de todo.
//fun main(args: Array<String>) {
//    println("--- Ejecutando Pruebas de Funciones ---")
//
//    // Llamadas a las funciones
//    println("1. Primera: ${primera()}")
//
//    print("2. Saludar (8+10): ")
//    saludar(8, 10)
//
//    println("3. Cuadrado de 5: ${cuadrado(5)}")
//
//    print("4. Varargs (1,2,3): ")
//    sumarVarios(1, 2, 3)
//
//    val frase = "Hola Mundo Desde Kotlin"
//    println("5. Extensión (sin espacios): ${frase.quitarEspacios()}")
//
//    println("6. Fibonacci de 10: ${fib(10, BigInteger.ONE, BigInteger.ZERO)}")
//}
//
//
//fun primera(): Boolean {
//    return true
//}
//
//fun saludar(n: Int, x: Int = 0) {
//    println(n + x)
//}
//
//fun cuadrado(x: Int): Int = x * x
//
//fun sumarVarios(vararg numeros: Int) {
//    for (n in numeros) print("$n ")
//    println()
//}
//
//fun String.quitarEspacios(): String {
//    val r = Regex("\\s+")
//    return r.replace(this, "")
//}
//
//tailrec fun fib(numero: Int, n1: BigInteger, n2: BigInteger): BigInteger {
//    return if (numero == 0) n2 else fib(numero - 1, n1 + n2, n1)
//}


/////

// 6. EjerciciosLogica.kt

//fun main() {
//    println("--- Ejercicio 1: Palíndromos ---")
//    val palabra1 = "reconocer"
//    val palabra2 = "kotlin"
//    println("¿Es '$palabra1' palíndromo?: ${esPalindromo(palabra1)}")
//    println("¿Es '$palabra2' palíndromo?: ${esPalindromo(palabra2)}")
//
//    println("\n--- Ejercicio 2: Contador de Caracteres ---")
//    verificar("Hola 123 @#")
//
//    println("\n--- Ejercicio 3: Triángulo de Asteriscos ---")
//    imprimirTriangulo(5)
//}
//
//
//
//fun esPalindromo(p: String): Boolean = p == p.reversed()
//
//fun verificar(cadena: String) {
//    var letr = 0; var num = 0; var esp = 0
//    val charsEspeciales = listOf('@', '#', '$', '%', '/', '(', ')')
//
//    for (c in cadena.lowercase()) {
//        when {
//            c.isLetter() -> letr++
//            c.isDigit() -> num++
//            c in charsEspeciales -> esp++
//        }
//    }
//    println("Letras: $letr, Números: $num, Especiales: $esp")
//}
//
//fun imprimirTriangulo(cantidad: Int) {
//    // Nota: 0..cantidad imprimirá (cantidad + 1) filas
//    for (i in 0 until cantidad) {
//        repeat(i + 1) { print("* ") }
//        println()
//    }
//}

////

// 7. ColeccionesMapas.kt

//fun main(args:Array<String>) {
//
//    val tienda: MutableMap<String,Int> = mutableMapOf("Pera" to 10,"Naranja" to 1,"Uva" to 2)
//    println(tienda["Pera"])
//
//    tienda.put("Durazno", 99)
//    println(tienda)
//}
//
//class Dato{
//
//}
//
//class Elemento(var elemento:String){}
//fun Elemento.sumar(e:Elemento):Elemento{
//    return Elemento(this.elemento + e.elemento)
//}

