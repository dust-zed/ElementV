plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    implementation(projects.anvilannotation)
    api(libs.anvil.compiler.api)
    implementation(libs.anvil.compiler.utils)
    implementation(libs.dagger)
    implementation(libs.ksp.plugin)
}