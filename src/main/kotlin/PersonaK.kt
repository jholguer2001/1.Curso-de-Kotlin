data class PersonaK(val nombre: String) {
    var edad:Int = 10
        get() = field
        set(value){
            if (value>10){
                field = 2
            }else{
                field = -1
            }

        }
}