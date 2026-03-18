open class Persona (nombre:String,edad:Int){

//    var nombre: String = "Jose"
//    val edad: Int = 20
    var nombre:String = "-"
    open var edad:Int = 0

    init{
        this.nombre = nombre
        this.edad = edad
        println("Constructor 1")
    }

    constructor(nombre:String, edad:Int,x:Int):this(nombre,edad){
        print("Constructor 2")
    }

    constructor(nombre:String,edad:Int,x: Int,y:Int):this(nombre,edad){
        print("Constructor 3")
    }

    open fun caminar(){
        println("Caminar")
    }
    fun correr(){
        println("Correr")
    }
}