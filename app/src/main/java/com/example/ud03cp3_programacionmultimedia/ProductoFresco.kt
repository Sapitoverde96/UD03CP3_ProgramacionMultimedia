package com.example.ud03cp3_programacionmultimedia

class ProductoFresco(
    private var fechaEnvasado: String,
    private var paisOrigen: String,
    fechaCaducidad: String,
    numeroLote: Int
    ) : Producto(fechaCaducidad, numeroLote) {

    init {
        require(validarFecha(this.fechaEnvasado)) { "La fecha de envasado no es válida" }
    }

    fun getFechaEnvasado(): String {
        return this.fechaEnvasado
    }
    fun getPaisOrigen(): String {
        return this.paisOrigen
    }
    fun setFechaEnvasado(fechaEnvasado: String) {
        this.fechaEnvasado = fechaEnvasado
    }
    fun setPaisOrigen(paisOrigen: String) {
        this.paisOrigen = paisOrigen
    }

    override fun toString(): String {
        return super.toString() + ", Fecha de envasado: ${this.fechaEnvasado}, País de origen: ${this.paisOrigen}"
    }
}