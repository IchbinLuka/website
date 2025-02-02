package com.ichbinluka.components

import com.ichbinluka.*
import emotion.react.css
import react.FC
import react.dom.html.ReactHTML
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.p
import web.cssom.*

val Projects = FC {
    WorkProjects()

    FreeTimeProjects()
}

const val SESAM_ARTICLE_LINK =
    "https://www.telekom.com/en/blog/careers/article/deutsche-telekom-and-bielefeld-university-developing-solutions-for-digital-identities-1053432"

val WorkProjects = FC {
    SectionTitle {
        title = "Work & Study Projects"
    }

    div {
        css {
            fontSize = FontSize.large
            marginBottom = 10.px
        }
        +"""
            This section presents some of the projects I have worked on during my studies and work. 
            You can view additional documents, such as the source code, by hovering over the pictures with your mouse.
        """.trimIndent()
    }

    ProjectElement {
        title = "Bachelor Thesis"
        image = "images/bachelor_thesis_screenshot.png"

        +"""
            My Bachelor's thesis in which I evaluated the performance of multiple reinforcement learning algorithms in
            the 
        """.trimIndent()
        a {
            href = "https://gitlab.ub.uni-bielefeld.de/scs/cocosy/cooperative-cuisine"
            +"Cooperative Cuisine Environment"
        }
        +"""
            , similar to the game Overcooked,
            while incrementally increasing the complexity of the environment along various dimensions. 
            The source code of the bachelor thesis, the algorithms, and the trained weights of the models are available
            on the GitLab of the University of Bielefeld.
        """.trimIndent()

        interactionItems = listOf(
            InteractionItem(
                title = "PDF",
                link = "misc/bachelor_thesis.pdf",
                icon = "icons/pdf-icon.svg"
            ),
            SourceCodeInteractionItem(
                link = "https://gitlab.ub.uni-bielefeld.de/IchbinLuka/coop_cuisine_ba",
                host = SourceCodeHost.GITLAB,
            )
        )
    }

    ProjectElement {
        title = "SHARLY"
        image = "https://github.com/sharly-project/.github/raw/master/profile/logo.svg"
        +"""
            A Smart Home framework utilizing artificial intelligence for anomaly detection and 
            activity analysis. I am currently working on this project as a student assistant.
        """.trimIndent()

        interactionItems = listOf(
            InteractionItem(
                title = "GitHub Organization",
                link = "https://github.com/sharly-project",
                icon = "icons/github-mark-white.svg"
            )
        )
    }

    ProjectElement {
        title = "SESAM"
        image =
            "https://www.telekom.com/resource/image/1053434/landscape_ratio4x3/768/576/88f5400de646ef82eeb8c18bd1ea9f72/221D67CDF6B5657C692948FD635DF740/bi-20231120-hochschulkoop-sesam-artikel.jpg"
        +"""
            In 2023, as students, we had the task of developing a software called SESAM for access
            management in buildings as part of a cooperation between the University of Bielefeld and
            Deutsche Telekom. My team was one of the three winning teams.
            In this project, we used Java with Spring Boot and TypeScript with Vue.
        """.trimIndent()
        a {
            href = SESAM_ARTICLE_LINK
            +"Read more"
        }

        interactionItems = listOf(
            InteractionItem(
                title = "Blog Post",
                link = SESAM_ARTICLE_LINK,
                icon = "icons/earth.svg"
            )
        )
    }

    ProjectElement {
        title = "pya_agen"
        image = "images/pya_agen_screenshot.png"

        +"An extension for the Python library "
        a {
            href = "https://pypi.org/project/pya/"
            +"pya"
        }
        +"""
             that adds the concept of Audio Generators, which provide a simple and flexible way of generating audio signals.
            Pya_agen enables various ways of combining these generators, effectively
            allowing for the creation of complex trees of nodes that are lazily evaluated on demand. 
        """.trimIndent()

        interactionItems = listOf(
            SourceCodeInteractionItem(
                link = "https://gitlab.ub.uni-bielefeld.de/IchbinLuka/pya-agen",
                host = SourceCodeHost.GITLAB,
            )
        )
    }
}

val FreeTimeProjects = FC {
    SectionTitle {
        title = "Free Time Projects"
    }

    ProjectElement {
        title = "Tanks 3D"
        image = "images/tank_game_screenshot.png"

        interactionItems = listOf(
            PlayInteractionItem(TANK_GAME_URL)
        )

        +"""
            A multiplayer browser game in which you control a tank and try to destroy other tanks.
            It's built with Three.js and Kotlin/JS.
            The server is also written in Kotlin and uses Ktor.
            The source code is currently not public, however, you can play the game on my GitHub page.
        """.trimIndent()
    }

    ProjectElement {
        title = "raytracer.rs"
        image = "images/raytracer_screenshot.png"

        +"""
            A simple raytracer written in Rust.
            A Rust + WGSL implementation of Ray Tracing in One Weekend by Peter Shirley.
            The source code is available on GitHub.
        """.trimIndent()

        interactionItems = listOf(
            SourceCodeInteractionItem(RAYTRACER_SOURCE_CODE)
        )
    }

    ProjectElement {
        title = "Space Game (WIP)"
        image = "images/space_game_screenshot.png"
        p {
            +"""
            A small top down space shooter game where you need to defend space stations from enemy ships.
            The enemies can drop power-ups like shields, bombs, or turrets, which can help you in your fight.
            I am making this game using Rust and the Bevy game engine.
            """.trimIndent()
        }

        p {
            +"""
            This game also features an online leaderboard, where you can compete with others for the highest score.
            The hosting the leaderboard is written in Rust with 
            """.trimIndent()

            a {
                href = "https://rocket.rs/"
                +"Rocket"
            }
            +""".
            The source code of the leaderboard server is not available to not expose the anti-cheat mechanisms.
            """.trimMargin()
        }



        interactionItems = listOf(
            SourceCodeInteractionItem(SPACE_GAME_SOURCE_CODE),
            DownloadInteractionItem(SPACE_GAME_RELEASES),
            PlayInteractionItem(SPACE_GAME_URL),
        )
    }

    ProjectElement {
        title = "This Website"
        image = "images/website_screenshot.png"
        +"""
            This website is built with Kotlin/JS and React.
            The backend is also written in Kotlin and uses Ktor.
            The source code is available on GitHub.
        """.trimIndent()

        interactionItems = listOf(
            SourceCodeInteractionItem(WEBSITE_SOURCE_CODE_URL),
            InteractionItem(
                title = "Open",
                link = "/",
                icon = "icons/earth.svg"
            )
        )
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