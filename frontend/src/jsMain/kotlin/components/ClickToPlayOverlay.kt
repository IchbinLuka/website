package com.ichbinluka.components

import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
import web.cssom.ClassName
import web.cssom.px

external interface ClickToPlayOverlayProps : Props {
    var interactionItems: List<InteractionItem>?
}

val ClickToPlayOverlay = FC<ClickToPlayOverlayProps> {
    if (it.interactionItems?.isEmpty() != false) {
        return@FC
    }

    div {
        className = ClassName("clickToPlayOverlay")
        for (item in it.interactionItems ?: emptyList()) {
            a {
                href = item.link

                className = ClassName("overlayButton")

                img {
                    src = item.icon
                    alt = item.title
                    css {
                        width = 20.px
                        height = 20.px
                    }
                }

                +item.title
            }
        }
    }
}