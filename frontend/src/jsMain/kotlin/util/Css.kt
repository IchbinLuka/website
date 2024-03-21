package com.ichbinluka.util

import react.CSSProperties

fun cssProperties(init: CSSProperties.() -> Unit): CSSProperties {
    val properties = object {}.unsafeCast<CSSProperties>()
    properties.init()
    return properties
}