package de.takeweiland.mptest

interface Test {

    fun <E : Any> doSomething(type: TypeWithParameter<E>)

}