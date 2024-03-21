package com.ichbinluka.components

import com.ichbinluka.CONTACT_EMAIL
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.p
import web.cssom.*

val AboutMe = FC {
    SectionTitle {
        title = "About Me"
    }
    div {
        css {
            fontSize = FontSize.large
            marginBottom = 50.px
        }
        p {
            +"""
                I am currently studying cognitive computer science at the University of Bielefeld.
                In my free time, I like to work on various projects, such as this website, or small browser games.
            """.trimIndent()
        }

        p {
            +"I also currently work as a student assistant at "
            a {
                href = "https://www.kognihome.de/"
                +"KogniHome"
            }
            +", where I am developing a mobile application for "
            a {
                href = "https://github.com/sharly-project"
                +"SHARLY"
            }
            +"."
        }



        h1 {
            +"Programming Languages / Technologies"
            css {
                fontWeight = FontWeight.normal
                marginTop = 40.px
            }
        }

        p {
            +"For my projects and at work, I mainly use the following programming languages and technologies:"
        }
        ProgrammingLangItem {
            text = "Kotlin + Ktor, Three.js, React, Compose Multiplatform"
            icon = "icons/kotlin-logo.svg"
        }
        ProgrammingLangItem {
            text = "Python"
            icon = "icons/python-logo.svg"
        }
        ProgrammingLangItem {
            text = "Rust + Bevy"
            icon = "icons/rust-logo.svg"
        }
        ProgrammingLangItem {
            text = "Dart + Flutter"
            icon = "icons/dart-logo.svg"
        }

        h1 {
            +"Contact"
            css {
                fontWeight = FontWeight.normal
                marginTop = 40.px
            }
        }
        p {
            +"You can reach me via email at "
            a {
                href = "mailto:contact@lukaborn.de"
                +CONTACT_EMAIL
            }
            +"."
        }

    }
}

external interface ProgrammingLangItemProps : Props {
    var text: String
    var icon: String
}

private val ProgrammingLangItem = FC<ProgrammingLangItemProps> {
    div {
        css {
            display = Display.flex
            flexDirection = FlexDirection.row
            alignItems = AlignItems.center
        }
        img {
            src = it.icon
            alt = it.text

            css {
                width = 20.px
                height = 20.px
                marginTop = 5.px
                marginBottom = 5.px
                marginRight = 10.px
            }
        }

        p {
            css {
                margin = 0.px
            }
            +it.text
        }
    }
}