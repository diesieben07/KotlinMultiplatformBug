package de.takeweiland.mptest

class TestImpl : Test {
    override fun doSomething(type: ExpectedType) {
        println(type)
    }
}