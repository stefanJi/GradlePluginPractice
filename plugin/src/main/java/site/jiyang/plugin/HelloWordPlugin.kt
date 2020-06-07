package site.jiyang.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

class HelloWordPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.register("HelloWordDefault", HelloWordTask::class.java)
        project.tasks.register("HelloWordExtend", HelloWordTask::class.java) {
            it.hello = "hh"
            it.word = "aa"
        }
    }
}

open class HelloWordTask : DefaultTask() {

    @Input
    var hello: String = "hello"

    @Input
    var word: String = "word"

    @TaskAction
    fun run() {
        println("$hello,$word")
    }
}