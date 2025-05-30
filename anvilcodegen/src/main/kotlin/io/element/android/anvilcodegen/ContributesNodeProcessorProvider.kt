package io.element.android.anvilcodegen

import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider

class ContributesNodeProcessorProvider: SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
        val enableLogging = environment.options["enableLogging"]?.toBoolean() == true
        return ContributesNodeProcessor(
            logger = environment.logger,
            codeGenerator = environment.codeGenerator,
            config = ContributesNodeProcessor.Config(enableLogging = enableLogging),
        )
    }
}