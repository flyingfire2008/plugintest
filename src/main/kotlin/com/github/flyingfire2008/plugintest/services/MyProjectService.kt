package com.github.flyingfire2008.plugintest.services

import com.intellij.openapi.project.Project
import com.github.flyingfire2008.plugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
