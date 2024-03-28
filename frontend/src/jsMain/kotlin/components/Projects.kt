package com.ichbinluka.components

import com.ichbinluka.GITHUB_PROFILE_URL
import com.ichbinluka.TANK_GAME_URL
import com.ichbinluka.WEBSITE_SOURCE_CODE_URL
import emotion.react.css
import react.FC
import react.dom.html.ReactHTML
import web.cssom.*

val Projects = FC {
    SectionTitle {
        title = "Free Time Projects"
    }

    ProjectElement {
        title = "Tanks 3D"
        openLink = TANK_GAME_URL
        image = "images/tank_game_screenshot.png"
        description = """
                    A multiplayer browser game where you control a tank and try to destroy other tanks.
                    It's built with Three.js and Kotlin/JS.
                    The server is also written in Kotlin and uses Ktor.
                    The source code is currently not public, however, you can play the game on my GitHub page.
                """.trimIndent()
    }

    ProjectElement {
        title = "raytracer.rs"
        image = "images/raytracer_screenshot.png"
        description = """
                    A simple raytracer written in Rust.
                    A Rust + WGSL implementation of Ray Tracing in One Weekend by Peter Shirley.
                    The source code is available on GitHub.
                """.trimIndent()
        sourceCodeLink = "https://github.com/IchbinLuka/raytracer.rs"
    }

    ProjectElement {
        title = "Space Game (WIP)"
        image = "images/space_game_screenshot.png"
        description = """
                    A small top down space shooter game where you need to defend space stations from enemy ships.
                    I am making this game using Rust and the Bevy game engine.
                    This game is not yet in a state where I can share it, but I'm working on it.
                """.trimIndent()
    }
    ProjectElement {
        title = "This Website"
        openLink = "/"
        sourceCodeLink = WEBSITE_SOURCE_CODE_URL
        image = "images/website_screenshot.png"
        description = """
                    This website is built with Kotlin/JS and React.
                    The backend is also written in Kotlin and uses Ktor.
                    The source code is available on GitHub.
                """.trimIndent()
    }


    ReactHTML.a {
        href = GITHUB_PROFILE_URL
        css(ClassName("normalTextLink")) {
            display = Display.flex
            flexDirection = FlexDirection.row
            alignItems = AlignItems.center
            justifyContent = JustifyContent.center
            padding = 30.px
        }

        ReactHTML.img {
            src = "icons/github-mark-white.svg"
            alt = "GitHub Logo"
            css {
                width = 50.px
                height = 50.px
                marginRight = 10.px
            }
        }

        ReactHTML.div {
            css {
                textDecoration = TextDecoration.solid
                color = Color("#fff")
                fontSize = FontSize.xxLarge
            }

            +"Other projects can be found on my GitHub"
        }
    }
}