package com.github.lunaklatzer.kipperintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.lunaklatzer.kipperintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
