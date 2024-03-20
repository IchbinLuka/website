package com.ichbinluka.components

import emotion.react.css
import react.FC
import react.dom.html.ReactHTML.div
import web.cssom.ClassName
import web.cssom.s

val Background = FC {
    div {
        className = ClassName("background")
        for (delay in listOf(1, 5, 10)) {
            div {
                css(ClassName("dot")) {
                    animationDelay = (-delay).s
                }
                +"test"
            }
        }
    }
}