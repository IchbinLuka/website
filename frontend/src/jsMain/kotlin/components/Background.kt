package com.ichbinluka.components

import com.ichbinluka.util.cssProperties
import emotion.react.css
import react.FC
import react.PropsWithStyle
import react.dom.html.ReactHTML.div
import web.cssom.*

val Background = FC {
    div {
        css {
            width = 100.pct
            height = 100.pct
        }
        BackgroundCircles()

        BackgroundCircles {
            style = cssProperties {
                transform = scale(-1, -1)
                // Use minHeight here so the lower circles don't appear at the wrong position
                // when the page is still loading
                minHeight = 3000.px
            }
        }
    }
}

val BackgroundCircles = FC<PropsWithStyle> {
    div {
        css(ClassName("background")) {
            +it.style
        }

        for (delay in listOf(1, 50, 120)) {
            div {
                css(ClassName("dot")) {
                    animationDelay = (-delay).s
                }
            }
        }
    }
}