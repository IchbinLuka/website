package com.ichbinluka.components

import emotion.react.css
import react.FC
import react.dom.html.ReactHTML.div
import web.cssom.*

val Content = FC {
    div {
        css {
            display = Display.flex
            flexDirection = FlexDirection.column
            alignItems = AlignItems.center
            width = 100.pct
        }

        div {
            className = ClassName("contentContainer")

            AboutMe()
            Projects()
        }

    }


}