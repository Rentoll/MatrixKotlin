package com.homework.matrix

class ComplexNumber {
    var a: Double
    var b: Double

    constructor() {
        a = 0.0
        b = 0.0
    }

    constructor(a: Double) {
        this.a = a
        b = 0.0
    }

    constructor(a: Double, b: Double) {
        this.a = a
        this.b = b
    }

    operator fun plus(x: ComplexNumber): ComplexNumber {
        val a = a + x.a
        val b = b + x.b
        return ComplexNumber(a, b)
    }

    operator fun minus(x: ComplexNumber): ComplexNumber {
        val a = a - x.a
        val b = b - x.b
        return ComplexNumber(a, b)
    }

    fun multiply(x: ComplexNumber): ComplexNumber {
        val a = a * x.a - b * x.b
        val b = this.a * x.b + b * x.a
        return ComplexNumber(a, b)
    }

    fun abs(): Double {
        return Math.sqrt(a * a + b * b)
    }

    fun setValue(x: ComplexNumber) {
        a = x.a
        b = x.b
    }

    override fun toString(): String {
        return if (b != 0.0) a.toString() + "+" + b + "i" else a.toString() + ""
    }
}