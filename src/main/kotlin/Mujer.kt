class Mujer: Persona{
    override var edad = 0

    constructor(nombre:String, edad:Int) : super(nombre,edad)

    override fun caminar() {
        println("caminar MUJER")
    }
}