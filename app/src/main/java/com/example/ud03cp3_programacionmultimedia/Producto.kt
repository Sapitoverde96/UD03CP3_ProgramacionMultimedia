package com.example.ud03cp3_programacionmultimedia

open class Producto(
    private var fechaCaducidad: String,
    private var numeroLote: Int
    ) {

    init {
        require(validarFecha(this.fechaCaducidad)) { "La fecha de caducidad no es válida" }
    }

    fun getFechaCaducidad(): String {
        return this.fechaCaducidad
    }
    fun getNumeroLote(): Int {
        return this.numeroLote
    }
    fun setFechaCaducidad(fechaCaducidad: String) {
        this.fechaCaducidad = fechaCaducidad
    }
    fun setNumeroLote(numeroLote: Int) {
        this.numeroLote = numeroLote
    }

    protected fun validarFecha(fechaCaducidad: String): Boolean {
        if (fechaCaducidad.matches(Regex("[0-9]{2}/[0-9]{2}/[0-9]{4}"))) {
            val fecha = fechaCaducidad.split("/")
            val dia = fecha[0].toInt()
            val mes = fecha[1].toInt()
            val ano = fecha[2].toInt()
            if (dia in 1..31 && mes in 1..12 && ano in 1..9999) {
                when (mes) {
                    1, 3, 5, 7, 8, 10, 12 -> return dia <= 31
                    4, 6, 9, 11 -> return dia <= 30
                    2 -> {
                        return if (ano % 4 == 0) {
                            dia <= 29
                        } else {
                            dia <= 28
                        }
                    }
                }
            }
        }
        return false
    }

    override fun toString(): String {
        return "Fecha de caducidad: ${this.fechaCaducidad}, Número de lote: ${this.numeroLote}"
    }
}