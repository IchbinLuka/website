package com.ichbinluka.components

import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
import web.cssom.*

external interface ClickToPlayOverlayProps : Props {
    var playLink: String?
    var githubLink: String?
}

val ClickToPlayOverlay = FC<ClickToPlayOverlayProps> {
    if (it.playLink == null && it.githubLink == null) {
        return@FC
    }

    div {
        className = ClassName("clickToPlayOverlay")

        if (it.playLink != null) {
            a {
                className = ClassName("overlayButton")
                href = it.playLink

                img {
                    src = "icons/play_arrow.svg"
                    alt = "Play"
                    css {
                        width = 20.px
                        height = 20.px
                    }
                }

                +"Play"
            }
        }

        if (it.githubLink != null) {
            a {
                href = it.githubLink

                className = ClassName("overlayButton")

                img {
                    src = "icons/github-mark-white.svg"
                    alt = "GitHub Logo"
                    css {
                        width = 20.px
                        height = 20.px
                    }
                }

                +"Source Code"
            }
        }
    }
}