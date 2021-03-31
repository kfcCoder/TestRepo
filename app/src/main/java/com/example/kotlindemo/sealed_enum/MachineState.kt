package com.example.kotlindemo.sealed_enum

/**
 * represent a concrete set of 'values'
 */
enum class MachineState {
    START,
    SLEEP,
    RUNNING
}

fun main() {
    val machineState = MachineState.RUNNING
    checkMachineState(machineState)

}

fun checkMachineState(state: MachineState) {

    when(state) {
      MachineState.START -> { println("Machine is about to start") }
      MachineState.SLEEP -> { println("Machine is sleeping") }
      MachineState.RUNNING -> { println("Machine is running") }
    }
}
