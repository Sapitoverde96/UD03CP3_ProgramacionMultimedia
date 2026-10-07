package com.example.ud03cp3_programacionmultimedia

fun main() {
    // Productos que compilan
    val productoFresco = ProductoFresco("01/01/2023", "España", "01/01/2024", 12345)
    val productoRefrigerado = ProductoRefrigerado(12345, "01/01/2024", 54321)
    val productoCongelado = ProductoCongelado(-20, "01/01/2025", 67890)

    // Productos que no compilan
    // val productoFresco = ProductoFresco("32/01/2023", "España", "01/01/2024", 12345)
    // val productoRefrigerado = ProductoRefrigerado(12345, "32/01/2024", 54321)
    // val productoCongelado = ProductoCongelado(-273, "01/01/2025", 67890)

    println(productoFresco)
    println(productoRefrigerado)
    println(productoCongelado)
}