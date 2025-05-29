plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    implementation(projects.anvilannotation)
    api(libs)
}