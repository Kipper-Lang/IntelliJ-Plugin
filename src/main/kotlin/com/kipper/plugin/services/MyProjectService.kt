package com.kipper.plugin.services

import com.intellij.openapi.project.Project
import com.kipper.plugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
