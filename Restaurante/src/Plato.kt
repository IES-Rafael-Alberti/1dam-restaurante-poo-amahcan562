class Plato(val nombre: String, val precio: Double, val tiempoReparacion: Int, val ingredientes: List<String>) {

    init {
        require(nombre.isNotBlank())
        require(precio > 0.0)
        require(tiempoReparacion > 1)
        require(ingredientes.isNotEmpty())
    }

    fun agregarIngrediente(ingrediente: String) {

    }

    override fun toString(): String {
        return "$nombre ($tiempoReparacion min.) -> $precio€ ($ingredientes)."
    }
}