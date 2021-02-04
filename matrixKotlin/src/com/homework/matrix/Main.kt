package com.homework.matrix

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val x = Matrix(2, 2)
        val y = Matrix(2, 3)

        generateUsualMatrix(x)
        generateUsualMatrix(y)

        println("First matrix(x)")
        println(x)
        println("Second matrix(y)")
        println(y)
        println("Transpose matrix (x)")
        println(x.tranponir())
        println("x + x")
        println(x.plus(x))
        println("x * y")
        println(x.multip(y))
        println("With imaginary number")

        generateComplexMatrix(x)
        generateComplexMatrix(y)

        println("First matrix(x)")
        println(x)
        println("Second matrix(y)")
        println(y)
        println("Transpose matrix (x)")
        println(x.tranponir())
        println("y + y")
        println(y.plus(y))
        println("x * y")
        println(x.multip(y))
    }

    private fun generateUsualMatrix(x: Matrix) {
        for (i in 0 until x.n) {
            for (j in 0 until x.m) {
                x.setValue(
                    ComplexNumber(
                        (1 + (Math.random() * 10).toInt()).toDouble(),
                        0.0
                    ), i, j)
            }
        }
    }

    private fun generateComplexMatrix(x: Matrix) {
        for (i in 0 until x.n) {
            for (j in 0 until x.m) {
                x.setValue(
                    ComplexNumber(
                        (1 + (Math.random() * 10).toInt()).toDouble(),
                        (1 + (Math.random() * 10).toInt()).toDouble()
                    ), i, j
                )
            }
        }
    }
}