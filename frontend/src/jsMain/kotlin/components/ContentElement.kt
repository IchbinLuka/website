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

data class InteractionItem(
    val title: String,
    val link: String,
    val icon: String,
)

external interface ProjectElementProps : PropsWithChildren {
    var title: String
    var image: String
    var interactionItems: List<InteractionItem>
}

enum class SourceCodeHost(val icon: String) {
    GITHUB("icons/github-mark-white.svg"),
    GITLAB("icons/gitlab-logo.svg"),
}

fun SourceCodeInteractionItem(link: String, host: SourceCodeHost = SourceCodeHost.GITHUB) = InteractionItem(
    title = "Source Code",
    link = link,
    icon = host.icon,
)

fun PlayInteractionItem(link: String) = InteractionItem(
    title = "Play",
    link = link,
    icon = "icons/play_arrow.svg",
)

fun DownloadInteractionItem(link: String) = InteractionItem(
    title = "Download",
    link = link,
    icon = "icons/download.svg",
)


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
                interactionItems = it.interactionItems
            }

        }
        div {
            +it.children
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