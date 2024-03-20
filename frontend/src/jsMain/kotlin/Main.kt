package com.ichbinluka

import com.ichbinluka.components.Header
import com.ichbinluka.components.Background
import com.ichbinluka.components.Content
import com.ichbinluka.components.ContentElement
import emotion.react.css
import react.FC
import react.Props
import react.create
import react.dom.client.createRoot
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.h2
import react.dom.html.ReactHTML.p
import react.useState
import web.cssom.*
import web.dom.document

fun main() {
    println("Hello World!")
    val root = document.createElement("div")
    document.body.appendChild(root)

    createRoot(root)
        .render(App.create())
}

val App = FC {
    Background()
    Header()
    Content()
}

external interface TestProps : Props {
    var i: Int
}

val MyButton = FC<TestProps> {
    var count by useState(1)

    button {
        onClick = { count++ }
        +"Clicked $count times"
    }
}