import kotlin.properties.Delegates

class MiClase {
    lateinit var p: Propiedad
    val x:Int by lazy{1000}

    var dato:Int by Delegates.observable(0){p,oldNew,newVal -> changed()}

    private fun changed() {
        println("El cambio del dato es $dato")
    }

    class Propiedad{}
}


