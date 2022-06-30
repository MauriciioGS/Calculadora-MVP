package com.unam.calculadoramvp.presenter

import com.unam.calculadoramvp.interactors.OperationInteractorImpl
import com.unam.calculadoramvp.interfaces.OperationPresenter
import com.unam.calculadoramvp.interfaces.OperationView

class OperationPresenterImpl(
    private val opView : OperationView
) : OperationPresenter{

    private val opInteractor : OperationInteractorImpl = OperationInteractorImpl(this)

    override fun showResult(res: String) {
        opView.showResult(res)
    }

    override fun invalidOperation() {
        opView.invalidOperation()
    }

    override fun add(a: Int, b: Int) {
        opInteractor.add(a,b)
    }

    override fun sub(a: Int, b: Int) {
        opInteractor.sub(a,b)
    }

    override fun mult(a: Int, b: Int) {
        opInteractor.mult(a,b)
    }

    override fun div(a: Int, b: Int) {
        opInteractor.div(a,b)
    }
}