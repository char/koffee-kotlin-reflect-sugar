# koffee-kotlin-reflect-sugar

Allows some sugar when using invoke{static,virtual,special,interface} instructions

```kotlin
// Assumed present at runtime of generated class
object MyOtherClass {
    @JvmStatic fun main(args: Array<String>) {
        /* Do stuff */
    }
}

fun generateClass(): ClassNode = assembleClass(public, "Main") {
    method(public + static, "main", void, Array<String>::class) {
        aload_0
        invokestatic(MyOtherClass::main)
        _return
    }
}
```
