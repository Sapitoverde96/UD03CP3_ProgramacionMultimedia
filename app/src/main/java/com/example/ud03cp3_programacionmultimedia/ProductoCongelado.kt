package com.example.ud03cp3_programacionmultimedia

class ProductoCongelado(
    private var temperatura: Int,
    fechaCaducidad: String,
    numeroLote: Int
    ) : Producto(fechaCaducidad, numeroLote) {

    init {
        require(validarTemperatura(this.temperatura)) { "La temperatura de congelación no es aceptable" }
    }

    fun getTemperatura(): Int {
        return this.temperatura
    }
    fun setTemperatura(temperatura: Int) {
        this.temperatura = temperatura
    }

    private fun validarTemperatura(temperatura: Int): Boolean {
        return temperatura in -50..-18
    }

    override fun toString(): String {
        return super.toString() + ", Temperatura: ${this.temperatura}ºC"
    }
}