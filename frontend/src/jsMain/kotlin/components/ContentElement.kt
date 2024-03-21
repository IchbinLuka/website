package com.ichbinluka.components

import emotion.react.css
import react.FC
import react.Props
import react.PropsWithChildren
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.img
import web.cssom.ClassName
import web.cssom.FontSize
import web.cssom.pct
import web.cssom.px

val ContentElement = FC<PropsWithChildren> {
    div {
        className = ClassName("contentElement")
        +it.children
    }
}

external interface ProjectElementProps : Props {
    var title: String
    var description: String
    var openLink: String?
    var sourceCodeLink: String?
    var image: String
}


val ProjectElement = FC<ProjectElementProps> {
    ContentElement {
        h1 {
            css { marginTop = 0.px }
            +it.title
        }

        div {
            css(ClassName("projectImage")) {
                width = 100.pct
            }

            img {
                src = it.image
                alt = it.title
                css(ClassName("projectImage")) {
                    width = 100.pct

                }
            }
            ClickToPlayOverlay {
                playLink = it.openLink
                githubLink = it.sourceCodeLink
            }

        }
        div {
            +it.description
        }
    }
}

external interface SectionTitleProps : Props {
    var title: String
}

val SectionTitle = FC<SectionTitleProps> {
    div {
        css {
            fontSize = FontSize.xxxLarge
            marginBottom = 20.px
            marginTop = 30.px
        }
        +it.title
    }
}