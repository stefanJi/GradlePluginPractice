# HelloWordPlugin

A hello word project for implement gradle plugin.

> Reference: https://guides.gradle.org/implementing-gradle-plugins

## implement Project plugin

> Project: A term in gradle, represent root project and every sub-model project.

1. extends `org.gradle.api.Plugin<org.gradle.api.Project>`
2. implement tasks
    - ad-hoc task
    - enhanced task
3. register plugin
    1. create `resources/META-INF/gradle.plugins/<plugin-id>.properties` file
    2. write `implementation-class=<plugin-class>` to this file
4. publish plugin
    - publish to maven local: a good way to test your plugin in local
    - publish to maven remote


