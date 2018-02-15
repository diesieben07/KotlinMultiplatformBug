package de.takeweiland.mptest

class TestImpl : Test {
    override fun <E : Any> doSomething(type: TypeWithParameter<E>) {
        println(type)
    }
}