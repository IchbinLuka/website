package com.ichbinluka.components

import com.ichbinluka.GITHUB_PROFILE_URL
import emotion.react.css
import js.core.n
import react.FC
import react.dom.html.ReactHTML
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.h2
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.header
import react.dom.html.ReactHTML.img
import react.dom.svg.ReactSVG.svg
import web.cssom.*

val Header = FC {
    header {
        className = ClassName("header")

        div {
            css {
                display = Display.flex
                flexDirection = FlexDirection.row
                justifyContent = JustifyContent.spaceBetween
                alignItems = AlignItems.center
                padding = 15.px
            }

            h1 {
                css {
                    fontWeight = FontWeight.normal
                }
                +"LUKA BORN"
            }

            a {
                href = GITHUB_PROFILE_URL
                img {
                    src = "icons/github-mark-white.svg"
                    alt = "Link to my GitHub profile"
                    css {
                        width = 50.px
                        height = 50.px
                    }
                }
            }
        }
    }
}