package com.example.ud03cp3_programacionmultimedia

class ProductoRefrigerado(
    private var codigoOSA: Int,
    fechaCaducidad: String,
    numeroLote: Int
    ) : Producto(fechaCaducidad, numeroLote) {

    fun getCodigoOSA(): Int {
        return this.codigoOSA
    }
    fun setCodigoOSA(codigoOSA: Int) {
        this.codigoOSA = codigoOSA
    }

    override fun toString(): String {
        return super.toString() + ", Código OSA: ${this.codigoOSA}"
    }
}