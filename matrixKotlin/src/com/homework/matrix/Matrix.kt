package com.homework.matrix

class Matrix {
    var m: Int
        private set
    var n: Int
        private set
    private var arr: Array<Array<ComplexNumber?>>

    constructor(n: Int, m: Int) {
        this.m = m
        this.n = n
        arr = Array(n) { arrayOfNulls<ComplexNumber>(m) }
        for (i in 0 until n) {
            for (j in 0 until m) {
                arr[i][j] = ComplexNumber()
            }
        }
    }

    constructor(arr: Array<Array<ComplexNumber>>) {
        m = arr.size
        n = arr[0].size
        this.arr = Array(m) { arrayOfNulls<ComplexNumber>(n) }
        for (i in 0 until n) {
            for (j in 0 until m) {
                this.arr[i][j] = ComplexNumber(arr[i][j].a, arr[i][j].b)
            }
        }
    }

    fun tranponir(): Matrix {
        val x = Matrix(n, m)
        for (i in 0 until n) {
            for (j in 0 until m) {
                x.setValue(arr[i][j], j, i)
            }
        }
        return x
    }

    operator fun plus(x: Matrix): Matrix {
        val tmp = Matrix(n, m)
        for (i in 0 until n) {
            for (j in 0 until m) {
                tmp.setValue(arr[i][j]!!.plus(x.arr[i][j]!!), i, j)
            }
        }
        return tmp
    }

    fun multip(arr: Matrix): Matrix {
        val tmp = Matrix(n, arr.m)
        for (i in 0 until n) {
            for (j in 0 until arr.m) {
                var x = ComplexNumber()
                for (k in 0 until arr.n) {
                    x = x.plus(this.arr[i][k]!!.multiply(arr.getValue(k, j)!!))
                }
                tmp.setValue(x, i, j)
            }
        }
        return tmp
    }

    fun getValue(i: Int, j: Int): ComplexNumber? {
        return arr[i][j]
    }

    fun setValue(x: ComplexNumber?, i: Int, j: Int) {
        arr[i][j]!!.setValue(x!!)
    }

    override fun toString(): String {
        val S = StringBuilder()
        for (i in 0 until n) {
            for (j in 0 until m) S.append(arr[i][j].toString()).append(" ")
            S.append('\n')
        }
        return S.toString()
    }
}