package com.ichbinluka

import com.ichbinluka.components.Background
import com.ichbinluka.components.Content
import com.ichbinluka.components.Header
import emotion.react.css
import react.FC
import react.create
import react.dom.client.createRoot
import react.dom.html.ReactHTML.div
import web.cssom.Display
import web.cssom.Position
import web.dom.document

fun main() {
    val root = document.createElement("div")
    document.body.appendChild(root)

    createRoot(root)
        .render(App.create())
}

val App = FC {
    div {
        css {
            position = Position.relative
            display = Display.inlineBlock
        }
        Background()
        Header()
        Content()
    }
}