package io.element.android.anvilannotations

import kotlin.reflect.KClass

/**
 * Add Node to the specified component graph.
 * Equivalent to the following declaration
 * @ContributesTo(Scope::class)
 * @Module
 * abstract class YourNodeModule {
 *  @Binds
 *  @IntoMap
 *  @NodeKey(YourNode::class)
 *  abstract fun bindYourNodeFactory(factory: YouNode.Factory): AssistedFactory<*>
 *}
 */

@Target(AnnotationTarget.CLASS)
annotation class ContributesNode(
    val scope: KClass<*>
)