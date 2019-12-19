package codes.som.anthony.koffee.insns.sugar

import codes.som.anthony.koffee.insns.InstructionAssembly
import codes.som.anthony.koffee.insns.jvm.*
import kotlin.reflect.KFunction
import kotlin.reflect.jvm.javaMethod

fun InstructionAssembly.invokevirtual(kFunction: KFunction<*>) {
    val method = kFunction.javaMethod ?: error("Provided method does not have a Java implementation")
    return invokevirtual(method.declaringClass, method.name, method.returnType, *method.parameterTypes)
}

fun InstructionAssembly.invokestatic(kFunction: KFunction<*>) {
    val method = kFunction.javaMethod ?: error("Provided method does not have a Java implementation")
    return invokestatic(method.declaringClass, method.name, method.returnType, *method.parameterTypes)
}

fun InstructionAssembly.invokeinterface(kFunction: KFunction<*>) {
    val method = kFunction.javaMethod ?: error("Provided method does not have a Java implementation")
    return invokeinterface(method.declaringClass, method.name, method.returnType, *method.parameterTypes)
}

fun InstructionAssembly.invokespecial(kFunction: KFunction<*>) {
    val method = kFunction.javaMethod ?: error("Provided method does not have a Java implementation")
    return invokespecial(method.declaringClass, method.name, method.returnType, *method.parameterTypes)
}
