package com.unam.calculadoramvp.interactors

import com.unam.calculadoramvp.interfaces.OperationInteractor
import com.unam.calculadoramvp.interfaces.OperationPresenter

class OperationInteractorImpl(
    private val opPresenter : OperationPresenter
) : OperationInteractor {

    private var res : Int = 0

    override fun add(a: Int, b: Int) {
        res = a.plus(b)
        opPresenter.showResult(res.toString())
    }

    override fun sub(a: Int, b: Int) {
        res = a.minus(b)
        opPresenter.showResult(res.toString())
    }

    override fun mult(a: Int, b: Int) {
        res = a.times(b)
        opPresenter.showResult(res.toString())
    }

    override fun div(a: Int, b: Int) {
        if (b != 0){
            res = a.div(b)
            opPresenter.showResult(res.toString())
        } else{
            opPresenter.invalidOperation()
        }
    }
}