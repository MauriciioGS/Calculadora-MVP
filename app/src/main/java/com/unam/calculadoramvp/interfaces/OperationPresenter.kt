package com.unam.calculadoramvp.interfaces

interface OperationPresenter {
    // View
    fun showResult(res : String)
    fun invalidOperation()
    // Model (Interactor)
    fun add(a : Int, b : Int)
    fun sub(a : Int, b : Int)
    fun mult(a : Int, b : Int)
    fun div(a : Int, b : Int)
}